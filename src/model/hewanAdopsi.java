package model;

//SubClass/Child-Class
public class hewanAdopsi {
    public String namaHewanAdopsi;
    public String namaPemilikAdopsi;
    public int umurHewanAdopsi;

    public void infoAdopsi(){
        System.out.println("=====================================================");
        System.out.println("Nama Hewan Yang Diadopsi : "+namaHewanAdopsi);
        System.out.println("Nama Pemilik Adopsi : "+namaPemilikAdopsi);
        System.out.println("Umur Hewan Adopsi : "+umurHewanAdopsi);
    }
    public void pemilik(){
        String pm = "INSERT INTO hewan VALUES ('"+namaPemilikAdopsi+"')";
        System.out.println(pm);
    }

}
