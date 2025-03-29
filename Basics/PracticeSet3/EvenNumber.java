import java. util.*;

public class EvenNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number where you want to even number :");
        int a = sc.nextInt();

        for (int i = 2; i < a; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}