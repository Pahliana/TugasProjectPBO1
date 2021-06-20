package model;

//SubClass/Child-Class
public class hewanAdopsi extends hewan {

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

    //Getter dan Setter(Seluruh)

    public String getNamaHewanAdopsi() {
        return namaHewanAdopsi;
    }

    public void setNamaHewanAdopsi(String namaHewanAdopsi) {
        this.namaHewanAdopsi = namaHewanAdopsi;
    }

    public String getNamaPemilikAdopsi() {
        return namaPemilikAdopsi;
    }

    public void setNamaPemilikAdopsi(String namaPemilikAdopsi) {
        this.namaPemilikAdopsi = namaPemilikAdopsi;
    }

    public int getUmurHewanAdopsi() {
        return umurHewanAdopsi;
    }

    public void setUmurHewanAdopsi(int umurHewanAdopsi) {
        this.umurHewanAdopsi = umurHewanAdopsi;
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
