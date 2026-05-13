import java.util.Scanner;

public class ex1 {
     public static void main(String[] args){
          Scanner marks = new Scanner(System.in);
          float total = 0;
          float per;
          float arr;
          System.out.println(" Each Subject mark must be below 100");
     for(int i = 1; i<=5;i++){
          System.out.print(" Enter mark "+ i + " : ");
          arr = marks.nextFloat();
          total += arr;
     }
     per = (total/500)*100;
      System.out.println("percentage of yours is: "+ per + ".");

     }
}