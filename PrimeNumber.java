public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(45));
        System.out.println(isPrime(2));
        System.out.println(isPrime(14));
    }

    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.ceil(Math.sqrt(n)); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
