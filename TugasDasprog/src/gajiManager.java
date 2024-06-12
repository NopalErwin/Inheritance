public class gajiManager {
    public static void main(String[]args){
        Manager rey = new Manager("rey","Ibu");
        Manager djiko = new Manager("djiko","Pak");

        rey.sapa();
        rey.gajiPokok();
        rey.cetakPointKinerja(500);
        rey.cetakTunjangan();
        rey.cetakTunjanganTransport();
        System.out.println();

        djiko.sapa();
        djiko.gajiPokok();
        djiko.cetakPointKinerja(800);
        djiko.cetakTunjangan();
        djiko.cetakTunjanganTransport();
        System.out.println();
    }
}
