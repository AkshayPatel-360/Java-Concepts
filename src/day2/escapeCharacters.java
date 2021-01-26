package day2;

import java.util.Scanner;

public class escapeCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\\"  );
       /* System.out.print("Enter your \n \0 name : ");
        String name  = scanner.nextLine();
        System.out.println( "Your name is " + name);*/



    }

    private static void multipleToken(Scanner scanner) {
        System.out.print("Enter your name : ");
        String name  = scanner.next();
        System.out.println( "Your name is " + name);
        String name2  = scanner.next();
        System.out.println( "Your name is " + name2);
    }
}
