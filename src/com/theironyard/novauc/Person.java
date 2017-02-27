package com.theironyard.novauc;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.in;
    /**
     * Created by vtcurry on 2/20/17.
     */
    public class Person {

    ArrayList<String> namelist = new ArrayList<>();
    ArrayList<String> test = new ArrayList<>();

    ArrayList<String> archive = new ArrayList<>();

    HashMap<String, ArrayList<String>> arkivet = new HashMap<>();

    (DocFinder.Input.equals("New Country"))

    {
        System.out.println("Name of the Person? ");
        String name = in.nextLine();

        archive = ArrayList < String > () ;
        arkivet.put(name, archive);

        if (namelist.contains(name)) {
            System.out.println("Which Country have you visited?");
            String country = in.nextLine();
            if (archive.contains(country)) {
                System.out.println("You've already visited this country.");
            } else {
                test.add(country);
                thearchive.put(name, country);
                System.out.println("HashMap Contains: " + thearchive);
            }
        } else {
            System.out.println("The person does not exist please add first.");
        }
    }
}
