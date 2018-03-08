
/**
 * Write a description of class JHotel here.
 *
 * @author Raudina Asrining Putri
 * @version 01-03-2018
 */
public class JHotel
{
    /**
     * Constructor for objects of class pesanan
     */
    public JHotel()
    {
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String args[])
    {
        Customer nama = new Customer(20, "raudina");
        Lokasi tempat = new Lokasi(1,2,"depok");
        Hotel hotel = new Hotel("margo hotel", tempat,5);
        Pesanan pesan = new Pesanan(1000, nama);
        pesan.printData();
        hotel.printData();
        nama.setNama("nama2");
        nama.printData();
    }
}
