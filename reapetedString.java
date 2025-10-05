import java.util.Scanner;

public class reapetedString {
    public static long reapetedString_s(String s, long  Sub_length ){
        int n =s.length();
        //q*(frq a in s)+(frq of a in r)
        long q=0,r=0;
        q = Sub_length / n;
        r = Sub_length % n;
        long partial_s = (r == 0)? 0: r;
        long aOut = q * a_count(s, n) + a_count(s, partial_s);
        return aOut;

    }
    public static long  a_count(String s, long n){
        long count_a = 0;
        for(int i = 0 ; i < n ; i++){
            if (s.charAt(i)== 'a') {
                count_a++;           
            }
        }
        return count_a;
    }
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string :");
    String s = sc.next();

 System.out.println("enter the Sub string length :");
    long Sub_length  = sc.nextLong();

   

     long a_count = reapetedString_s(s,Sub_length);
     System.out.println("Frequency of a is:" + a_count);



    }
}


/*
int jump_count = -1 //because of jumping out of bound
 for(int i =0 ; i < arr.length;){
 if(i+2 < arr.length && arr[i+2] == 0){
    i = i+2;
    }
    else{
     i= i +1
    }
     jump_count ++;
 }
     return jump_count; 


     OR

int jump_count = -1 //because of jumping out of bound
    for(int i =0 ; i < arr.length;){
        if(i+2 < arr.length && arr[i+2] == 0){
            i++;
        }
        i++;
    
     jump_count ++;
 }
     return jump_count; 

OR

  
int jump_count = -1 //because of jumping out of bound
    for(int i =0 ; i < arr.length; i++,jump_count ++){
        if(i+2 < arr.length && arr[i+2] == 0){
            i++;
        }
 }
     return jump_count; 
   
 */