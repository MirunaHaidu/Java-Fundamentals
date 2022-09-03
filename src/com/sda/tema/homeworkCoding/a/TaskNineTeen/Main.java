package com.sda.tema.homeworkCoding.a.TaskNineTeen;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Dickinson", "english");
        Author author2 = new Author("Eminescu", "Romanian");
        Author author3 = new Author("Poe", "American");

        Poem poem1 = new Poem(author1, 4);
        Poem poem2 = new Poem(author2, 99);
        Poem poem3 = new Poem(author3, 10);

        System.out.println("The writer that wrote the longest poem is " +
                compareTo(poem1, poem2, poem3));

//          Solutie cu array, dar trb. setter
//        Poem[] poems = new Poem[3];
//        poems[0] = poem1;
//        poems[1] = poem2;
//        poems[2] = poem3;
//
//        Author toDisplay = new Author();
//        int longestPoem = Integer.MAX_VALUE;
//
//        for (int i = 0; i < poems.length; i++){
//            if (poems[i].getStropheNumbers()>longestPoem){
//              toDisplay = poems[i].getCreator()
//                 longestPoem = poems[i].getStropheNumbers();
//            }
//        }

    }

    public static String compareTo(Poem a, Poem b, Poem c) {
        if (a.stropheNumbers > b.stropheNumbers && a.stropheNumbers > c.stropheNumbers) {
            return a.creator.surname;
        } else if (b.stropheNumbers > a.stropheNumbers && b.stropheNumbers > c.stropheNumbers) {
            return b.creator.surname;
        } else {
            return c.creator.surname;
        }

    }
}
