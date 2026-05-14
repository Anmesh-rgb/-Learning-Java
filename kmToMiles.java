// WAP to convert kilometers to miles.
import java.util.Scanner;
public class kmToMiles {
    public static void main(String[] args){
        Scanner km = new Scanner(System.in); 
        System.out.println("----Converting Kilometers to Miles---");
        System.out.print("Enter Kilometers:");
        float kilometers = km.nextFloat();
        float miles = 0.621f * kilometers;
        System.out.println(""+ kilometers + " kilometer = "+ miles +" miles");
        km.close();



    }
    
}
