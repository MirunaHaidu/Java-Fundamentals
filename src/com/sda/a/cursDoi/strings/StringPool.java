package com.sda.a.cursDoi.strings;

public class StringPool {
    public static void main(String[] args) {

        String text1 = "My name is M";
        System.out.println(text1);

        String text2 = new String("My name is M"); //nu permite refolosirea in memorie a acestei valori
        System.out.println(text2);

        // == compara egalitatea la nivel de referinta
        // .equals compara egalitatea la nivel de valoare

        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));
        System.out.println(text1 == "My name is M");
        System.out.println(text2 == "My name is M"); // e fals pentru ca e comparat un obiect
        System.out.println(new String("My name is M").equals(new String("My name is M"))); //true

        System.out.println("--------------------");
        // .intern() e valoarea literala -> s1.intern() == "test" -> e true pt ca e ca si "test" == "test"

        String s1 = new String("test");
        String s2 = new String("test");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

    }
}
