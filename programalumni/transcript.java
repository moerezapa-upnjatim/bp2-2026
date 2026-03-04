package programalumni;

public class transcript {
    
    String name;
    int tahunLulus;
    private String gradeNilaiBP1;
    String gradeNilaiBP2;

    transcript(String namaAlumni, int tahunLulusAlumni, String gradeNilaiBP1, String gradeNilaiBP2) {
        this.name = namaAlumni;
        this.tahunLulus = tahunLulusAlumni;
        this.gradeNilaiBP1 = gradeNilaiBP1;
        this.gradeNilaiBP2 = gradeNilaiBP2;
    }

    public String getName() {
        return name; // menampilkan nama
    }

    public int getTahunLulus() {
        return tahunLulus; // menampilkan tahun lulus
    }

    public String getNilaiBP1() {
        return gradeNilaiBP1; // menampilkan nama
    }

    public String getNilaiBP2() {
        return gradeNilaiBP2; // menampilkan nama
    }

    void ubahNilaiBP1(String nilaiBP1Baru) {
        this.gradeNilaiBP1 = nilaiBP1Baru; // mengubah variabel nilaiBP1
    }
}
