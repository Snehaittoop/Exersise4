import java.util.Scanner;

public class PrimeRange {
    public static boolean Check(int n){
        boolean isPrime=true;
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                return isPrime;
            }
        }
        return isPrime;

    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("start");
        int start=input.nextInt();
        System.out.println("end");
        int end=input.nextInt();
        for(int i=start;i<=end;i++){
            if(Check(i)){
                System.out.println(i);
            }

        }

    }
}
