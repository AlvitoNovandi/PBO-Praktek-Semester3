import java.util.Scanner;

class Soal3{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String input = scan.nextLine();
    String[] pisah = new String[3]; 
    pisah= input.split(" ");  

    int A = Integer.parseInt(pisah[0]);
    int B = Integer.parseInt(pisah[2]);
    

    int hasil = 0;

  switch (pisah[1]) {
    case "+":
        hasil = A + B;
        break;
    case "-":
        hasil = A - B;
        break;
    case "*":
        hasil = A * B;
        break;
    case "/":
        hasil = A / B;
        break;
    case "%":
        hasil = A % B;
        break;
    default:
        System.out.println("Operator tidak valid");
        return;
    }
    System.out.println(hasil);
        
        scan.close();  // Menutup Scanner setelah selesa
}
}