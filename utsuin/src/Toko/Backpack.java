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
public class Backpack extends Tas 
{
    int jumlahKantong;
    
    public Backpack(int jumlahKantong)
            {
                this.jumlahKantong=jumlahKantong;
            }

   
    
    
    
@Override
    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

     @Override
           
   double persenDiskon()
   {
       double persenDiskon=((50/jumlahKantong)+5)/100;
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
