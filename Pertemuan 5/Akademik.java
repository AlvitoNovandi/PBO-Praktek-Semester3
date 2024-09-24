import java.util.ArrayList;
import java.util.List;

class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

class Dosen extends Person {
    private String NIP;

    public Dosen(String nama, String alamat, String NIP) {
        super(nama, alamat);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}

class Mahasiswa extends Person {
    private String NIM;

    public Mahasiswa(String nama, String alamat, String NIM) {
        super(nama, alamat);
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}

class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;

    public MataKuliah(String kode, String nama) {
        this.kodeMataKuliah = kode;
        this.namaMataKuliah = nama;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }
}

class Jurusan {
    private String namaJurusan;
    private String kodeJurusan;

    public Jurusan(String nama, String kode) {
        this.namaJurusan = nama;
        this.kodeJurusan = kode;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }
}

class ProgramStudi {
    private String namaProgramStudi;
    private String kodeProgramStudi;

    public ProgramStudi(String nama, String kode) {
        this.namaProgramStudi = nama;
        this.kodeProgramStudi = kode;
    }

    public String getNamaProgramStudi() {
        return namaProgramStudi;
    }

    public String getKodeProgramStudi() {
        return kodeProgramStudi;
    }

    public void setNamaProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public void setKodeProgramStudi(String kodeProgramStudi) {
        this.kodeProgramStudi = kodeProgramStudi;
    }
}

class JadwalKuliah {
    private String jamKe;
    private String hari;
    private String kodeMataKuliah;
    private String namaRuangan;
    private String NIPDosen;

    public JadwalKuliah(String jamKe, String hari, String kodeMataKuliah, String namaRuangan, String NIPDosen) {
        this.jamKe = jamKe;
        this.hari = hari;
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaRuangan = namaRuangan;
        this.NIPDosen = NIPDosen;
    }

    public String getJamKe() {
        return jamKe;
    }

    public String getHari() {
        return hari;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public String getNIPDosen() {
        return NIPDosen;
    }

    public void setJamKe(String jamKe) {
        this.jamKe = jamKe;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public void setNIPDosen(String NIPDosen) {
        this.NIPDosen = NIPDosen;
    }
}

class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;

    public Ruangan(String kode, String nama) {
        this.kodeRuangan = kode;
        this.namaRuangan = nama;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }
}

public class Akademik {
    public static void main(String[] args) {
        // Contoh data Dosen
        List<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Dr. Budi", "Jakarta", "12345"));
        dosenList.add(new Dosen("Dr. Siti", "Bandung", "67890"));
        dosenList.add(new Dosen("Dr. Joko", "Surabaya", "11223"));
        dosenList.add(new Dosen("Dr. Andi", "Medan", "44556"));
        dosenList.add(new Dosen("Dr. Rina", "Yogyakarta", "77889"));
        dosenList.add(new Dosen("Dr. Hani", "Semarang", "99100"));
        dosenList.add(new Dosen("Dr. Tika", "Malang", "23456"));
        dosenList.add(new Dosen("Dr. Eko", "Palembang", "34567"));
        dosenList.add(new Dosen("Dr. Lia", "Makassar", "45678"));
        dosenList.add(new Dosen("Dr. Deni", "Bali", "56789"));

        // Contoh data Mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Ani", "Bandung", "67890"));
        mahasiswaList.add(new Mahasiswa("Budi", "Jakarta", "12345"));
        mahasiswaList.add(new Mahasiswa("Cindy", "Semarang", "54321"));
        mahasiswaList.add(new Mahasiswa("Doni", "Surabaya", "98765"));
        mahasiswaList.add(new Mahasiswa("Eva", "Yogyakarta", "67812"));
        mahasiswaList.add(new Mahasiswa("Fauzi", "Malang", "78913"));
        mahasiswaList.add(new Mahasiswa("Gina", "Makassar", "89124"));
        mahasiswaList.add(new Mahasiswa("Hendra", "Palembang", "91235"));
        mahasiswaList.add(new Mahasiswa("Ika", "Bali", "12367"));
        mahasiswaList.add(new Mahasiswa("Joko", "Medan", "23478"));

        // Contoh data Ruangan
        List<Ruangan> ruanganList = new ArrayList<>();
        ruanganList.add(new Ruangan("R101", "Ruang Kuliah A"));
        ruanganList.add(new Ruangan("R102", "Ruang Kuliah B"));
        ruanganList.add(new Ruangan("R103", "Ruang Kuliah C"));
        ruanganList.add(new Ruangan("R104", "Ruang Kuliah D"));
        ruanganList.add(new Ruangan("R105", "Ruang Kuliah E"));

        // Contoh data Jadwal Kuliah
        List<JadwalKuliah> jadwalKuliahList = new ArrayList<>();
        jadwalKuliahList.add(new JadwalKuliah("1", "Senin", "MK001", "Ruang Kuliah A", "12345"));
        jadwalKuliahList.add(new JadwalKuliah("2", "Senin", "MK002", "Ruang Kuliah B", "67890"));
        jadwalKuliahList.add(new JadwalKuliah("3", "Selasa", "MK003", "Ruang Kuliah C", "11223"));
        jadwalKuliahList.add(new JadwalKuliah("4", "Rabu", "MK001", "Ruang Kuliah D", "44556"));
        jadwalKuliahList.add(new JadwalKuliah("5", "Kamis", "MK002", "Ruang Kuliah E", "77889"));
        jadwalKuliahList.add(new JadwalKuliah("6", "Jumat", "MK003", "Ruang Kuliah A", "99100"));

        // Menampilkan data Dosen
        System.out.println("Data Dosen:");
        for (Dosen dosen : dosenList) {
            System.out.println("Nama: " + dosen.getNama() + ", Alamat: " + dosen.getAlamat() + ", NIP: " + dosen.getNIP());
        }

        // Menampilkan data Mahasiswa
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println("Nama: " + mahasiswa.getNama() + ", Alamat: " + mahasiswa.getAlamat() + ", NIM: " + mahasiswa.getNIM());
        }

        // Menampilkan data Jadwal Kuliah
        System.out.println("\nJadwal Kuliah:");
        for (JadwalKuliah jadwal : jadwalKuliahList) {
            System.out.println("Jam Ke: " + jadwal.getJamKe() + ", Hari: " + jadwal.getHari() + ", Kode Mata Kuliah: " + jadwal.getKodeMataKuliah() + ", Ruangan: " + jadwal.getNamaRuangan() + ", NIP Dosen: " + jadwal.getNIPDosen());
        }
    }
}
