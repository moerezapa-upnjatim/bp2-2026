package programalumni;

public class alumni {
    // atribut
    int NPM; // by default, access modifier nya adalah private
    private String nama;
    private int tahunmasuk;
    private static String programstudi = "Sistem Informasi";
    private double IPK;

    // contoh default constructor
    alumni() {

    }

    // contoh parameterized constructor
    alumni(int NPM, String nama, int tahunmasuk) {
        this.NPM = NPM;
        this.nama = nama;
        this.tahunmasuk = tahunmasuk;
    }

    // contoh overload constructor
    alumni(int NPM, String nama) {
        this.NPM = NPM;
        this.nama = nama;
    }

    // mengakses nama alumni
    // 1. method without input and with output
    public int getNPM() {
        return NPM;
    }
    public String getNama() {
        return nama;
    }
    public String getProgramStudi() {
        return programstudi;
    }
    public int getTahunMasuk() {
        return tahunmasuk;
    }
    public double getIPK() {
        return IPK;
    }

    // 2. method without input dan without output
    public void menampilkanDataAlumni() {
        System.out.println("=== DATA ALUMNI ===");
        System.out.println("NPM: " + NPM);
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Angkatan: " + tahunmasuk);
        System.out.println("Program Studi: " + programstudi);
    }

    // 3. method with input and without output
    public void setNPM(int NPM) {
        this.NPM = NPM;
    }
    public void setNama(String namaMahasiswa) {
        nama = namaMahasiswa;
    }
    public void setTahunMasuk(int tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }

    // 4. method with input and output
    public double hitungIPK(double IPS1, double IPS2) {
        IPK = (IPS1 + IPS2) / 2;
        return IPK;
    }
    
}
