package model;

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
        hewan1.create();
        hewan1.create("Catty");


        //object Class 2
        hewanAdopsi adopsi = new hewanAdopsi();
        adopsi.namaHewanAdopsi = "Anjing";
        adopsi.namaPemilikAdopsi = "Fitriani";
        adopsi.umurHewanAdopsi = 1;
        adopsi.panggilanHewan = "Kalu";
        adopsi.warnaHewan = "Hitam";
        adopsi.infoAdopsi();
        adopsi.pemilik();


        //Constructor
        hewan c1 = new hewan();
        c1.tampilkanInfoHewan();
        hewan c2 = new hewan();
        c2.tampilkanAtribut();

        hewan c3 = new hewan("Burung", 2);
        c3.tampilkanInfoHewan();
        hewan c4 = new hewan("Ayam",1);
        c4.tampilkanInfoHewan();

        hewan c5 = new hewan("Kucing", "Tamus", "Persia", "Jantan",2);
        c5.tampilkanAtribut();
        hewan c6 = new hewan("Burung", "Zero", "Pipit", "Jantan",3);
        c6.tampilkanAtribut();


    }
}
