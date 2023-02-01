package utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BuiltinFunctionASMPrinter {
    String builtin_s_as_literal ="""
    .file	"builtin.c"
    .option nopic
    .attribute arch, "rv32i2p0_m2p0_a2p0"
    .attribute unaligned_access, 0
    .attribute stack_align, 16
    .text
    .section	.rodata.str1.4,"aMS",@progbits,1
    .align	2
.LC0:
    .string	"%s"
    .text
    .align	2
    .globl	print
    .type	print, @function
print:
    mv	a1,a0
    lui	a0,%hi(.LC0)
    addi	a0,a0,%lo(.LC0)
    tail	printf
    .size	print, .-print
    .align	2
    .globl	println
    .type	println, @function
println:
    tail	puts
    .size	println, .-println
    .section	.rodata.str1.4
    .align	2
.LC1:
    .string	"%d"
    .text
    .align	2
    .globl	printInt
    .type	printInt, @function
printInt:
    mv	a1,a0
    lui	a0,%hi(.LC1)
    addi	a0,a0,%lo(.LC1)
    tail	printf
    .size	printInt, .-printInt
    .section	.rodata.str1.4
    .align	2
.LC2:
    .string	"%d\\n"
    .text
    .align	2
    .globl	printlnInt
    .type	printlnInt, @function
printlnInt:
    mv	a1,a0
    lui	a0,%hi(.LC2)
    addi	a0,a0,%lo(.LC2)
    tail	printf
    .size	printlnInt, .-printlnInt
    .align	2
    .globl	getString
    .type	getString, @function
getString:
    addi	sp,sp,-16
    li	a0,256
    sw	ra,12(sp)
    sw	s0,8(sp)
    call	malloc
    mv	s0,a0
    mv	a1,a0
    lui	a0,%hi(.LC0)
    addi	a0,a0,%lo(.LC0)
    call	scanf
    lw	ra,12(sp)
    mv	a0,s0
    lw	s0,8(sp)
    addi	sp,sp,16
    jr	ra
    .size	getString, .-getString
    .align	2
    .globl	getInt
    .type	getInt, @function
getInt:
    addi	sp,sp,-32
    lui	a0,%hi(.LC1)
    addi	a1,sp,12
    addi	a0,a0,%lo(.LC1)
    sw	ra,28(sp)
    call	scanf
    lw	ra,28(sp)
    lw	a0,12(sp)
    addi	sp,sp,32
    jr	ra
    .size	getInt, .-getInt
    .align	2
    .globl	toString
    .type	toString, @function
toString:
    addi	sp,sp,-16
    sw	s1,4(sp)
    mv	s1,a0
    li	a0,256
    sw	ra,12(sp)
    sw	s0,8(sp)
    call	malloc
    lui	a1,%hi(.LC1)
    mv	a2,s1
    addi	a1,a1,%lo(.LC1)
    mv	s0,a0
    call	sprintf
    lw	ra,12(sp)
    mv	a0,s0
    lw	s0,8(sp)
    lw	s1,4(sp)
    addi	sp,sp,16
    jr	ra
    .size	toString, .-toString
    .align	2
    .globl	__str_length
    .type	__str_length, @function
__str_length:
    tail	strlen
    .size	__str_length, .-__str_length
    .align	2
    .globl	__str_substring
    .type	__str_substring, @function
__str_substring:
    addi	sp,sp,-32
    sw	s0,24(sp)
    sub	s0,a2,a1
    sw	s4,8(sp)
    addi	s4,s0,1
    sw	s3,12(sp)
    mv	s3,a0
    mv	a0,s4
    sw	ra,28(sp)
    sw	s1,20(sp)
    sw	s2,16(sp)
    mv	s2,a1
    call	malloc
    mv	s1,a0
    add	a1,s3,s2
    add	s0,s1,s0
    mv	a2,s4
    call	memcpy
    sb	zero,0(s0)
    lw	ra,28(sp)
    lw	s0,24(sp)
    lw	s2,16(sp)
    lw	s3,12(sp)
    lw	s4,8(sp)
    mv	a0,s1
    lw	s1,20(sp)
    addi	sp,sp,32
    jr	ra
    .size	__str_substring, .-__str_substring
    .align	2
    .globl	__str_parseInt
    .type	__str_parseInt, @function
__str_parseInt:
    addi	sp,sp,-32
    lui	a1,%hi(.LC1)
    addi	a2,sp,12
    addi	a1,a1,%lo(.LC1)
    sw	ra,28(sp)
    call	sscanf
    lw	ra,28(sp)
    lw	a0,12(sp)
    addi	sp,sp,32
    jr	ra
    .size	__str_parseInt, .-__str_parseInt
    .align	2
    .globl	__str_ord
    .type	__str_ord, @function
__str_ord:
    add	a0,a0,a1
    lbu	a0,0(a0)
    ret
    .size	__str_ord, .-__str_ord
    .align	2
    .globl	__str_add
    .type	__str_add, @function
__str_add:
    addi	sp,sp,-32
    sw	ra,28(sp)
    sw	s0,24(sp)
    sw	s1,20(sp)
    sw	s2,16(sp)
    sw	s3,12(sp)
    sw	s4,8(sp)
    mv	s2,a1
    mv	s4,a0
    call	strlen
    mv	s0,a0
    mv	a0,s2
    call	strlen
    mv	s3,a0
    add	a0,s0,a0
    addi	a0,a0,1
    call	malloc
    mv	a2,s0
    mv	a1,s4
    mv	s1,a0
    call	memcpy
    add	a0,s1,s0
    addi	a2,s3,1
    mv	a1,s2
    call	memcpy
    lw	ra,28(sp)
    lw	s0,24(sp)
    lw	s2,16(sp)
    lw	s3,12(sp)
    lw	s4,8(sp)
    mv	a0,s1
    lw	s1,20(sp)
    addi	sp,sp,32
    jr	ra
    .size	__str_add, .-__str_add
    .align	2
    .globl	__str_slt
    .type	__str_slt, @function
__str_slt:
    addi	sp,sp,-16
    sw	ra,12(sp)
    call	strcmp
    lw	ra,12(sp)
    srli	a0,a0,31
    addi	sp,sp,16
    jr	ra
    .size	__str_slt, .-__str_slt
    .align	2
    .globl	__str_sle
    .type	__str_sle, @function
__str_sle:
    addi	sp,sp,-16
    sw	ra,12(sp)
    call	strcmp
    lw	ra,12(sp)
    slti	a0,a0,1
    addi	sp,sp,16
    jr	ra
    .size	__str_sle, .-__str_sle
    .align	2
    .globl	__str_sgt
    .type	__str_sgt, @function
__str_sgt:
    addi	sp,sp,-16
    sw	ra,12(sp)
    call	strcmp
    lw	ra,12(sp)
    sgt	a0,a0,zero
    addi	sp,sp,16
    jr	ra
    .size	__str_sgt, .-__str_sgt
    .align	2
    .globl	__str_sge
    .type	__str_sge, @function
__str_sge:
    addi	sp,sp,-16
    sw	ra,12(sp)
    call	strcmp
    lw	ra,12(sp)
    not	a0,a0
    srli	a0,a0,31
    addi	sp,sp,16
    jr	ra
    .size	__str_sge, .-__str_sge
    .align	2
    .globl	__str_eq
    .type	__str_eq, @function
__str_eq:
    addi	sp,sp,-16
    sw	ra,12(sp)
    call	strcmp
    lw	ra,12(sp)
    seqz	a0,a0
    addi	sp,sp,16
    jr	ra
    .size	__str_eq, .-__str_eq
    .align	2
    .globl	__str_ne
    .type	__str_ne, @function
__str_ne:
    addi	sp,sp,-16
    sw	ra,12(sp)
    call	strcmp
    lw	ra,12(sp)
    snez	a0,a0
    addi	sp,sp,16
    jr	ra
    .size	__str_ne, .-__str_ne
    .ident	"GCC: (GNU) 10.1.0"

""";
    public BuiltinFunctionASMPrinter(String fileName) throws IOException {
        FileOutputStream out = new FileOutputStream(fileName);
        out.write(builtin_s_as_literal.getBytes());
        out.close();
    }

    public BuiltinFunctionASMPrinter(FileOutputStream  out) throws IOException {
        out.write(builtin_s_as_literal.getBytes());
    }
}