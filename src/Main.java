public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEM PENJUALAN TIKET KERETA API ===\n");

        Penumpang p1 = new Penumpang("Budi Santoso", "3201234567", "081234567890");
        Penumpang p2 = new Penumpang("Siti Rahayu", "3209876543", "089876543210");

        System.out.println("\n-- Daftar Kereta Tersedia --");
        KAEksekutif eksekutif = new KAEksekutif(
            "Argo Bromo Anggrek",
            "Jakarta",
            "Surabaya",
            450000
        );

        KAEkonomi ekonomi = new KAEkonomi(
            "KRL Commuter Line",
            "Bogor",
            "Jakarta",
            15000,
            true // bersubsidi
        );

        Kendaraan[] semuaKereta = {eksekutif, ekonomi};

        for (Kendaraan k : semuaKereta) {
            System.out.println(k.getNama() + " | Harga: Rp " + k.hitungHarga());
        }

        
        eksekutif.pesan(p1.getNama(), "12A");
        ekonomi.pesan(p2.getNama(), "5B");

        System.out.println("\n-- Pembatalan Tiket --");
        eksekutif.batalkan("EKS-1234");
    }
}