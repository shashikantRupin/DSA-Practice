public class Recursion {
     public static void main(String[] args) {
      int n=12345;
      int DigitSum=Solve(n);
      System.out.println(DigitSum);
     }
     public static int Solve(int n){
      if(n==0){
            return 0;
      }
      return n%10+Solve(n/10);
     }

}
