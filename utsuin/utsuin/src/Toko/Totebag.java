package Toko;

/**
 *
 * @author Niko Silabest
 */
public class Totebag extends Tas
{
    int jumlahWarna;
    
    public Totebag(int jumlahWarna)
            {
                this.jumlahWarna=jumlahWarna;
            }
@Override
    double persenDiskon()
   {
       return ((50.0/jumlahWarna)+10.0)/100.0;
       
   }
}
