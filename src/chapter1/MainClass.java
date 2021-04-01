package chapter1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //for checking functions use ex(№)
        ex1();
    }

    public static void ex1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = in.nextInt();

        System.out.printf("as binary: %s\n", Integer.toBinaryString(number));
        System.out.printf("as octal: %s\n", Integer.toOctalString(number));
        System.out.printf("as hexadecimal: %S\n", Integer.toHexString(number));

        //print as a hexadecimal floating-point number
        System.out.printf("as hex f-point: %a\n", (float)number);
        //or
        System.out.println("as hex f-point: " + Float.toHexString((float)number));
    }

    public static void ex2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input an angle: ");
        int angle = in.nextInt();

        //with %
        if(angle < 0){
            angle = angle % 360 + 360;
        }
        angle = angle % 360;
        System.out.printf("Normalized angle: %d", angle);

        //with Math.floorMod()
        angle = Math.floorMod(angle, 360);
        System.out.printf("Normalized angle: %d", angle);
    }

    public static void ex3(){
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        int maxNumber;
        for(int i = 0; i < numbers.length; i++){
            System.out.printf("Input %d integer: ",i+1);
            numbers[i] = in.nextInt();
        }
        //with conditions only
        if(numbers[0] > numbers[1]){
            if(numbers[0] > numbers[2]){
                maxNumber = numbers[0];
            }
            else maxNumber = numbers[2];
        }
        else if(numbers[1] > numbers[2]){
            maxNumber = numbers[1];
        }
        else maxNumber = numbers[2];
        System.out.println(maxNumber);

        //with Math.max
        maxNumber = Math.max(Math.max(numbers[0],numbers[1]), numbers[2]);
        System.out.println(maxNumber);
    }

    public static void ex4(){

        System.out.println("Greatest positive double: " + Double.MAX_VALUE);
        System.out.println("Smallest positive double: " + Math.nextUp(0d));

    }

    public static void ex6(){
        BigInteger result = new BigInteger("1");

        int n = 100;
        for(int i = 1; i <= n; i++){
            BigInteger tmp = new BigInteger(String.valueOf(i));
            result = result.multiply(tmp);
        }
        System.out.println(result);

    }

    public static void ex13(){
        ArrayList<Integer> numbers = new ArrayList<>(49);
        ArrayList<Integer> lotteryCombination = new ArrayList<>(6);

        for (int i = 0; i < 49; i++) {
            numbers.add(i+1);
        }

        for (int i = 0; i < 6; i++) {
            int index = new Random().nextInt(49 - i);
            lotteryCombination.add(numbers.get(index));
            numbers.remove(index);
        }

        Collections.sort(lotteryCombination);
        System.out.println(lotteryCombination.toString());

    }

    //modified average
    public static void ex16(double ...params){
        double sum = 0;
        for (int i = 0; i < params.length; i++) {
            sum += params[i];
        }
        System.out.println(sum / params.length);
    }

}
