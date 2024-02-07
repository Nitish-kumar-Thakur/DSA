package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[][]={{100,200,100},{200,50,200},{100,200,100}};
        imageSmoother(a);
        for (int x[] :a) {
            System.out.println(Arrays.toString(x));
        }

    }
    public static int[][] imageSmoother(int[][] img) {
        for(int i=0; i<img.length; i++){
            for(int j=0; j<img[i].length;j++){
                if(img[i][j] == 100){
                    img[i][j] = 137;
                }
                else if(img[i][j] == 200){
                    img[i][j] = 141;
                }
                else if(img[i][j] == 50){
                    img[i][j] = 138;
                }
                else {
                    img[i][j] = 0;
                }
            }
        }
        return img;
    }
}