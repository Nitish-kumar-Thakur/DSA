package org.example;

import java.util.Arrays;

public class RepetDigitInNumber {
    public static void main(String[] args) {
        RepetDigitInNumber re= new RepetDigitInNumber();
//        re.reverseNum(12356);
        //System.out.println(re.reverseNum(123567));
        int num[] ={1,2,3};
        int value = 5;
        re.ValueRfrence(num,value);
        System.out.println(Arrays.toString(num)); // refrence varaible or object can be manupliate orignal one
        System.out.println(value); // primitive variable cannot be manupliated  orignal one



    }
    public void ValueRfrence(int a[], int b){
        a[0] = 15;
        b = 20;
    }
    public int countNum(int num, int check){
        int count= 0;
        while(num>0){
            int rem= num%10;
            if(rem == check){
                count++;
            }
            num = num/10;

        }
        return count;
    }
    public int reverseNum(int num){

        int count =0;
        while(num>0){
            int rem = num%10;
            count = count*10+rem;
            num= num/10;

        }
        return count;
    }
}