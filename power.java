public class power {

    static long pow(int x,int n){
   if(n!=0){
    return x * pow(x,n-1);
   }
//    else if(n < 0){
//     return 1/pow(x,-n);
//    }
   else if(n == 0){
     return 1;
   }
   return 1;
    }
    
    public static void main(String[] args) {
        // int x,n;
       System.out.println(pow(2, -10));
        
    }
}
