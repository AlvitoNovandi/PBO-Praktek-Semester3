import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String a = scan.nextLine();
        String b = scan.nextLine();
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        BigInteger pertambahan = bigA.add(bigB);
        BigInteger perkalian = bigA.multiply(bigB);
        System.out.println("Output :");
        System.out.println(pertambahan);
        System.out.println(perkalian);
    }
}
