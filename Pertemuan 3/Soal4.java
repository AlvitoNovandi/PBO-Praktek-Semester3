import java.util.Scanner;

class Soal4
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gajipokok = 500000;
        int penjualan;
        double bonus = 0;
        double item = 50000;
        System.out.println("Masukkan Jumlah Penjualan");
        penjualan = scan.nextInt();
        if(penjualan < 15)
        {
            int selisih = 15 - penjualan;
            gajipokok = gajipokok - (((item * selisih)*15)/100);
            
        }
        else if(penjualan >=15 && penjualan<40)
        {
            bonus = ((penjualan*item)*0.10);
        }
        else if(penjualan>=40 && penjualan <=80)
        {
            bonus = ((penjualan*item) * 25)/100;
        }
        else
        {
            bonus = ((penjualan*item) * 35)/100;
        }

        System.out.println("Jumlah Gaji = " + (gajipokok + bonus));

    }
}