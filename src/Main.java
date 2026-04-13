import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEM PENJUALAN TIKET KERETA API ===\n");

        List<Kendaraan> daftarKereta = new ArrayList<>();

        daftarKereta.add(new KAEksekutif("Argo Bromo Anggrek", "Jakarta", "Surabaya", 450000));
        daftarKereta.add(new KAEksekutif("Gajayana", "Malang", "Jakarta", 520000));
        daftarKereta.add(new KAEkonomi("KRL Commuter Line", "Bogor", "Jakarta", 15000, true));
        daftarKereta.add(new KAEkonomi("Progo", "Jakarta", "Yogyakarta", 85000, false));
        daftarKereta.add(new KAEkonomi("Bengawan", "Solo", "Jakarta", 75000, true));

        System.out.println("-- Daftar Kereta Tersedia --");
        for (int i = 0; i < daftarKereta.size(); i++) {
            Kendaraan k = daftarKereta.get(i);
            System.out.println((i + 1) + ". " + k.getNama()
                    + " | Rute: " + k.getAsal() + " -> " + k.getTujuan()
                    + " | Harga: Rp " + k.hitungHarga());
        }

        Scanner scanner = new Scanner(System.in);

        Penumpang p1 = new Penumpang("Budi Santoso", "3201234567", "081234567890");
        Penumpang p2 = new Penumpang("Siti Rahayu", "3209876543", "089876543210");

        try {

        System.out.println("\n-- Pemesanan Tiket --");
        System.out.println("\nPilih kereta untuk " + p1.getNama() + " (masukkan nomor 1-" + daftarKereta.size() + "):");
        for (int i = 0; i < daftarKereta.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKereta.get(i).getNama());
        }

        int pilihanP1 = scanner.nextInt() - 1;
        System.out.print("Masukkan nomor kursi: ");
        String kursiP1 = scanner.next();

        Kendaraan keretaP1 = daftarKereta.get(pilihanP1); 
        ((interfaceabstract.Booking) keretaP1).pesan(p1.getNama(), kursiP1);


        System.out.println("\nPilih kereta untuk " + p2.getNama() + " (masukkan nomor 1-" + daftarKereta.size() + "):");
        for (int i = 0; i < daftarKereta.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKereta.get(i).getNama());
        }
        int pilihanP2 = scanner.nextInt() - 1;
        System.out.print("Masukkan nomor kursi: ");
        String kursiP2 = scanner.next();

        Kendaraan keretaP2 = daftarKereta.get(pilihanP2); 
        ((interfaceabstract.Booking) keretaP2).pesan(p2.getNama(), kursiP2);
 
        } catch (Exception e) {
            System.out.println("salah input, cilahkan coba lagi \n" +  e. getMessage());
            // TODO: handle exception

        } finally {
            scanner.close();
            System.out.println("program selesai");
        }
    
        
    }
}