package turnamenbola;

public class turnamen {
  
    public static void main(String[] args) {
        
        // format penulisan: <nama class> <nama object. bebas mau dinamakan apa> = new <nama class>
        // bikin klub MU
        klub klubEmyu = new klub("King Manchester United", "Budi", "Mikel", "Lamongan", 0);
        klubEmyu.tampilkanIdentitasKlub();

        klub klubUPN = new klub("UPN FC", "Johan", "James", "Surabaya", 5);
        klubUPN.tampilkanIdentitasKlub();
    }

}

