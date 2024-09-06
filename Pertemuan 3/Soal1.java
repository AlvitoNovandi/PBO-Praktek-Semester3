import java.util.Scanner;

class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String simbol = "[!\\ \\,\\?\\.\\_\\'\\@]";
        String array[] =  text.split(simbol);
        System.out.println("Hasil = " + array.length);
        
        
        for (String word : array) 
        {
        if (!word.isEmpty()) 
        {
        System.out.println(word);
        }
        }
    }
}