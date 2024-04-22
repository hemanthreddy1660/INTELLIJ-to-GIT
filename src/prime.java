class prime {
    public static int countPrimes(int n) {
        int a=2;
        int count = 0;
        int number =0;
        while(a<n){

            for(int i=1;i<=a/2;i++) {
                if (a % i == 0) {
                    count++;
                if(count>2)break;
            }
            }
            if(count<=1){
                number++;

            }
            count = 0;
            a++;
        }return number;
    }

    public  static void main(String[] args) {
        int numbers = countPrimes(499979);
        System.out.println(numbers);

    }
}