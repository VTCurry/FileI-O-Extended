package com.theironyard.novauc;

import com.sun.tools.doclets.internal.toolkit.util.DocFinder;
import jodd.json.JsonSerializer;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

    public class Person {
        String id;
        String firstName;
        String lastName;
        String emailAddress;
        String country;
        String ipAdress;

        public Person() {
        }

        public Person(String id, String firstName, String lastName, String emailAddress, String country, String ipAdress) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
            this.country = country;
            this.ipAdress = ipAdress;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getIpAdress() {
            return ipAdress;
        }

        public void setIpAdress(String ipAdress) {
            this.ipAdress = ipAdress;
        }

        public void people() throws IOException {

            File people = new File("people.txt");
            Scanner scanner = new Scanner(people);
            while (scanner.hasNext()) {
                String id = scanner.nextLine();
                String[] namelist = id.split(",");
                Person person = new Person(namelist[0], namelist[1], namelist[2], namelist[3], namelist[4], namelist[5]);

                if (Main.countryList.containsKey(person.country)) {
                    Main.countryList.get(person.country).add(person);
                } else {
                    Main.countryList.put(person.country, new ArrayList<Person>());
                    Main.countryList.get(person.country).add(person);
                }


            }

        }

        @Override
        public String toString() {
            return String.format("%s %s from %s", firstName, lastName, country);

        }
            public void write()throws IOException{
                JsonSerializer serial = new JsonSerializer();
                String Mike =  serial.deep(true).serialize(Main.countryList);

                File Vegas = new File("person.json");
                FileWriter tulane = new FileWriter(Vegas);
                tulane.write(Mike);
                tulane.close();

        }

    }
