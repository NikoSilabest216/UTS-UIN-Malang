/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

/**
 *
 * @author Niko Silabest
 */
public class Slingbag extends Tas
{
    int jumlahTali;
    
    public Slingbag(int jumlahTali)
    {
        this.jumlahTali=jumlahTali;
    }
@Override
    public void setJenisTas(String jenisTas) {
        this.jenisTas = "Tas Selempang";
    }
@Override
    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = "Pink";
    }
@Override
    public void setBahan(String bahan) {
        this.bahan = "Titanium";
    }
   
    
    
    
@Override
    public void setHargaJual(double hargaJual) {
        this.hargaJual = 100.000;
    }

     @Override
   double persenDiskon()
   {
       double persenDiskon=((50/jumlahTali)+5)/100;
       System.out.println("Diskon Tete: "+persenDiskon);
       return persenDiskon;
   }
    @Override
    double hitungPotonganDiskon()
    {
        double hitungPotonganDiskon=persenDiskon()*getHargaJual();
        System.out.println("Potongan total: "+hitungPotonganDiskon);
        return hitungPotonganDiskon;
    }
    @Override
    double hitungHargaSetelahDiskon()
    {
        double hitungHargaSetelahDiskon=getHargaJual()-hitungPotonganDiskon();
        System.out.println("Harga barang: "+hitungHargaSetelahDiskon);
        return hitungHargaSetelahDiskon;
    }
    
}
