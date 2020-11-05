import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program Saldo Tabungan OOP
 *
 */

public class SaldoTabungan {
    public int saldoAwal, lamaNabung;
    public double bungaPerBulan;

    public void hitungSaldo(){
        saldoAwal = 3500_000;
        bungaPerBulan = 0.08;
        lamaNabung = 8;
        for (int i = 1; i <= lamaNabung; i++) {
            saldoAwal = (int) (saldoAwal + (saldoAwal * bungaPerBulan));
            NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id", "ID"));
            System.out.println("Saldo di bulan ke-" + i + " Rp." + numberFormat.format(saldoAwal));
        }
    }

    public static void main(String[] args) {
        SaldoTabungan saldoTabungan = new SaldoTabungan();
        saldoTabungan.hitungSaldo();
    }
}
