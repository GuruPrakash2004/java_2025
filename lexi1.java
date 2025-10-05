public class lexi1 {
// a b c d e f -> a a b c d e


public static String smallestString(String s){
    if(s == null || s.length() == 0) {
        return s;
    }
    char[] arr = s.toCharArray();
    int n = arr.length;

    int i = 0;

    while(i < n && arr[i] == 'a'){
         i++;
    }
    if(i == n){
        arr[n-1] = 'z';
        return new String(arr);
    }
 int j = i;
    while (j< n && arr[i]!= 'a') {
        arr[j] = (char)(arr[j]-1);
        j++;   
    }
     return new String(arr);
    


}
    public static void main(String[] args) {
        String[] tests = {
            "hackerrank",
            "abc",
            "aaa",
            "b",
            " ",
            "zzz",
            "aaba"
        };

        for (String t : tests) {
            System.out.printf("input: %-12s -> output: %s%n", t, smallestString(t));
        }
        
    }
}
