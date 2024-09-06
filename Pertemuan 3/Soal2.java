import java.util.Scanner;

class Soal2{
    public static void main(String[] args) 
    {
        String[] string = new String[3];
        int[] number = new int[3];

        try (Scanner scan = new Scanner(System.in)) 
        {
            for (int i = 0; i < 3; i++) 
            {
                string[i] = scan.next();
                number[i] = scan.nextInt();
                
            }
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s%03d%n", string[i], number[i]);
            }
        }
    }

}