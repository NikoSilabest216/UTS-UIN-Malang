
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
       
      backpack.setHargaJual(100.00);
      backpack.setJenisTas("Tas Punggung");
      backpack.setBahan("Titanium");
      backpack.setWarnaDasar("Pink");
      backpack.cetakInfo();
      System.out.println("Anda dapat diskon: "+backpack.persenDiskon());
      System.out.println("Potongan harga anda: "+backpack.hitungPotonganDiskon());
      System.out.println("Harga tas: "+backpack.hitungHargaSetelahDiskon());
      slingbag.setHargaJual(500.00);
      slingbag.setJenisTas("Tas Selempang");
      slingbag.setBahan("Vibranium");
      slingbag.setWarnaDasar("Pink");
      slingbag.cetakInfo();
      System.out.println("Anda dapat diskon: "+slingbag.persenDiskon());
      System.out.println("Potongan harga anda: "+slingbag.hitungPotonganDiskon());
      System.out.println("Harga tas: "+slingbag.hitungHargaSetelahDiskon());
      totebag.setHargaJual(350.00);
      totebag.setJenisTas("Tas Belonjo");
      totebag.setBahan("Adamantium");
      totebag.setWarnaDasar("Pink");
      totebag.cetakInfo();
      System.out.println("Anda dapat diskon: "+totebag.persenDiskon());
      System.out.println("Potongan harga anda: "+totebag.hitungPotonganDiskon());
      System.out.println("Harga tas: "+totebag.hitungHargaSetelahDiskon()); 
    }
}
