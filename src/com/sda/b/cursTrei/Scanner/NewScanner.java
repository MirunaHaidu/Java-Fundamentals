package com.sda.b.cursTrei.Scanner;
import java.util.Scanner;
public class NewScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String textLine = scan.nextLine();
//        System.out.println(textLine);


        //citim pana userul selecteaza exit

//        String userInput = "";
//        System.out.println("Please add input: ");
//        while (!userInput.equals("exit")){
//            userInput = scan.nextLine();
//            System.out.println("User inputed: "+userInput);
//        }


        // vrem ca userul sa introduca prima data un username, apoi i se cere o parola
        // se valideaza combinatia user + parola cu "admin", "password"
        // cat timp nu este valida i se va cere sa le reintroduca
        // cand este valida ii spunem "bine ai venit"


        String username ="";
        String parola ="";
        do {
            System.out.println("Introdu username: ");
            username = scan.nextLine();
            System.out.println("Introdu parola: ");
            parola = scan.nextLine();
            if(isUsernameAndPasswordWrong(username, parola)){
                System.out.println("Mai incearca...");
            }
        } while (isUsernameAndPasswordWrong(username, parola));
        System.out.println("Bine ai venit!");







    }

    private static boolean isUsernameAndPasswordWrong(String username, String parola) {
        return !(username.equals("admin") && parola.equals("password"));
    }
}
