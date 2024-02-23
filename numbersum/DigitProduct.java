public class DigitProduct {
      public static void main(String[] args) {
            int n = 12345;
            int ans = DigitsProduct(n);
            System.out.println(ans);
      }

      public static int DigitsProduct(int n) {
            if (n%10 == n) {
                  return 1;
            }
            return n % 10 * DigitsProduct(n / 10);
      }
}
