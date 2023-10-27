import java.util.Scanner;
public class LinearSearch25 {

    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);

        int [] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil = i;
                break;
            }
        }
        System.out.println("key ada dalam array pada posisi index ke-"+hasil);
    }
}