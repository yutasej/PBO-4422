class BangunDatar {
    public float luas(){
        return 0;
    }

    public float keliling(){
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    public void setSisi(float sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas(){
        return sisi*sisi;
    }

    @Override
    public float keliling(){
        return 4*sisi;
    }
}

class Lingkaran extends BangunDatar {
    float r;

    public void setR(float r){
        this.r = r;
    }

    @Override
    public float luas(){
        return (float)3.14 * r * r;
    }

    @Override
    public float keliling(){
        return 2 * (float) 3.14 * r;
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public void setPanjang(float panjang){
        this.panjang = panjang;
    }

    public void setLebar(float lebar){
        this.lebar = lebar;
    }

    @Override
    public float luas(){
        return panjang * lebar;
    }

    @Override
    public float keliling(){
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public void setAlas(float alas){
        this.alas = alas;
    }

    public void settinggi(float tinggi){
        this.tinggi = tinggi;
    }

    public float luas(){
        return (float) 0.5 * alas * tinggi;
    }

    public float keliling(){
        return alas + alas + alas;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();

        System.out.println("Tugas Inheritance");
        System.out.println("===============================================================");
        // Persegi
        System.out.println("Luas dan Keliling Persegi");
        persegi.sisi = 10;
        System.out.println("Luas persegi dengan sisi 10 adalah: " +persegi.luas());
        System.out.println("Keliling persegi dengan sisi 10 adalah: " +persegi.keliling());

        System.out.println("===============================================================");
        //Lingkaran
        System.out.println("Luas dan Keliling Lingkaran");
        lingkaran.r = 7;
        System.out.println("Luas lingkaran dengan jari - jari 7 adalah: " +lingkaran.luas());
        System.out.println("Keliling lingkaran dengan jari - jari 7 adalah: " +lingkaran.keliling());

        System.out.println("===============================================================");
        //Persegi Panjang
        System.out.println("Luas dan Keliling Persegi Panjang");
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 6;
        System.out.println("Luas persegi panjang dengan panjang 8 dan lebar 6 adalah: " +persegipanjang.luas());
        System.out.println("Keliling persegi panjang dengan panjang 8 dan lebar 6 adalah: " +persegipanjang.keliling());

        System.out.println("===============================================================");
        //Segitiga
        System.out.println("Luas dan Keliling Segitiga");
        segitiga.alas = 10;
        segitiga.tinggi = 8;
        System.out.println("Luas segitiga dengan alas 10 dan tinggi 8 adalah: " +segitiga.luas());
        System.out.println("Keliling segitiga dengan alas 10: " +segitiga.keliling());
    }
}