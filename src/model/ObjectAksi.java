package model;


// 6 Object dengan method
public class ObjectAksi {
    public static void main(String[] args) {

        //object Class 1
        hewan hewan1 = new hewan();
        hewan1.namaHewan = "Kucing";
        hewan1.panggilanHewan = "Cimol";
        hewan1.jenisHewan = "Persia";
        hewan1.jenisKelamin = "Jantan";
        hewan1.warnaHewan = "Putih Hitam";
        hewan1.makananHewan = "Whiskas Tuna Flavor";
        hewan1.jumlahKaki = 4;
        hewan1.umurHewan = 1;
        hewan1.tampilkanAtribut();
        hewan1.tampilkanInfoHewan();
        hewan1.halloMakanan();
        hewan1.halloJenisHewan();


        //object Class 2
        hewanAdopsi adopsi = new hewanAdopsi();
        adopsi.namaPemilikAdopsi = "Zaenal Rahman";
        adopsi.umurPemilikAdopsi = 20;
        adopsi.alamatPemilikAdopsi = "Jln. Bukit Raya Indah No.41";
        adopsi.namaHewan = "Kelinci";
        adopsi.warnaHewan = "Hitam";
        adopsi.infoAdopsi();
        adopsi.pemilik();


        //Constructor
        hewan c1 = new hewan();
        c1.tampilkanInfoHewan();
        c1.tampilkanAtribut();


        //Constructor Menggunakan Generate

        hewan c2 = new hewan("Kucing", "Tamus", "Persia", "Jantan",2);
        c2.tampilkanInfoHewan();
        c2.tampilkanAtribut();

        hewan c3 = new hewan("Sapi","Momo","Holstein","Jantan","Putih-Hitam","Rumput",4,3);
        c3.tampilkanAtribut();
        c3.tampilkanInfoHewan();


        //Overriding
        hewanAdopsi over = new hewanAdopsi();
        over.namaHewan = "Ular";
        over.jenisHewan = "Sanca";
        over.makananHewan = "Tikus + Kelinci + Ayam + dan Lainnya";
        over.halloJenisHewan();
        over.halloMakanan();



    }
}
