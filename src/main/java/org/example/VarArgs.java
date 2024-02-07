package org.example;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,7);
        fun(1,2,3,4,5,6,7,8,9,10);

    }
    static void fun(int a , int b){
        System.out.println(a+b);
    }
    static void fun(int ...v){ ////// variable Argument or varArgs
        int sum = 0;
        for (int x: v) {
            sum+= x;
        }
        System.out.println(sum);
    }
}
