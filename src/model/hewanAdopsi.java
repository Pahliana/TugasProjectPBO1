package model;

//SubClass/Child-Class
public class hewanAdopsi extends hewan {

    public int umurPemilikAdopsi;
    public String namaPemilikAdopsi;
    public String alamatPemilikAdopsi;

    public void infoAdopsi(){
        System.out.println("=====================================================");
        System.out.println("Nama Hewan Yang Diadopsi : "+namaPemilikAdopsi);
        System.out.println("Nama Pemilik Adopsi : "+umurPemilikAdopsi);
        System.out.println("Umur Hewan Adopsi : "+alamatPemilikAdopsi);
    }
    public void pemilik(){
        String pm = "INSERT INTO hewan VALUES ('"+namaPemilikAdopsi+"')";
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


    //Overriding

    @Override
    public boolean create(String panggilanHewan) {
        return super.create(panggilanHewan);
    }

    @Override
    public boolean create() {
        return super.create();
    }
}
