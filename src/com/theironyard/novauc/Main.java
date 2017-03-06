package com.theironyard.novauc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static HashMap<String, ArrayList<Person>>countryList = new HashMap<>();
public static Person p= new Person();

    public static void main(String[] args) throws IOException{
        p.people();
        System.out.println(countryList);
        p.write();
    }
}
