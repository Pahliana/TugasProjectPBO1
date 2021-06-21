package model;

//SuperClass/Parent-Class
public class hewan {

    // 8 atribut class hewan

    public String namaHewan;
    public String panggilanHewan;
    public String jenisHewan;
    public String jenisKelamin;
    public String warnaHewan;
    public String makananHewan;
    public int jumlahKaki;
    public int umurHewan;


    // 4 Method class hewan

    public void tampilkanAtribut() {
        System.out.println("====================================================================");
        System.out.println("Nama Hewan : " + namaHewan);
        System.out.println("Panggilan Hewan : " + panggilanHewan);
        System.out.println("Jenis Hewan : " + jenisHewan);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Warna Hewan : " + warnaHewan);
        System.out.println("Makanan Hewan : " + makananHewan);
        System.out.println("Jumlah Kaki Hewan : " + jumlahKaki);
        System.out.println("Umur Hewan : " + umurHewan);
    }

    public void tampilkanInfoHewan() {
        System.out.println("====================================================================");
        System.out.println("Nama Hewan : " + namaHewan);
        System.out.println("Jenis Hewan : " + jenisHewan);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur Hewan : " + umurHewan);
    }

    public void halloMakanan(){
        System.out.println("====================================================================");
        System.out.println("Ini Adalah Makanan Hewan = '"+makananHewan+"'");
        System.out.println("====================================================================");
    }

    public void halloJenisHewan(){
        System.out.println("====================================================================");
        System.out.println("Ini Adalah Nama Hewan = '"+namaHewan+"' + Dan Jenis Hewan = '"+jenisHewan+"'");
    }


    // 3 Constructor Class Hewan

    public hewan() {
        System.out.println("====================================================================");
        System.out.println();
        namaHewan = "Tolong Isi Nama Hewan";
        jenisHewan = "Tolong Isi Jenis Hewan";
        warnaHewan = "Tolong Isi Warna Hewan";
        jenisKelamin = "Tolong Isi Jenis Kelamin Hewan";
        makananHewan = "Tolong Isi Makanan Hewan";
        panggilanHewan = "Tolong Isi Nama Panggilan Hewan";
    }

    public hewan(String namaHewan, String panggilanHewan, String jenisHewan, String jenisKelamin, int umurHewan) {
        this.namaHewan = namaHewan;
        this.panggilanHewan = panggilanHewan;
        this.jenisHewan = jenisHewan;
        this.jenisKelamin = jenisKelamin;
        this.umurHewan = umurHewan;
    }

    public hewan(String namaHewan, String panggilanHewan, String jenisHewan, String jenisKelamin, String warnaHewan, String makananHewan, int jumlahKaki, int umurHewan) {
        this.namaHewan = namaHewan;
        this.panggilanHewan = panggilanHewan;
        this.jenisHewan = jenisHewan;
        this.jenisKelamin = jenisKelamin;
        this.warnaHewan = warnaHewan;
        this.makananHewan = makananHewan;
        this.jumlahKaki = jumlahKaki;
        this.umurHewan = umurHewan;
    }


    //Getter dan Setter(Seluruh)


    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getPanggilanHewan() {
        return panggilanHewan;
    }

    public void setPanggilanHewan(String panggilanHewan) {
        this.panggilanHewan = panggilanHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getWarnaHewan() {
        return warnaHewan;
    }

    public void setWarnaHewan(String warnaHewan) {
        this.warnaHewan = warnaHewan;
    }

    public String getMakananHewan() {
        return makananHewan;
    }

    public void setMakananHewan(String makananHewan) {
        this.makananHewan = makananHewan;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getUmurHewan() {
        return umurHewan;
    }

    public void setUmurHewan(int umurHewan) {
        this.umurHewan = umurHewan;
    }
}
