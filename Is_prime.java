class Is_prime {

    public static int Is_prime() {
        int N = 7;   

        if (N <= 1) {
            return 1;  
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 1;  
            }
        }

        return 2;  
    }

    public static void main(String[] args) {
        System.out.println(Is_prime());
    }
}
