package com.sda.a.cursDoi.strings;

public class StringOperations {
    public static void main(String[] args) {

        String s1 = "Ana .";
        String s2 = "Dana";

        String concat = s1 + s2;
        System.out.println(concat);

        String concat2 = s1.concat(s2);
        System.out.println(concat2);

        System.out.println("Length of string: "+concat.length());
        System.out.println("First string without trailing spaces: "+s1.trim()); //scoate spatiul
        System.out.println("Concat without spaces: "+concat.trim()); // NU sterge spatiul daca e in mijloc
        System.out.println("First string without spaces: "+s1.trim().length()); // numara caracterele, fara spatiu

        System.out.println("toUpper: "+ s2.toUpperCase());
        System.out.println("--------------------------");


        String s3 = "We are working with java to exercise";
        System.out.println("Index of w: "+s3.indexOf('w'));
        System.out.println("Index of z: "+s3.indexOf('z'));
        System.out.println("--------------------------");

    // string e un obiect imutabil
        String s4 = "test1 - test2 - test3 - test4 - test5";
        System.out.println(s4.replaceAll("-", "+"));
        System.out.println(s4.replaceAll("test", "abc")); //au ramas linitutele, pt ca inlocuieste
                                                                            // tot primul string
        System.out.println("--------------------------");

        //sa parcurgem stringul caracter cu caracter

        for(int i = 0; i<s4.length(); i++){
            System.out.print(s4.charAt(i)+" ");
        }
        System.out.println();

        char[] charArr = s4.toCharArray();
        for (int i=0; i< charArr.length; i++){
            System.out.print(charArr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        String s5 = "Testing your code makes a life better for everyone";
        System.out.println("Substring: "+ s5.substring(5));
        System.out.println("Substring: "+ s5.substring(8, 20));
        System.out.println("--------------------------");


        String[] stringArr = new String[]{"adsa", "asfd", "fghjhg", "aaa"};
        for(int i = 0; i< stringArr.length; i++){
            if(stringArr[i].startsWith("ad")){
                System.out.println(stringArr[i]);
            }
        }
        System.out.println("--------------------------");

        System.out.println("Is string empty: "+"".isEmpty());
        System.out.println("Is string empty: "+"".isBlank());
        System.out.println("Is string empty: "+" ".isEmpty());
        System.out.println("Is string empty: "+" ".isBlank());
        System.out.println("--------------------------");


        //Split method

        String stringWithSpaces = "Learning java is awesome.";
        String[] words = stringWithSpaces.split(" ");
        for (int i =0; i< words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println("--------------------------");


        // enhanced for

        for (String word: words){ //word = variabila locala; words = array-ul
            System.out.println(word);
        }
        System.out.println("--------------------------");

        //String escape

        String escapedString = "test \\t b \\n blabla"; // pui doi \\ ca sa apara \t
        System.out.println(escapedString);




    }
}
