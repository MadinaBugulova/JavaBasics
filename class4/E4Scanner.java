package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        System.out.println("Please Enter you name");
        Scanner scanner = new Scanner ( System.in);
        String name = scanner.next();
        if (name.equals ("Asghar")) {
            System.out.println("Java instructor");


        }else {
            System.out.println("I dont know you");
        }
    }
}
