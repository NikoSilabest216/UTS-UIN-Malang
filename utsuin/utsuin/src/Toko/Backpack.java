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
  

    /**
     *
     * @return
     */
    
           
    double persenDiskon()
   {
       return ((50.0/jumlahKantong)+5.0)/100.0;
       
   }

   
    
    
    
}
