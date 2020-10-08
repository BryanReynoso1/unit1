package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
System.out.println("What is the capital of Minnesota?");
String answer1 = input.nextLine();
String correctAnswer1 = "St.Paul";
if (answer1.equals(correctAnswer1)){
    System.out.println("correct");
} else {
    System.out.println("incorrect");
}
System.out.println("Where is Peru located?");
String answer2 = input.nextLine();
String correctAnswer2 = "South America";
if (answer2.equals(correctAnswer2)){
    System.out.println("correct");
} else {
    System.out.println("incorrect");
}
System.out.println("What year did WW2 started?");
String answer3 = input.nextLine();
String correctAnswer3 = "1939";
if (answer3.equals(correctAnswer3)){
    System.out.println("correct");
} else {
    System.out.println("incorrect");
}
System.out.println("What year did WW1 started"); 
String answer4 = input.nextLine();
String correctAnswer4 = "1914";
if (answer4.equals(correctAnswer4)){
    System.out.println("correct");
} else {
    System.out.println("incorrect");
}
System.out.println("When is independence day for USA");
String answer5 = input.nextLine();
String correctAnswer5 = "July 4";
if (answer5.equals(correctAnswer5)){
    System.out.println("correct");
} else {
    System.out.println("incorrect");
}
int score = 0;

if (answer1.equals(correctAnswer1)) score++;
if (answer2.equals(correctAnswer2)) score++;
if (answer3.equals(correctAnswer3)) score++;
if (answer4.equals(correctAnswer4)) score++;
if (answer5.equals(correctAnswer5)) score++;
System.out.println("Your score is " + score + "/5");
System.out.println("your percent will be " + score*20 + "%");
        
    
     

     

     




    }

}