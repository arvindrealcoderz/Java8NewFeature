/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java8newfeature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Arvind verma
 */
public class Java8 {

    public static void main(String[] args) {

        Integer arr[] = {10, 3, 4, 5, 10, 20, 8, 4, 39, 41, 20};
        List<Integer> list = Arrays.asList(arr);

        //remove duplicate Element in the list
        System.out.println("remove duplicate Element in the list");
        Set<Integer> removeDuplicate = new HashSet<Integer>();
        list.stream().filter(d -> removeDuplicate.add(d)).collect(Collectors.toSet());
        System.out.println(removeDuplicate);

        //display duplicate item only
        System.out.println("display duplicate item only");
        Set<Integer> duplicate = new HashSet<Integer>();
        list.stream().filter(num -> !duplicate.add(num)).collect(Collectors.toSet());

        //Display sum of all odd number
        System.out.println("Display sum of all odd number");
        System.out.println(list.stream().filter(num -> num % 2 != 0).reduce(0, Integer::sum));

        //Display multiply of all odd number
        System.out.println("Display sum of all even number");
        System.out.println(list.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum));

        String name[] = {"Arvind", "Raja", "Rani", "Priya", "Ansu", "Akash", "Priya", "Arvind", "Raj", "Raja"};
        List<String> listName = Arrays.asList(name);

        //Find Number of word that are repated.
        System.out.println(listName.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        //Remove duplicate word from the list
        System.out.println("Remove duplicate word from the list");
        Set<String> removeDuplicateName = new HashSet<String>();
        listName.stream().filter(pname -> !removeDuplicateName.add(pname)).collect(Collectors.toSet());
        System.out.println(removeDuplicateName);
    }

}
