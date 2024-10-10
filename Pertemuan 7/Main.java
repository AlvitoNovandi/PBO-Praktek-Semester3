public class Main {
    public static void main(String[] args) {
        // Membuat karyawan
        Employee manager = new Manager("Alice");
        Employee developer = new Developer("Bob");
        Employee Magang = new Magang("Charlie");

        // Karyawan bekerja
        manager.work();
        developer.work();
        Magang.work();

        // Menghitung gaji (hanya untuk karyawan bergaji)
        ((Salary) manager).HitungGaji();
        ((Salary) developer).HitungGaji();
    }
}
