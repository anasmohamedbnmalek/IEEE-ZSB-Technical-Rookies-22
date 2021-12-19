import java.util.Scanner;
class calc {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.println("input your number");
    int n = sc.nextInt();
    for (int i = 1;i <= n; i++) {
        if (i != n) {
            System.out.print(i + "+");
        } else {
            System.out.print(i + "=");
        }
    }
    System.out.print(n*(n+1)/2);
    }
}
