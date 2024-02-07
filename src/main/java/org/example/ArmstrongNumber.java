package org.example;


public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmNumber(370);
    }
    public static void ArmNumber(Integer num){
        int original =num;
        int calculated=0;
        String str = Integer.toString(num);
        while(num>0){
            int rem = num%10;
            int a=1;
            for (int i = 0; i <  str.length(); i++) {
                a *=rem;
            }
            calculated+=a;
            num= num/10;
        }
        if(original == calculated) {
            System.out.println("this is an ArmStrong Number");
        }else{
            System.out.println("this is not an ArmStrong Number");
        }
    }
}
