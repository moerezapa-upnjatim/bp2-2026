package programalumni;

public class tracerstudy {

    public static void main(String[] args) {

        // alumni
        // alumni mirza = new alumni();
        // mirza.setNama("Mirza");
        // mirza.setTahunMasuk(2024);
        
        // mirza.menampilkanDataAlumni();

        // double ipkMirza = mirza.hitungIPK(3.5, 4);
        // System.out.println("IPK Mirza: " + ipkMirza);

        // alumni ian = new alumni(176, "Ian Prayitno", 1945);
        // ian.menampilkanDataAlumni();

        programstudi prodi = new programstudi("Sistem Informasi", "FIK");
        programstudi prodiInformatika = new programstudi("Informatika", "FIK");
        alumni oji = new alumni(169, "Ahmad Fauzi", 1803, prodiInformatika);
        oji.menampilkanDataAlumni();

    }
}
