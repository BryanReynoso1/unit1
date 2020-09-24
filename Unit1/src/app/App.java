package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
Scanner input = new Scanner(System.in);

System.out.println("Please enter your first name.");
String firstName = input.nextLine();
System.out.println("Please enter your last name.");
String lastName = input.nextLine();
System.out.println("Please enter your age.");
String youAge = input.nextLine();
System.out.println("Please enter your grade.");
String youGrade = input.nextLine();
System.out.println("Please enter your favorite color.");
String youColor = input.nextLine();
System.out.println("hello, " + firstName + " " + lastName);
System.out.println("you are " + youAge);
System.out.println("you are in " + youGrade);
System.out.println("and your favorite color is " + youColor);
    }

}