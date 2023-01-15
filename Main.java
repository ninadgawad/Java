package org.ninad.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> transformedNumbersList =fetchEvenNumbersMultipiedBy(numbers);
        for (int number: transformedNumbersList){
            System.out.println(number);
        }

    }

    public static List<Integer> fetchEvenNumbersMultipiedBy(List<Integer> numbers){

        // This is the filtered ArrayList of numbers
        List<Integer> results = new ArrayList<>();
        for(int number: numbers){
            // Even if number is divided by 2
            if(number % 2 == 0){
                results.add(number*10);
            }
        }
        return results;
    }

}
