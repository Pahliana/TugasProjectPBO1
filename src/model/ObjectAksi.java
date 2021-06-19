package model;

public class ObjectAksi {
    public static void main(String[] args) {

        //object Class 1
        hewan hewan1 = new hewan();
        hewan1.namaHewan = "Kucing";
        hewan1.panggilanHewan = "Cimol";
        hewan1.jenisHewan = "Persia";
        hewan1.jenisKelamin = "Laki-Laki";
        hewan1.warnaHewan = "Putih Hitam";
        hewan1.makananHewan = "Whiskas Tuna Flavor";
        hewan1.jumlahKaki = 4;
        hewan1.umurHewan = 1;
        hewan1.tampilkanAtribut();
        hewan1.create();
        hewan1.create("Catty");


        //object Class 2
        hewanAdopsi adopsi = new hewanAdopsi();
        adopsi.namaHewanAdopsi = "Anjing";
        adopsi.namaPemilikAdopsi = "Fitriani";
        adopsi.umurHewanAdopsi = 1;
        adopsi.infoAdopsi();
        adopsi.pemilik();

    }
}
