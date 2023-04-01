import java.util.Scanner;

public class maino {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("faktoriyel gir : ");
        int n = scan.nextInt();
        int total = 1;
        for(int i = 1; i<=n; i++){
            total = total * i;
            System.out.println( n+ total);
        }



}
}
