public class Manager extends Karyawan {

 Manager(String nama , String sapaan){
     super(nama, sapaan);
 }

    int gajiManager = 20000000;
    int tunjanganTransportasi = 30;

    public int getGajiManager() {
        return this.gajiManager;
    }
    void gajiPokok() {
        System.out.println(
                "Gaji Pokok Yang Anda Dapatkan Rp." +this.gajiManager);
    }

    int hitungPointKinerja(int pointKinerja){
        int perolehPoin = pointKinerja/100;
        return perolehPoin;
    }
    int hitungBonus(int perolehPoin){
        int bonus = Math.abs(400000 * perolehPoin);
        return bonus;
    }
    void cetakTunjangan () {
        int nilaiTunjangan = (this.tunjangan)*this.gajiManager/100;
        System.out.println("Anda Mendapat Tunjangan Kesehatan sejumlah: Rp." + nilaiTunjangan );
    }

    public int tunjanganTransportasi() {
        return this.tunjanganTransportasi;
    }

    void cetakTunjanganTransport () {
            int nilaiTunjangan = (this.tunjanganTransportasi) * this.gajiManager / 100;
            System.out.println("Anda Mendapat Tunjangan Trasnport sejumlah: Rp." + nilaiTunjangan);
        }
    }






