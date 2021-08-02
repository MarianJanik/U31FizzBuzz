package com.engeto.examples;

public class Main {
    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";
    static final String FIZZBUZZ = "fizzbuzz";
    static final String ENDLINE = "\n";

    public static void main(String[] args) {
        final int DIVISOR1 = 3;
        final int DIVISOR2 = 5;
//        MyFizzBuzz(DIVISOR1, DIVISOR2); // 1 000 000 - 10s
        MyFizzBuzz2(DIVISOR1, DIVISOR2); // 10 000 000 - 8s
//        MyFizzBuzz3(DIVISOR1, DIVISOR2); // 100 000 - 8s
//        System.out.println(fizzBuzzAlternativeSpeedNoOutput()); // 10 000 000 - 8s
    }
    public static void MyFizzBuzz(int divisor1, int divisor2){
        for (long i = 1; i <= 1000000; i++) {
            if (((i) % divisor1 == 0) && ((i) % divisor2 == 0)) System.out.println("FizzBuzz");
            else if ((i) % divisor1 == 0) System.out.println("Fizz");
            else if ((i) % divisor2 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    public static void MyFizzBuzz2(int divisor1, int divisor2){
        StringBuilder output = new StringBuilder();
        for (long i = 1; i <= 10000000; i++) {
            if (((i) % divisor1 == 0) && ((i) % divisor2 == 0)) output.append("FizzBuzz\n");
            else if ((i) % divisor1 == 0) output.append("Fizz\n");
            else if ((i) % divisor2 == 0) output.append("Buzz\n");
            else output.append(i+"\n");
        }
        System.out.println(output);
    }
    public static void MyFizzBuzz3(int divisor1, int divisor2){
        String finalResult="",result;
        for (long i = 1; i <= 100000; i++) {
            if (((i) % divisor1 == 0) && ((i) % divisor2 == 0)) result="FizzBuzz\n";
            else if ((i) % divisor1 == 0) result="Fizz\n";
            else if ((i) % divisor2 == 0) result="Buzz\n";
            else result=i+"\n";
            finalResult+=result;
        }
        System.out.println(finalResult);
    }
    public static String fizzBuzzAlternativeSpeedNoOutput() {
        StringBuilder output = new StringBuilder();
        final String[] texts = { "", FIZZ, BUZZ, FIZZBUZZ };
        int indexOfText;
        for (int i = 1; i <= 10000000; i++) {
            indexOfText = 0;
            if (i % 3 == 0) indexOfText++;
            if (i % 5 == 0) {
                indexOfText++;
                indexOfText++;
            }
            if (indexOfText == 0) output.append(i);
            else output.append(texts[indexOfText]);
            output.append(ENDLINE);
        }
        return output.toString();
    }
}
