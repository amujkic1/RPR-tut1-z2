package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner unos = new Scanner(System.in);
        int n = unos.nextInt();
        for(int i=1; i<n; i++){
            if(i%sumaCifara(i) == 0) System.out.print(i+" ");
        }
    }
    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }
}