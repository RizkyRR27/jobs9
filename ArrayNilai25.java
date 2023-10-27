import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner Ar25 = new Scanner(System.in);

        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = Ar25.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir [i] >70) {
                 System.out.println("Nilai akhir ke-"+i+ "lulus!");
            
             
            } else if (nilaiAkhir [i] <70) {
                 System.out.println("Nilai akhir ke-"+i+ "Tidak lulus!");
            } else {
                System.out.println("nak mana lau????????????????????");
            }
        }
            

    }
}
