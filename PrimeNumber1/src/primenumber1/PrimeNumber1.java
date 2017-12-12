package primenumber1;

public class PrimeNumber1 {

    public static void main(String[] args) {
        int number = 2;

        System.out.println(prime(number));
    }

    public static String prime(int number) {

        int divisor;
        int div = 0;
        String p = "prime";
        String np = "Notprime";

        if (number == 0 || number == 1 || number == 2) {
            return p;
        } else {

//        do {
//            div = number % divisor;
//            if (div == 0) {
//                break;
//            }
//
//            divisor++;
//        } while (divisor < number);



            for (divisor = 2; divisor < number; divisor++) {
                div = number % divisor;

                if (div == 0) {
                    break;
                }
            }
            if (div != 0) {
                return p;

            } else {
                return np;
            }

        }

    }
}
