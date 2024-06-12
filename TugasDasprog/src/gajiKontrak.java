public class gajiKontrak {
    public static void main(String[] args) {
        KaryawanKontrak Lita = new KaryawanKontrak("lita","Ibu");
        KaryawanKontrak bunbun = new KaryawanKontrak("Bunbun","Pak");

        Lita.sapa();
        Lita.gajiKontrak();
        System.out.println();

        bunbun.sapa();
        bunbun.gajiKontrak();
    }
}
