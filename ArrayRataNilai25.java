import java.util.Scanner;
public class ArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner Rata25 = new Scanner(System.in);
        
       int [] nilaiMhs = new int [10];
       double rata2;
       int jmlMhs;
       int tdkLulus=0;
       double total1 = 0, total2 = 0, rata2Lls, rata2TdkLls;

       System.out.println("masukan jumlah mahasiswa : ");
       jmlMhs = Rata25.nextInt();


       for (int i=0; i<jmlMhs; i++){
        System.out.println("masukan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = Rata25.nextInt();
       }
       for (int i = 0; i < jmlMhs; i++){
        if (nilaiMhs[i] > 70){
            total1 += nilaiMhs[i];
        }
       }

       for (int i = 0; i < jmlMhs; i++){
        if (nilaiMhs[i] <=70){
            total2 += nilaiMhs[i];
            tdkLulus++;
        }
       }
       int totalLulus = 0;
       for (int i = 0; i < nilaiMhs.length; i++){
        if (nilaiMhs[i]>70){
            totalLulus++;
        }
       }
       rata2Lls = total1/totalLulus;
       rata2TdkLls = total2/tdkLulus;
       System.out.println("rata rata nilai lulus = "+rata2Lls );
       System.out.println("rata-rata nilai tidak lulus ="+rata2TdkLls);
       System.out.println("banyaknya mahasiswa yang lulus : "+totalLulus);
    }
}

