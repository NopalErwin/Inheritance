public class Karyawan {
    String Nama;
    String Sapaan;
    private int Gaji = 8000000;
    int tunjangan = 50;
    int []Jumlah_karyawan = new int [6];

    //nama karyawan
    Karyawan (String nama, String sapaan) {
        this.Nama = nama;
        this.Sapaan = sapaan;

    }
    void sapa () {
        if (this.Sapaan == "Pak") {
            System.out.printf(
                    "Yang terhormat, %s %s \n", this.Sapaan, this.Nama);
        }
        if (this.Sapaan == "Ibu") {
            System.out.printf(
                    "Yang terhormat, %s %s \n", this.Sapaan, this.Nama);
        }
    }
    // Gaji pokok karyawan
    public int Gaji() {
        return this.Gaji;
    }
    void gajiPokok() {
            System.out.println(
                    "Gaji Pokok Yang Anda Dapatkan Rp." +this.Gaji);
        }

        // Gaji bonus
        int hitungPointKinerja(int pointKinerja){
            int perolehPoin = pointKinerja/100;
            return perolehPoin;
        }
    int hitungBonus(int perolehPoin){
        int bonus = Math.abs(200000 * perolehPoin);
        return bonus;
        }



        void cetakPointKinerja(int pointKinerja){

            System.out.println(
                    "Dengan total poin kinerja anda " + pointKinerja + ", " + this.Sapaan + " " + this.Nama + " mendapatkan bonus sebesar Rp." + this.hitungBonus(hitungPointKinerja(pointKinerja))
            );
        }

        // Tunjangan kesehatan
        public int tunjangan() {
            return this.tunjangan;
        }
    void cetakTunjangan () {
        int nilaiTunjangan = (this.tunjangan)*this.Gaji()/100;
        System.out.println("Anda Mendapat Tunjangan Kesehatan sejumlah: Rp." + nilaiTunjangan );
    }


    }




