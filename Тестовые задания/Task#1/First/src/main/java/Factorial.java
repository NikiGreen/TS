public class Factorial {
        static int calcFactorial(int n){
            int result = 1;
            for (int i = 1; i <=n; i ++){
                result = result*i;
            }
            return result;
        }

}
