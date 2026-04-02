
import interfaceabstract.Booking;

public class KAEksekutif extends Kendaraan implements Booking {

    private double harga;
    private String kodeBooking;

    public KAEksekutif(String nama, String asal, String tujuan, double harga) {
      
        super(nama, asal, tujuan);
        this.harga = harga;
    }

    @Override
    public double hitungHarga() {
        return harga;
    }

    // Implementasi dari Interface Booking 
    @Override
    public boolean pesan(String namaPenumpang, String nomorKursi) {
        kodeBooking = "EKS-" + (int)(Math.random() * 9000 + 1000);
        System.out.println("\n Tiket Kereta Eksekutif berhasil dipesan!");
        System.out.println("Penumpang  : " + namaPenumpang);
        System.out.println("Kereta     : " + getNama());
        System.out.println("Rute       : " + getAsal() + " -> " + getTujuan());
        System.out.println("Kursi      : " + nomorKursi);
        System.out.println("Harga      : Rp " + hitungHarga());
        System.out.println("Kode Booking: " + kodeBooking);
        return true;
    }

    // Implementasi dari Interface Booking 
    @Override
    public boolean batalkan(String kodeBooking) {
        System.out.println("Tiket " + kodeBooking + " dibatalkan!");
        return true;
    }
}