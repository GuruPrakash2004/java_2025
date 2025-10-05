public class fibo {

    static long fib(int n){
        if (n > 1 ) {
            return fib(n-1)+fib(n-2)+fib(n-3);
            
        }
        else if (n == 1) {
            return 1 ;
        }
        return 0; 

    }
    public static void main(String[] args) {
        int n=8;
        for (int i =0 ; i < n; i++){
            System.out.println(fib(i));
        }
        
        
    }
}
