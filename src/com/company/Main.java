package com.company;
import com.company.Person.CPerson;

public class Main {

    public static void main(String[] args) {

	    CPerson Person1 = new CPerson(true, "Misha");
        CPerson Person2 = new CPerson(true, "Misha");

        Person1.Marry(Person2);

        CPerson Person3 = new CPerson(true, "Misha");
        CPerson Person4 = new CPerson(false, "Masha");

        Person3.Marry(Person4);

        CPerson Person5 = new CPerson(true, "Petya");
        CPerson Person6 = new CPerson(false, "Polina");

        Person5.Marry(Person6);

        Person3.Marry(Person6);
    }
}
