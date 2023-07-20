import java.util.Scanner;

public class AlexScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println(help(a));
    }

    static int help(int a) {
        int score=1;
        while(a>1){
            if(a%2==0){
                a/=2;
            } else{
                score++;
                a-=1;
            }
        }
        return score;
    }
}