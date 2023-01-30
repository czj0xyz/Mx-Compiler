#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void print(char *s){
    printf("%s",s);
}

void println(char *s){
    printf("%s\n",s);
}

void printInt(int x){
    printf("%d",x);
}

void printlnInt(int x){
    printf("%d\n",x);
}

char* getString(){
    char* s = (char*)malloc(1<<8);
    scanf("%s",s);
    return s;
}

int getInt(){
    int x;
    scanf("%d",&x);
    return x;
}

char* toString(int x){
    char* s = (char*) malloc(1<<8);
    sprintf(s,"%d",x);
    return s;
}

int __str_length(char* s){
    return strlen(s);
}

char* __str_substring(char* s,int l,int r){
    char* ret = (char*) malloc(r-l+1);
    memcpy(ret,s+l,r-l+1);
    ret[r-l]='\0';
    return ret;
}

int __str_parseInt(char *s){
    int x;
    sscanf(s,"%d",&x);
    return x;
}

int __str_ord(char *s,int pos){
    return (int)s[pos];
}

char* __str_add(char *s,char *t){
    char *ret = (char*)malloc(strlen(s) + strlen(t) +1);
    strcpy(ret,s);
    strcat(ret,t);
    return ret;
}

unsigned char __str_slt(char* s1,char* s2){
    return strcmp(s1,s2)<0;
}

unsigned char __str_sle(char* s1,char* s2){
    return strcmp(s1,s2)<=0;
}

unsigned char __str_sgt(char* s1,char* s2){
    return strcmp(s1,s2)>0;
}

unsigned char __str_sge(char* s1,char* s2){
    return strcmp(s1,s2)>=0;
}

unsigned char __str_eq(char* s1,char* s2){
    return strcmp(s1,s2)==0;
}

unsigned char __str_ne(char* s1,char* s2){
    return strcmp(s1,s2)!=0;
}