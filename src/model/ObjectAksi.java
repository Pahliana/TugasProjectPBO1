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
        hewan1.create();
        hewan1.create("Catty");


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

        hewan c3 = new hewan("Kucing", "Tamus", "Persia", "Jantan",2);
        c3.tampilkanInfoHewan();
        c3.tampilkanAtribut();

        hewan c4 = new hewan("Sapi","Momo","Holstein","Jantan","Putih-Hitam","Rumput",4,3);
        c4.tampilkanAtribut();
        c4.tampilkanInfoHewan();


        //Overriding
        hewanAdopsi over = new hewanAdopsi();
        over.create();
        over.create(" Tutul");

    }
}
