class Exactmultiple {

    static int ExactMultiple(int N, int M) {

       
        if (N == 0 || M == 0) {
            return 3;
        }

        
        if (N % M == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(ExactMultiple(10, 5)); 
   }
}       