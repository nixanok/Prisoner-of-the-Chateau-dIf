import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C, D, E;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();
        E = scanner.nextInt();
        if ((Math.max(D, E) >= Math.max(A, C) && Math.min(D, E) >= Math.min(A, C)) ||
                (Math.max(D, E) >= Math.max(B, C) && Math.min(D, E) >= Math.min(B, C)) ||
                (Math.max(D, E) >= Math.max(A, B) && Math.min(D, E) >= Math.min(A, B))) {
                System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
