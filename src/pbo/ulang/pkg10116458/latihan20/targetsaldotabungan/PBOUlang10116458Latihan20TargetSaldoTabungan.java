/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoBulanan;
        
        while (saldoTabungan <= 6000000) {
            i = i + 1;
            saldoBulanan = bunga * saldoTabungan;        
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoTabungan);
        }
    }
    
}
