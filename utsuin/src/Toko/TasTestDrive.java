
package Toko;

/**
 *
 * @author Niko Silabest
 */
public class TasTestDrive 
{
    public static void main(String[] args) 
    {
      Tas tas = new Tas();
      
      Backpack backpack = new Backpack(10);
      Slingbag slingbag = new Slingbag(10);
      Totebag totebag = new Totebag(10);
       
      tas.setHargaJual(100.000);
      tas.setWarnaDasar("Pink");
      tas.setBahan("Titanium");
      tas.cetakInfo();
      backpack.persenDiskon();
      backpack.hitungPotonganDiskon();
      backpack.hitungHargaSetelahDiskon();
       
      
    }
}
