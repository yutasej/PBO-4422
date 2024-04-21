class mahasiswa {
    private String nama;
    private String nim;
    private String alamat;

    public void setNama(String newNama){
        this.nama = newNama;
    }
    public void setNim(String newNim){
        this.nim = newNim;
    }
    public void setAlamat(String newAlamat){
        this.alamat = newAlamat;
    }

    public String getNama(){
        return this.nama;
    }
    
    public String getNim(){
        return this.nim;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
}

public class Enkapsulasi {
    public static void main(String[] args) {
        mahasiswa mahasiswaku = new mahasiswa();
        
        mahasiswaku.setNama("Yutase");
        mahasiswaku.setNim("A11.2022.14505");
        mahasiswaku.setAlamat("Jl. Kanguru Utara VI No 1 RT 05 RW 03");

        System.out.println("Nama Saya Adalah: " +mahasiswaku.getNama());
        System.out.println("NIM Saya Adalah: " +mahasiswaku.getNim());
        System.out.println("Alamat Rumah Saya Adalah: " +mahasiswaku.getAlamat());
    }
}