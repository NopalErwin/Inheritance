public class KaryawanKontrak extends Karyawan {

    KaryawanKontrak(String nama, String sapaan) {
        super(nama, sapaan);
    }

    private int gajiKontrak = 3500000;

    void gajiKontrak() {
        System.out.println(
                "Gaji Pokok Yang Anda Dapatkan Rp." + this.gajiKontrak);

    }
}
