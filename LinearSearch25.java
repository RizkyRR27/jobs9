import java.util.Scanner;
public class LinearSearch25 {

    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);

        int  key, hasil = 0, array;
        
        int [] arrayy = new int [6];

        System.out.println("masukan jumlah array: ");
        array = hehe.nextInt();

        

        for (int i = 0; i < arrayy.length; i++){
            System.out.println("masukan array ke-"+i+ " : ");
            arrayy[i]= hehe.nextInt();
            }
             System.out.print("masukan key yang anda ingin cari : ");
             key = hehe.nextInt();

             for (int i = 0; i<arrayy.length; i++){
                if (arrayy[i] == key){
                     hasil = i;
                    break;
                }
             }
             if (hasil !=0){
                System.out.println("key ada dalam index ke-"+hasil);
             }else{
                System.out.println("key ga ketemu");
             }
               
               
            }
        }
       
    
