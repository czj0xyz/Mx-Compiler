package utility;

import java.io.FileOutputStream;
import java.io.IOException;

public class BuiltinFunctionASMPrinter {
    String builtin_s_as_literal ="""
        .file	"builtin.c"
        .option nopic
        .attribute arch, "rv32i2p0_m2p0_a2p0"
        .attribute unaligned_access, 0
        .attribute stack_align, 16
        .text
        .section	.rodata
        .align	2
.LC0:
        .string	"%s"
        .text
        .align	2
        .globl	print
        .type	print, @function
print:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        lw	a1,-20(s0)
        lui	a5,%hi(.LC0)
        addi	a0,a5,%lo(.LC0)
        call	printf
        nop
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	print, .-print
        .align	2
        .globl	println
        .type	println, @function
println:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        lw	a0,-20(s0)
        call	puts
        nop
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	println, .-println
        .section	.rodata
        .align	2
        .LC1:
        .string	"%d"
        .text
        .align	2
        .globl	printInt
        .type	printInt, @function
printInt:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        lw	a1,-20(s0)
        lui	a5,%hi(.LC1)
        addi	a0,a5,%lo(.LC1)
        call	printf
        nop
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	printInt, .-printInt
        .section	.rodata
        .align	2
        .LC2:
        .string	"%d\n"
        .text
        .align	2
        .globl	printlnInt
        .type	printlnInt, @function
printlnInt:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        lw	a1,-20(s0)
        lui	a5,%hi(.LC2)
        addi	a0,a5,%lo(.LC2)
        call	printf
        nop
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	printlnInt, .-printlnInt
        .align	2
        .globl	printlnIntPoint
        .type	printlnIntPoint, @function
printlnIntPoint:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        lw	a1,-20(s0)
        lui	a5,%hi(.LC2)
        addi	a0,a5,%lo(.LC2)
        call	printf
        nop
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	printlnIntPoint, .-printlnIntPoint
        .align	2
        .globl	getString
        .type	getString, @function
getString:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        li	a0,256
        call	malloc
        mv	a5,a0
        sw	a5,-20(s0)
        lw	a1,-20(s0)
        lui	a5,%hi(.LC0)
        addi	a0,a5,%lo(.LC0)
        call	scanf
        lw	a5,-20(s0)
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	getString, .-getString
        .align	2
        .globl	getInt
        .type	getInt, @function
getInt:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        addi	a5,s0,-20
        mv	a1,a5
        lui	a5,%hi(.LC1)
        addi	a0,a5,%lo(.LC1)
        call	scanf
        lw	a5,-20(s0)
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	getInt, .-getInt
        .align	2
        .globl	toString
        .type	toString, @function
toString:
        addi	sp,sp,-48
        sw	ra,44(sp)
        sw	s0,40(sp)
        addi	s0,sp,48
        sw	a0,-36(s0)
        li	a0,256
        call	malloc
        mv	a5,a0
        sw	a5,-20(s0)
        lw	a2,-36(s0)
        lui	a5,%hi(.LC1)
        addi	a1,a5,%lo(.LC1)
        lw	a0,-20(s0)
        call	sprintf
        lw	a5,-20(s0)
        mv	a0,a5
        lw	ra,44(sp)
        lw	s0,40(sp)
        addi	sp,sp,48
        jr	ra
        .size	toString, .-toString
        .align	2
        .globl	__str_length
        .type	__str_length, @function
__str_length:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        lw	a0,-20(s0)
        call	strlen
        mv	a5,a0
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_length, .-__str_length
        .align	2
        .globl	__str_substring
        .type	__str_substring, @function
__str_substring:
        addi	sp,sp,-48
        sw	ra,44(sp)
        sw	s0,40(sp)
        addi	s0,sp,48
        sw	a0,-36(s0)
        sw	a1,-40(s0)
        sw	a2,-44(s0)
        lw	a4,-44(s0)
        lw	a5,-40(s0)
        sub	a5,a4,a5
        addi	a5,a5,1
        mv	a0,a5
        call	malloc
        mv	a5,a0
        sw	a5,-20(s0)
        lw	a5,-40(s0)
        lw	a4,-36(s0)
        add	a3,a4,a5
        lw	a4,-44(s0)
        lw	a5,-40(s0)
        sub	a5,a4,a5
        addi	a5,a5,1
        mv	a2,a5
        mv	a1,a3
        lw	a0,-20(s0)
        call	memcpy
        lw	a4,-44(s0)
        lw	a5,-40(s0)
        sub	a5,a4,a5
        mv	a4,a5
        lw	a5,-20(s0)
        add	a5,a5,a4
        sb	zero,0(a5)
        lw	a5,-20(s0)
        mv	a0,a5
        lw	ra,44(sp)
        lw	s0,40(sp)
        addi	sp,sp,48
        jr	ra
        .size	__str_substring, .-__str_substring
        .align	2
        .globl	__str_parseInt
        .type	__str_parseInt, @function
__str_parseInt:
        addi	sp,sp,-48
        sw	ra,44(sp)
        sw	s0,40(sp)
        addi	s0,sp,48
        sw	a0,-36(s0)
        addi	a5,s0,-20
        mv	a2,a5
        lui	a5,%hi(.LC1)
        addi	a1,a5,%lo(.LC1)
        lw	a0,-36(s0)
        call	sscanf
        lw	a5,-20(s0)
        mv	a0,a5
        lw	ra,44(sp)
        lw	s0,40(sp)
        addi	sp,sp,48
        jr	ra
        .size	__str_parseInt, .-__str_parseInt
        .align	2
        .globl	__str_ord
        .type	__str_ord, @function
__str_ord:
        addi	sp,sp,-32
        sw	s0,28(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a5,-24(s0)
        lw	a4,-20(s0)
        add	a5,a4,a5
        lbu	a5,0(a5)
        mv	a0,a5
        lw	s0,28(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_ord, .-__str_ord
        .align	2
        .globl	__str_add
        .type	__str_add, @function
__str_add:
        addi	sp,sp,-48
        sw	ra,44(sp)
        sw	s0,40(sp)
        sw	s1,36(sp)
        addi	s0,sp,48
        sw	a0,-36(s0)
        sw	a1,-40(s0)
        lw	a0,-36(s0)
        call	strlen
        mv	s1,a0
        lw	a0,-40(s0)
        call	strlen
        mv	a5,a0
        add	a5,s1,a5
        addi	a5,a5,1
        mv	a0,a5
        call	malloc
        mv	a5,a0
        sw	a5,-20(s0)
        lw	a1,-36(s0)
        lw	a0,-20(s0)
        call	strcpy
        lw	a1,-40(s0)
        lw	a0,-20(s0)
        call	strcat
        lw	a5,-20(s0)
        mv	a0,a5
        lw	ra,44(sp)
        lw	s0,40(sp)
        lw	s1,36(sp)
        addi	sp,sp,48
        jr	ra
        .size	__str_add, .-__str_add
        .align	2
        .globl	__str_slt
        .type	__str_slt, @function
__str_slt:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a1,-24(s0)
        lw	a0,-20(s0)
        call	strcmp
        mv	a5,a0
        srli	a5,a5,31
        andi	a5,a5,0xff
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_slt, .-__str_slt
        .align	2
        .globl	__str_sle
        .type	__str_sle, @function
__str_sle:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a1,-24(s0)
        lw	a0,-20(s0)
        call	strcmp
        mv	a5,a0
        slti	a5,a5,1
        andi	a5,a5,0xff
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_sle, .-__str_sle
        .align	2
        .globl	__str_sgt
        .type	__str_sgt, @function
__str_sgt:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a1,-24(s0)
        lw	a0,-20(s0)
        call	strcmp
        mv	a5,a0
        sgt	a5,a5,zero
        andi	a5,a5,0xff
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_sgt, .-__str_sgt
        .align	2
        .globl	__str_sge
        .type	__str_sge, @function
__str_sge:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a1,-24(s0)
        lw	a0,-20(s0)
        call	strcmp
        mv	a5,a0
        not	a5,a5
        srli	a5,a5,31
        andi	a5,a5,0xff
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_sge, .-__str_sge
        .align	2
        .globl	__str_eq
        .type	__str_eq, @function
__str_eq:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a1,-24(s0)
        lw	a0,-20(s0)
        call	strcmp
        mv	a5,a0
        seqz	a5,a5
        andi	a5,a5,0xff
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_eq, .-__str_eq
        .align	2
        .globl	__str_ne
        .type	__str_ne, @function
__str_ne:
        addi	sp,sp,-32
        sw	ra,28(sp)
        sw	s0,24(sp)
        addi	s0,sp,32
        sw	a0,-20(s0)
        sw	a1,-24(s0)
        lw	a1,-24(s0)
        lw	a0,-20(s0)
        call	strcmp
        mv	a5,a0
        snez	a5,a5
        andi	a5,a5,0xff
        mv	a0,a5
        lw	ra,28(sp)
        lw	s0,24(sp)
        addi	sp,sp,32
        jr	ra
        .size	__str_ne, .-__str_ne
        .ident	"GCC: (GNU) 10.1.0"
""";
    public BuiltinFunctionASMPrinter(String dst) throws IOException {
        FileOutputStream out = new FileOutputStream(dst);
        out.write(builtin_s_as_literal.getBytes());
    }
}