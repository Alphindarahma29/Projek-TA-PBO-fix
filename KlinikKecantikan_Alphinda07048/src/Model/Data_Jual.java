package Model;

public class Data_Jual 
{
    String id, jenis;
    int jumlah;
    double harga, totalHarga, jumlahKembalian, totalSemua;
    double totalBayar;
    
    public Data_Jual(String id, String jenis, int jumlah, double harga, double totalHarga, double jumlahKembalian, double totalSemua, double totalBayar) {
        this.id = id;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga = harga;
        this.totalHarga = totalHarga;
        this.jumlahKembalian = jumlahKembalian;
        this.totalSemua = totalSemua;
        this.totalBayar = totalBayar;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    Data_Jual(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getTotalHarga() {
        return getJumlah()*getHarga();
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public double getJumlahKembalian() {
        return getTotalBayar()-getTotalSemua();
    }

    public void setJumlahKembalian(double jumlahKembalian) {
        this.jumlahKembalian = jumlahKembalian;
    }

    public double getTotalSemua() {
        return totalSemua;
    }

    public void setTotalSemua(double totalSemua) {
        this.totalSemua = totalSemua;
    }
    
    
}
