package com.jetbrains;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	    // TODO write your code here
        //MyInteger_main();
        //MyPoint_main();
        //Circle2D();
        //MyRectangle2D();
        //ten_seventeen();
        ten_nineteen();
    }

    //TODO test 10.3
    public static void MyInteger_main(){
        int[] values = {5,6,7,8,9};

        // Test isEven(int), isOdd(int), and isPrime(int)
        System.out.println("\nTest if values are even using isEven(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " " + MyInteger.isEven(values[i]) + ", ");
        }

        System.out.println("");

        System.out.println("\nTest if values are even using isOdd(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " " + MyInteger.isOdd(values[i]) + ", ");
        }

        System.out.println("");

        System.out.println("\nTest if values are even using isPrime(int):");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " " + MyInteger.isPrime(values[i]) + ", ");
        }

        System.out.println("");

        // Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
        System.out.println("\nTest if values are even using isEven():");
        for (int i = 0;i< values.length;i++){
            MyInteger value = new MyInteger(values[i]);
            System.out.print(value.getValue() + " " + value.isEven() + ", ");
        }

        System.out.println("");

        System.out.println("\nTest if values are even using isOdd():");
        for (int i = 0;i< values.length;i++){
            MyInteger value = new MyInteger(values[i]);
            System.out.print(value.getValue() + " " + value.isOdd() + ", ");
        }

        System.out.println("");

        System.out.println("\nTest if values are even using isPrime():");
        for (int i = 0;i< values.length;i++){
            MyInteger value = new MyInteger(values[i]);
            System.out.print(value.getValue() + " " + value.isPrime() + ", ");
        }

        // Test isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
        System.out.println("\nTest if values are even using isEven(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.print(value.getValue() + " " + MyInteger.isEven(value) + ", ");
        }

        System.out.println("");

        System.out.println("\nTest if values are odd using isOdd(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.print(value.getValue() + " " + MyInteger.isOdd(value) + ", ");
        }

        System.out.println("");

        System.out.println("\nTest if values are prime using isPrime(MyInteger):");
        for (int i = 0; i < values.length; i++) {
            // Create a MyInteger
            MyInteger value = new MyInteger(values[i]);
            System.out.print(value.getValue() + " " + MyInteger.isPrime(value)+",");
        }

        System.out.println("");

        //test equals(int) and equals(MyInteger)
        int[] values2 = {5,9,7};

        MyInteger value = new MyInteger(9);
        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value:");
        for (int i=0;i< values2.length;i++)
            System.out.print(values2[i] + " " + value.equals(values2[i]) + ", ");

        System.out.println("");

        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value:");
        for (int i=0 ; i< values2.length ; i++){
            MyInteger myInteger = new MyInteger(values2[i]);
            System.out.print(values2[i] + " " + value.equals(values2[i]) + ", ");
        }

        // Test parseInt(char[]) and parseInt(String)
        System.out.println("\nTest parseInt(char[]) and parseInt(String):");
        char[] chars = {'5','7','9'};
        String str = "658";

        System.out.print("\'");
        for (int i =0; i< chars.length ; i++){
            System.out.print(chars[i] + "");
        }
        System.out.println("\' + \"" + str + "\" = " +
                (MyInteger.parseInt(chars) +
                        MyInteger.parseInt(str)));
    }

    //TODO test 10.4
    public static void MyPoint_main(){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10,30.5);

        System.out.println("The distance between (" + p1.getX() + " , " + p1.getY() + ") and ("
                           + p2.getX() + " , " + p2.getY() + ") is: " + p1.distance(p2));
    }

    //TODO test 10.11
    public static void Circle2D(){
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("Is the point is inside the circle? "
                            + c1.contains(3,3));
        System.out.println("Is the circle is in the other circle? "
                            + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Is the circle overlaps with another circle? "
                            + c1.overlaps(new Circle2D(3, 5, 2.3)));

    }

    //TODO test 10.13
    public static void MyRectangle2D(){
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("\nRectangle:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println((r1.contains(3,3)? "Contains" : "Does not contain")
                                        + " the point (3, 3).");
        System.out.println((r1.contains(new MyRectangle2D(4, 5, 10.5, 4.9)) ?
                            "Contains" : "Does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");
        System.out.println(
                (r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "Overlaps" :
                        "Does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");
    }

    //TODO 10.17
    public static void ten_seventeen(){
        BigInteger i = new BigInteger(Long.MAX_VALUE + "");
        BigInteger end = i.add(new BigInteger("10"));

        for (i = new BigInteger(Long.MAX_VALUE + "");
                i.compareTo(end)<=0;
                i= i.add(BigInteger.ONE)){
            System.out.println(i.multiply(i));
        }
    }

    //TODO 10.19
    public static void ten_nineteen(){
        System.out.println("\tp\t\t2^p - 1");
        System.out.println("---------------------");

        for (BigInteger p = new BigInteger("2");
            p.compareTo(new BigInteger("100"))<=0;
            p = p.add(BigInteger.ONE)){

            if (isPrime(p)){
                System.out.printf("%-3d",p);
                System.out.println("       " + mersennePrime(p));
            }
        }
    }

    public static BigInteger mersennePrime(BigInteger n){
        BigInteger two = new BigInteger("2");
        BigInteger x = new BigInteger("2");

        for (BigInteger i = BigInteger.ONE; i.compareTo(n)<0;i = i.add(BigInteger.ONE)){
            x = x.multiply(two);
        }
        return x.subtract(BigInteger.ONE);
    }

    public static boolean isPrime(BigInteger n){
        for (BigInteger d = new BigInteger("2");
            d.compareTo(n.divide(new BigInteger("2")))<=0;
            d = d.add(BigInteger.ONE)){

            if(n.remainder(d).compareTo(new BigInteger("0"))==0)
                return false;
        }
        return true;
    }
}
