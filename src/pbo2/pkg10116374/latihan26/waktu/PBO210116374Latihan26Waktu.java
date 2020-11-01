package pbo2.pkg10116374.latihan26.waktu;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBOIF2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menampilkan waktu saat ini
 *
 */
public class PBO210116374Latihan26Waktu {

    public static String getTanggal(){
        DateFormat dateformat = new SimpleDateFormat("EEEE, dd MMM YYYY");
        Date tanggal = new Date();
        return dateformat.format(tanggal);
    }
    
    public static String getWaktu(){
        DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        Date waktu = new Date();
        return timeformat.format(waktu); 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hari ini adalah hari : " + getTanggal() + " " + getWaktu());
    }
    
}
