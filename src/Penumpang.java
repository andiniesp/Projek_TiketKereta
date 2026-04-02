public class Penumpang {
     private String nama;
    private String nik;
    private String noHP;

    public Penumpang(String nama, String nik, String noHP) {
        this.nama = nama;
        this.nik = nik;
        this.noHP = noHP;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong.");
        }
        
    }
}
