package com.jetbrains;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return isEven(value);
    }

    public boolean isOdd(){
        return isOdd(value);
    }

    public boolean isPrime(){
        return isPrime(value);
    }

    public static boolean isEven(int value){
        return (value%2==0);
    }

    public static boolean isOdd(int value){
        return (value%2!=0);
    }

    public static boolean isPrime(int value){
        for (int i = 2;i<=value/2;i++){
            if(value%i==0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }

    public boolean equals(int Value){
        return this.value == Value;
    }

    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] chars){
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, chars.length - 1);
             i < chars.length; i++, j /= 10) {
            value += (chars[i]- 48) * j;
        }
        return value;
    }

    public static int parseInt(String str){
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, str.length() - 1);
             i < str.length(); i++, j /= 10) {
            value += (str.charAt(i)- 48) * j;
        }
        return value;
    }
}
