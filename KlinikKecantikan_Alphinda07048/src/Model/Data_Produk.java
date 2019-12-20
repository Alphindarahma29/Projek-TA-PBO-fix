package Model;

public class Data_Produk 
{
    String id, produk;
    String jumlah;
    String harga;

    public Data_Produk(String id, String produk, String jumlah, String harga) {
        this.id = id;
        this.produk = produk;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    
}
