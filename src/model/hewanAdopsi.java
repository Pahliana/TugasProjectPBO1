package model;

//SubClass/Child-Class
public class hewanAdopsi extends hewan {

    public int umurPemilikAdopsi;
    public String namaPemilikAdopsi;
    public String alamatPemilikAdopsi;


    // 2 Method Class Hewan Adopsi

    public void infoAdopsi(){
        System.out.println();
        System.out.println("====================================================================");
        System.out.println("Nama Pemilik Yang Mengadopsi : "+namaPemilikAdopsi);
        System.out.println("Umur Pemilik yang Mengadopsi : "+umurPemilikAdopsi);
        System.out.println("Alamat Pemilik yang Mengadopsi : "+alamatPemilikAdopsi);
    }
    public void pemilik(){
        String pm = "INSERT INTO hewan VALUES Nama Pemilik = ('"+namaPemilikAdopsi+"')";
        System.out.println(pm);
    }


    //Getter dan Setter(Seluruh)

    public int getUmurPemilikAdopsi() {
        return umurPemilikAdopsi;
    }

    public void setUmurPemilikAdopsi(int umurPemilikAdopsi) {
        this.umurPemilikAdopsi = umurPemilikAdopsi;
    }

    public String getNamaPemilikAdopsi() {
        return namaPemilikAdopsi;
    }

    public void setNamaPemilikAdopsi(String namaPemilikAdopsi) {
        this.namaPemilikAdopsi = namaPemilikAdopsi;
    }

    public String getAlamatPemilikAdopsi() {
        return alamatPemilikAdopsi;
    }

    public void setAlamatPemilikAdopsi(String alamatPemilikAdopsi) {
        this.alamatPemilikAdopsi = alamatPemilikAdopsi;
    }


    //2 Overriding

    @Override
    public void halloMakanan() {
        super.halloMakanan();
    }

    @Override
    public void halloJenisHewan() {
        super.halloJenisHewan();
    }
}
