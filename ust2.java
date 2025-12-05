import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = UserMainCode.calculateSum(a, b, c);
        System.out.println(result);
    }
}
public class UserMainCode {
    public static int calculateSum(int a, int b, int c) {
        int sum = 0;

        if (a == 13) return 0;
        else sum += a;

        if (b == 13) return sum;
        else sum += b;

        if (c == 13) return sum;
        else sum += c;

        return sum;
    }
}