import java.util.Scanner;
public class calc_CGPA {
    public static void main(String[] args){
        System.out.println("Enter 5 subject marks");
        Scanner marks = new Scanner(System.in);
        float total = 0;
        float percentage;
        float CGPA;
        for(int i=1; i<=5; i++){
            System.out.print("Enter sub " + i+ " mark : ");
            float mark = marks.nextFloat();
            total += mark;
        }
        percentage = (total/500)*100;
        CGPA = percentage/25;

        System.out.println("Total = " + total);
        System.out.println("Percentage = "+ percentage);
        System.out.println(" CGPA = "+ CGPA);
        marks.close();
    }
}
