package Model;

public class Data_Treatment
{
    private String id, jenis;
    private String harga;

    public Data_Treatment(String id, String jenis, String harga) {
        this.id = id;
        this.jenis = jenis;
        this.harga = harga;
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

    public String getHarga() {
        return harga;
    }

    public void setHarga(String
            harga) {
        this.harga = harga;
    }
    
    
}

