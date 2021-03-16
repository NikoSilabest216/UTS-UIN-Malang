package Toko;

public class Tas 
{
    String jenisTas;
    String warnaDasar;
    String bahan;
    double hargaJual;
   

    public String getJenisTas() {
        return jenisTas;
    }

    public void setJenisTas(String jenisTas) {
        this.jenisTas = jenisTas;
    }

    public String getWarnaDasar() {
        return warnaDasar;
    }

    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }


double persenDiskon()
{
    return 0;
}
        
    void cetakInfo()
    {
        System.out.println("Ini adalah infomu: ");
        System.out.println(""+getBahan());
        System.out.println(""+getJenisTas());
        System.out.println(""+getWarnaDasar());
    }
    
   
   double hitungPotonganDiskon()
    {
        return 0;
    }
     double hitungHargaSetelahDiskon()
    {
       return 0;
    }
}
