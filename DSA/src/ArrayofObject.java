import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayofObject {
    public static void main(String[] args) {
        Student arr[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Scanner scanner = new Scanner(System.in);
        try {
            int i = Integer.parseInt(br.readLine());;
            arr = new Student[i];

            for (int j = 0; j < arr.length; j++) {
                int x =Integer.parseInt(br.readLine());
                String y = br.readLine();
                arr[j] = new Student(x, y);
            }
            for (int q = 0; q < arr.length; q++) {
                System.out.println(arr[q]);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
