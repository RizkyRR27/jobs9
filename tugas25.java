import java.util.Scanner;
public class tugas25 {
    public static void main(String[] args) {
        Scanner wkwk = new Scanner(System.in);

        int nilaiTertinggi, nilaiTerkceil, total;
        double ratarata;

        System.out.print("masukan banyak elemen array: ");
        int jmlElemen = wkwk.nextInt();
        int[] ganteng = new int [jmlElemen];

        
        for (int r =0; r<ganteng
        .length; r++){
            System.out.println("masukan elemen array ke-"+ r +" : ");
            ganteng[r] = wkwk.nextInt();
        }
        nilaiTertinggi = ganteng[0];
        nilaiTerkceil = ganteng [0];
        total = ganteng [0];

        for (int r=0; r<ganteng.length; r++){
            if (ganteng[r] > nilaiTertinggi){
                nilaiTertinggi = ganteng[r];
            }
            if (ganteng [r] < nilaiTerkceil){
                nilaiTerkceil = ganteng[r];
            }
            total += ganteng[r]; 
        }
        ratarata = total/jmlElemen;
        System.out.print("nilai paling tinggi: " +nilaiTertinggi);
        System.out.print("\nnilai paling rendah: " +nilaiTerkceil);
        System.out.print("\nrata rata semuannya: " +ratarata);
        }
    }

