import java.util.Scanner;

class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Plat Nomor");
        String input = scan.nextLine();
        input = input.replaceAll("\\s", "");
        long angka = Long.parseLong(input);

        if(((angka - 999999)%5) == 0)
        {
            System.out.println("Berhenti");
        }
        else{
            System.out.println("Jalan");
        }

    }
}