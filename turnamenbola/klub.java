package turnamenbola;

public class klub {
    
    String namaklub;
    String namakapten;
    String namapelatih;
    String asalwilayah;
    int jumlahtrofi;

    // constructor
    public klub(String namaklub, String namakapten, String namapelatih, String asalwilayah, int jumlahtrofi) {
        // mengisi nilai variabel
        this.namaklub = namaklub; // 'this' dipakai untuk memperjelas kita memanggil variabel class (di luar method)
        this.namakapten = namakapten;
        this.namapelatih = namapelatih;
        this.asalwilayah = asalwilayah;
        this.jumlahtrofi = jumlahtrofi;
    }

    public void tampilkanIdentitasKlub() {
        System.out.printf("Nama klub: %s\n", namaklub);
        System.out.printf("Nama kapten: %s\n", namakapten);
        System.out.printf("Nama pelatih: %s\n", namapelatih);
        System.out.printf("Asal wilayah klub: %s\n", asalwilayah);
        System.out.println("Jumlah trofi: " + jumlahtrofi);
    }
}
