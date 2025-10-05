public class carryforward {
    public static void main(String[] args) {
         String s = "acbagkagg";
        int count = 0;
        for(int i = 0 ; i < s.length();i++){

            for(int j = i+1 ; j < s.length();j++){
                if(s.charAt(i)=='a' && s.charAt(j)=='g'){
                    count++;
                }
            }
        }
        System.out.println("the count is: "+count);

        

//optimal

        int count_a = 0 ;
        int ans = 0;
        for(int i = 0 ; i < s.length();i++){

            if(s.charAt(i)=='a'){
                count_a++;
            }
            else if(s.charAt(i)=='g'){
                ans+=count_a;
            }
        }
        System.out.println("the count is: "+ans);

    }
    
}
