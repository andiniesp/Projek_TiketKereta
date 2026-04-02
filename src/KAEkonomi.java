import interfaceabstract.Booking;

public class KAEkonomi  extends Kendaraan implements Booking {
    private double harga;
    private boolean isSubsidi;
    private String kodeBooking;

     public KAEkonomi(String nama, String asal, String tujuan, 
                     double harga, boolean isSubsidi) {
        super(nama, asal, tujuan);
        this.harga = harga;
        this.isSubsidi = isSubsidi;
}

@Override
    public double hitungHarga() {
        if (isSubsidi) {
            return harga * 0.70; // diskon 30%
        }
        return harga;
    }

    @Override
    public boolean pesan(String namaPenumpang, String nomorKursi) {
        kodeBooking = "EKO-" + (int)(Math.random() * 9000 + 1000);
        System.out.println("\n Tiket Kereta Ekonomi berhasil dipesan!");
        System.out.println("Penumpang  : " + namaPenumpang);
        System.out.println("Kereta     : " + getNama());
        System.out.println("Rute       : " + getAsal() + " -> " + getTujuan());
        System.out.println("Kursi      : " + nomorKursi);
        System.out.println("Harga      : Rp " + hitungHarga());
        System.out.println("Kode Booking: " + kodeBooking);
        return true;
    }

    @Override
    public boolean batalkan(String kodeBooking) {
        System.out.println("Tiket " + kodeBooking + " dibatalkan!");
        return true;
    }
}