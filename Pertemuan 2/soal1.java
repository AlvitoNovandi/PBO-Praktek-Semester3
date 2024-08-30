import java.util.Scanner;

public class soal1
{
    public static void main(String[] args)
    {
        String value;
        Scanner read = new Scanner(System.in);
        for(int i = 1; i < 6; i++)
        {
        System.out.println("Masukkan angka = ");
        value = read.nextLine();

        try 
        {
            long number = Long.parseLong(value);

            if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
            {
                System.out.println(value + " Bisa masuk kedalam:\n byte\n short\n int\n long");
            }
            else if(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
            {
                System.out.println(value + " Bisa masuk kedalam :\n short\n int\n long");
            }
            else if(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
            {
                System.out.println(value + " Bisa masuk kedalam :\n int \nlong");
            }
            else if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)
            {
                System.out.println(value + " Bisa masuk kedalam:\n long");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(" Tidak masuk kedalam tipe data manapun");
        }    
        }
        read.close();
    }
}