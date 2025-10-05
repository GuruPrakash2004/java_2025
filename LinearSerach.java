public class LinearSerach {

    public static void l_search(int[] arr,int x){
        for(int i=0;i < arr.length;i++){
            if(arr[i]==x){
                System.out.println(i+" ");
               // return ;
            }
            
        }
        //return -1;
        System.out.println("the value is not found !");
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,22,6,7,88,9,22} ;
    
        int target = 22;
       // int result = ;
       l_search(arr,target);
        //System.out.println("the value "+);

    }
    }
    

