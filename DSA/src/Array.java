import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int x ;
        x = scanner.nextInt();
        arr = new int[x];
        int y;
        for (int i=0;i<arr.length;i++){
            y = scanner.nextInt();
        arr[i]=y;
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
