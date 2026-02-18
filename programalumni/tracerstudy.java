package programalumni;

public class tracerstudy {

    public static void main(String[] args) {

        // alumni
        alumni mirza = new alumni();
        mirza.setNama("Mirza");
        mirza.setTahunMasuk(2024);
        
        mirza.menampilkanDataAlumni();

        double ipkMirza = mirza.hitungIPK(3.5, 4);
        System.out.println("IPK Mirza: " + ipkMirza);

        alumni ian = new alumni(176, "Ian Prayitno", 1998);
        ian.menampilkanDataAlumni();
    }
}
