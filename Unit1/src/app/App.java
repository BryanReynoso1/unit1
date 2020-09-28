package app;


public class App {
    public static void main(String[] args) throws Exception {
     int count = 0;
     String color = "red";
     boolean nameIs = false;

     while (count < 10) {
         System.out.println("The count is " + count);
         count = count + 1;
         
     }
     System.out.println("Count finished");

     while (color == "red"){
         System.out.println("The color is " + color);
         color = "green";
     }
     System.out.println("Color finished");

     while (nameIs = false){
         System.out.println("my name is Bob " + nameIs);
         nameIs = false;
     }
     System.out.println("Name finished");





    }

}