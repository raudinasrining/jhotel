
/**
 * class Pesanan
 *
 * @author Raudina Asrining Putri
 * @version 10-03-2018
 */

import java.util.Date;
public class Pesanan
{
    //variabel instance untuk class Pesanan
    private int id;
    private double biaya;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private double jumlahHari;
    private Date tanggalPesan;
    
    /**
     * Constructor untuk objek dari class pesanan
     * @param biaya,pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {//this digunakan karena nama variabel instance sama dengan
     //nama variabel parameter
         biaya = kamar.getDailyTariff()*jumlahHari;
         this.pelanggan = pelanggan;
         this.jumlahHari=jumlahHari;
         isAktif = true;
         tanggalPesan= new Date();
    }
    
    /**
     * metode ini untuk mengembalikan nilai biaya
     *
     * @return biaya
     */
    public int getID(){ return id;}

    public double getBiaya()
    {
        return biaya;
    }
    
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
     * metode ini mengembalikan nilai pelanggan
     *
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    /**
     * metode ini untuk mengembalikan nilai isDiproses
     *
     * @return isDiproses
     */
    public boolean getStatusAktif(){return isAktif;}

    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * metode ini untuk mengembalikan nilai isSelesai
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    
    /**
     * metode ini untuk menetapkan nilai biaya
     *
     * @param biaya 
     */
    public void setID(int id){ this.id=id;}
    public void setBiaya()
    { //this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari=jumlahHari;
    }
    
    /**
     * metode ini untuk menetapkan nilai pelanggan
     *
     * @param pelanggan
     */
    public void setPelanggan(Customer pelanggan)
    {//this digunakan karena nama variabel instance sama dengan
      //nama variabel parameter
        this.pelanggan=pelanggan;
    }
    public void setStatusAktif(boolean aktif){
        this.isAktif=isAktif;
    }

    /**
     * metode ini untuk menetapkan nilai diproses
     *
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * metode ini untuk menetapkan nilai diproses
     *
     * @param selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai=selesai;
    }
    
    /**
     * metode untuk mengembalikan nilai pada kamar
     * @return kamar
     */
    public void setRoom(Room kamar)
    {
        this.kamar=kamar;
    }
    
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }
   
    public String toString()
    {
        return "\nPesanan\n Nama Pelanggan\t:" + pelanggan.getNama()+"\n Jumlah Hari\t:"+jumlahHari+"\nBiaya\t:"+biaya+"\nStatus Diproses\t:"+ isDiproses + "\nStatus Selesai\t:"+isSelesai;
    }
    
}