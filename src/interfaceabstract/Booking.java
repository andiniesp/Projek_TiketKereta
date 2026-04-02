package interfaceabstract;


public interface Booking {

    boolean pesan(String namaPenumpang, String nomorKursi);
    boolean batalkan(String kodeBooking);
}