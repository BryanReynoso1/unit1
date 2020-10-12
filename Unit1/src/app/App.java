package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   for (int i = 0; i <= 1000; i = i + 100){
       System.out.println("the number is " + i);
   }
   System.out.println("Challenge 1 complete");
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter a password");
   String password1 = input.nextLine();
   String choosepassword1 = "Stma2020";
   if (password1.equals(choosepassword1)){
       System.out.println("have a good day");
   } else {
       System.out.println("Error");
   }
   System.out.println("Please enter a password again");
   String password2 = input.nextLine();
   String choosepassword2 = "Stma2020";
   if (password2.equals(choosepassword2)){
       System.out.println("have a good day");
   } else {
       System.out.println("Error");
   }
   System.out.println("last try to get the secreat message, enter a password");
   String password3 = input.nextLine();
   String choosepasswrod3 = "Stma2020";
   if (password3.equals(choosepasswrod3)){
       System.out.println("have a good day");
   } else {
       System.out.println("Error, you dont get the secreat message");
   }
System.out.println("Challenge 2 complete");





        
    
     

     

     




    }

}