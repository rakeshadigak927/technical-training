#include<stdio.h>
#include<stdbool.h>

enum boolean {false, true};

int main()
{
    bool status = true;
    enum boolean f = false;

    printf("Status: %i\n", status);
    printf("False value: %i\n", f);

    //Dont use %d for sizeof() function use llu or zu
    printf("size of enum :%llu\n", sizeof(f));
    printf("size of bool :%zu\n", sizeof(f));

    return 0;
}
