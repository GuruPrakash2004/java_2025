public class lex2 {
    

    public static String  smallestRotation(String s) {
        
    String doubled = s+s;
    int n = s.length();
    int i=0,k=0,j=1;

    while(i<n && j<n && k< n){
        char firstChar = doubled.charAt(i);
        char secondChar = doubled.charAt(j);

        if(firstChar == secondChar){
        k++;
        continue;
        }

        if(firstChar > secondChar){
            i = i+k+1;
        }
        else{
            j = j+k+1;
        }

        if(i == j){
            j++;
            k = 0;
        }

    }

        int start = Math.min(i, j); 
        //System.out.println(start);

        return doubled.substring(start, start+n);
        
    }


        public static void main(String[] args) {
        String[] tests = {"baca", "dcab", "abc", "zaz", "banana"};
        for (String t : tests) {
            System.out.println("Input: " + t + " -> Smallest rotation: " + smallestRotation(t));
        }
    }
}
