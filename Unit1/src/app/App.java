package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
Scanner input = new Scanner(System.in);

System.out.println("Please enter a name");
String name1 = input.nextLine();
System.out.println("Please enter a adjective");
String adjective1 = input.nextLine();
System.out.println("Please enter a location");
String location1 = input.nextLine();
System.out.println("Please enter a verb");
String verb1 = input.nextLine();
System.out.println("Please enter a item");
String item1 = input.nextLine();
System.out.println(name1 + " is " + adjective1 + " because he is going to the " + location1);
System.out.println("He is " + verb1 + " soccer with his friends so he brings his " + item1);
    }

}