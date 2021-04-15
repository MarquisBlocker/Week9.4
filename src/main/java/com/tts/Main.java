package com.tts;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] fruitArray = {"Orange", "Grapes", "Apple"};
        int[] intArray;
        boolean boolArray;

        System.out.println(fruitArray[1]);
        System.out.println(fruitArray.length);

        System.out.println("==== Collections ====");

        List<String> stringList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        List<String> stringVector = new Vector<>();
        List<String> stringStack = new Stack<>();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");

        System.out.println("The element at index 0:" + stringList.get(0));
        stringList.remove(0);
        System.out.println("This is the size of my list:" + stringList.size());

        // this is completely remove all elements from your list
//        stringList.clear();

//        String[] names = {"Joe", "Mary", "Jose"};

        Collections.reverse(stringList);

        System.out.println("Here is my list reversed:" + stringList);

        System.out.println("==== String Conversion ====");

        String myString = "I really love ice cream";
        String[] strArr = myString.split("");

        List<String> splitList = new ArrayList<>();
        splitList = Arrays.asList(strArr);

        System.out.println(splitList);

        List<String> carList = Arrays.asList("BMW", "Honda", "Audi");
        Object[] carARR = carList.toArray();
        String carString = Arrays.toString(carARR);

        System.out.println(carString.replace("[", "")
        .replace("]", "")
        .replace(",", ""));

        HashMap<String, Integer> personMap = new HashMap<>();
        personMap.put("Mary", 37);
        personMap.put("Bob", 21);
        personMap.put("Susan", 63);
        System.out.println(personMap);
        System.out.println("This is the value associated with Mary:" + personMap.get("Mary"));
        System.out.println(personMap.keySet());

        for (String i : personMap.keySet()) {
            System.out.println("key:" + i + "\tvalue:" + personMap.get(i));
        }

        System.out.println("==== Iterating ====");

        List<String> fruitList = Arrays.asList("plum", "grape", "fiji Apple");

        for (String fruit : fruitList) {
            System.out.println("Here is one of my Fruits: " + fruit);
        }

//        fruitList.forEach((fruit) System.out.println(fruit));

        System.out.println("==== LinkedList ====");
        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        Queue<Integer> myQueue  = new LinkedList<>();
        // adds elements {5,6,7,8,9} to queue
        for(int i=5; i<10;i++){
            myQueue.add(i);
        }
        System.out.println("Elements of queue: " + myQueue);

        int removedHead = myQueue.remove();
        System.out.println("removed element of myQueue: " + removedHead);

        System.out.println(myQueue);

//        To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue: " + head);

        int size = myQueue.size();
        System.out.println("size of the queue: " + size);

        //Queue is Fifo (First in First Out)
        //Stacks is Lifo(Last in First out

        System.out.println("\n==== Stacks ====");

        Stack<Integer> myStack  = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack);

//        boolean empty =


        }
    }

