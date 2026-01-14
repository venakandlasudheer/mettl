class Possible { 
    public static void main(String[] args){
        int num = 26649;
        int count = 0;
        int[] freq = new int[10];
        while(num>0){
            int digit = num%10;
            freq[digit]++;
            num = num/10;
        }
        for(int i =0; i<freq.length; i++){
            if(freq[i]%2!=0){
                count++;
            }
        }
        if(count<=1){
            System.out.println("Ispalindrom");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}