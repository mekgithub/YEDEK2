package classandmethodsexample;

import java.util.Scanner;

public class HomeWorkTEST {

        public static void main(String[] args) {
            System.out.println("Toplama");
            System.out.println("100+200" +"="+toplama(100,200));
        }
        public static int toplama(int num1,int num2){
            int result=num1+num2;
            return result;
        }
        public static int carpma(int num1,int num2){
            int result=num1*num2;
            return result;
        }
        public static double bolme(int num1,int num2){
            double result=num1/num2;
            return result;
        }
    }