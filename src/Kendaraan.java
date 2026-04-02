public abstract class Kendaraan {

    // ENCAPSULATION - private 
    private String nama;
    private String asal;
    private String tujuan;

    public Kendaraan(String nama, String asal, String tujuan) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
    }
    public abstract double hitungHarga();

    public String getNama() { return nama; }
    public String getAsal() { return asal; }
    public String getTujuan() { return tujuan; }
}