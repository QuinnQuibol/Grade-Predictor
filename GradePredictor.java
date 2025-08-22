import java.util.Scanner;

public class GradePredictor{
   public static void main (String [] args){
   
   Scanner scanner = new Scanner(System.in);
   int score;
   
   System.out.println("-------------------");
   System.out.println("**GRADE PREDICTOR**");
   System.out.println("-------------------");
  
   System.out.print("Score (1-100): ");
   score = scanner.nextInt();
   
   System.out.println("--------------------");
   
   if(score>100){
      System.out.print("Your exceeded the score limit!");
   }
   else if(score>=90){
      System.out.print("Your grade is: A");
   }
   else if(score>=80){
      System.out.print("Your grade is: B");
   }
   else if(score>=70){
      System.out.print("Your grade is: C");
   }
   else if(score>=60){
      System.out.print("Your grade is: D");
   }
   else if (score>=0){
      System.out.print("Your grade is: F");
   }
   else{
      System.out.print("You exceeded the score limit!");
   }
   
   scanner.close();
   }
}