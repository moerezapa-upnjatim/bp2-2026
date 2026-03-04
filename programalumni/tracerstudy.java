package programalumni;

import java.util.Scanner;

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

        Scanner scannerInput = new Scanner(System.in);
    
        
        // programstudi prodiInformatika = new programstudi("Informatika", "FIK");

        System.out.print("Masukkan nama alumni");
        String namaAlumni = scannerInput.nextLine();
        String namaProdiAlumni = scannerInput.nextLine();  
        System.out.print("Masukkan program studi Alumni: ");
        programstudi prodiAlumni = new programstudi(namaProdiAlumni, "FIK");
        
        alumni oji = new alumni(169, namaAlumni, 1803, prodiAlumni);
        oji.menampilkanDataAlumni();
        oji.tampilkanTranscript();

        oji.ubahNilaiBP1Alumni("C");
        oji.tampilkanTranscript();
    }
}
