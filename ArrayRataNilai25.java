import java.util.Scanner;
public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner Rata25 = new Scanner(System.in);
        
        int [] nilaiMhs = new int [10];
        double total = 0;
        double rata2;

        for (int i = 0; i <nilaiMhs.length; i++){
            System.out.println("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = Rata25.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-Rata nilai = "+rata2);
    }
}
