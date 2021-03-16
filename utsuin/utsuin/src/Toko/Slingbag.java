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
    double persenDiskon()
   {
       return ((50.0/jumlahTali)+7.0)/100.0;     
   }
}
