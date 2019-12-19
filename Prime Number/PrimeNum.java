public class Main {

    public static void main(String[] args) {
	//Check whether it is a prime number or not
        int num = 29;
        boolean isPrime = true;
        //Num checker
        if (num <= 1 ) {
            System.out.println( num + "not a prime number.");
        } else {
            // We only have to loop through 2 to half of num, because no number is divisible by more than its half.
            for( int i = 2; i <= i / 2; i++){
                if( num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println( num + " is a prime number");
            } else {
                System.out.println(num + "is not a prime number");
            }
        }
    }
}
