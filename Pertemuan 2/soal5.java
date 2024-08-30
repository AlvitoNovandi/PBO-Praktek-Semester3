import java.util.Scanner;

class soal5
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kata:");
        String katapertama = scan.nextLine();
        String katakedua = scan.nextLine();
        int TotalPanjang = katapertama.length() + katakedua.length();
        System.out.println("\n"+TotalPanjang);
        if(katapertama.compareTo(katakedua) > 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        String CapitalPertama = katapertama.substring(0, 1).toUpperCase() + katapertama.substring(1);
        String CapitalKedua = katakedua.substring(0, 1).toUpperCase() + katakedua.substring(1);
        System.out.println(CapitalPertama + " " + CapitalKedua);

        scan.close();
    }
}