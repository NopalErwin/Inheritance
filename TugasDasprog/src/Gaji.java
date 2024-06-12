import javax.swing.*;

public class Gaji {
    public static void main(String[] args) {
        Karyawan Bambang = new Karyawan("Bambang", "Pak");

        Karyawan Cahyono = new Karyawan("Cahyono", "Pak");
        Karyawan Desi = new Karyawan("Desi", "Ibu");
        Karyawan Kellan = new Karyawan("kellan", "Pak");
        Karyawan Jeremy = new Karyawan("jeremy", "Pak");

        Bambang.sapa();
        Bambang.gajiPokok();
        Bambang.cetakPointKinerja(500);
        Cahyono.cetakTunjangan();
        System.out.println();

        Cahyono.sapa();
        Cahyono.gajiPokok();
        Cahyono.cetakPointKinerja(789);
        Cahyono.cetakTunjangan();
        System.out.println();

        Desi.sapa();
        Desi.gajiPokok();
        Desi.cetakPointKinerja(827);
        Desi.cetakTunjangan();
        System.out.println();

        Kellan.sapa();
        Kellan.gajiPokok();
        Kellan.cetakPointKinerja(999);
        Kellan.cetakTunjangan();
        System.out.println();

        Jeremy.sapa();
        Jeremy.gajiPokok();
        Jeremy.cetakPointKinerja(679);
        Jeremy.cetakTunjangan();
        System.out.println();
    }
}
