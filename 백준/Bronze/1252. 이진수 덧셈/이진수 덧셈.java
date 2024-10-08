import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        //BigInteger 형변환 하면서 10진수로 바꿔준다.(A, 2)가 10진수로 바꾸는 방법
        BigInteger A_binary = new BigInteger(A, 2);
        BigInteger B_binary = new BigInteger(B, 2);

        //합 연산식(add)로 더해서 변수에 저장.
        BigInteger sum = A_binary.add(B_binary);

        //풀이방식에 적어둔 대로 2진수로 변환
        String sum_binary = sum.toString(2);

        System.out.println(sum_binary);
    }
}