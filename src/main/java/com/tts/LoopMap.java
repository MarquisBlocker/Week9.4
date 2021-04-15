package com.tts;

import java.util.*;
import java.util.Scanner;

public class LoopMap {
    public static void main(String[] args) {


            int[] a = new int[5];
            int i = 0;

            Scanner in = new Scanner(System.in);
            while (i < 5) {
                System.out.println("Enter an integer between 1 and 100");
                a[i] = in.nextInt();
                if (a[i] >= 1 && a[i] <= 100) {
                    i++;
                    System.out.println("You entered integer " + a[i - 1]);
                    System.out.println(Arrays.toString(a));

//                  MATH FUNCTIONS
                    int sum = Arrays.stream(a).sum();
                    System.out.println("The sum is: " + Arrays.stream(a).sum());
                    int min = Arrays.stream(a)
                            .min()
                            .getAsInt();
                    System.out.println("The minimum is: " + Arrays.stream(a)
                            .min()
                            .getAsInt());
                    int max = Arrays.stream(a)
                            .max()
                            .getAsInt();
                    System.out.println("The maximum is: " + Arrays.stream(a)
                            .max()
                            .getAsInt());


                    int productValue = 1;
                    for (int i = 0; i < list.size(); i++){
                        productValue = productValue * list.get(i);

                    }
                    System.out.println("Your total product Value :" + productValue);



                }
            }

    }










//        {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter a number.");
//            int numOne = Integer.parseInt(scanner.next());
//            System.out.println("Please enter a second number.");
//            int numTwo = Integer.parseInt(scanner.next());
//            System.out.println("Please enter a third number.");
//            int numThree = Integer.parseInt(scanner.next());
//            System.out.println("Please enter a fourth number.");
//            int numFour = Integer.parseInt(scanner.next());
//            System.out.println("Please enter a fifth number.");
//            int numFive = Integer.parseInt(scanner.next());
//
//            List<Integer> intList = new ArrayList<>();
//
//            intList.add(numOne);
//            intList.add(numTwo);
//            intList.add(numThree);
//            intList.add(numFour);
//            intList.add(numFive);
//
//            System.out.println(intList);
//
//        }


    }
