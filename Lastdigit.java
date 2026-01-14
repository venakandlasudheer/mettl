class Lastdigit {

    static int Lastdigit() {
        int num = -197;      
        return Math.abs(num % 10);
    }

    public static void main(String[] args) {
        System.out.println(Lastdigit());
    }
}
