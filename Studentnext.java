import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Studentnext  implements Comparable<Studentnext>{
 int age;
 String name;

  public Studentnext(int age, String name) {
    this.age = age;
    this.name = name;
 }

 public String toString() {
    return "Studentnext [age=" + age + ", name=" + name + "]";
 }


 public int compareTo(Studentnext that) {
    return this.age > that.age ?1:-1;
 }

 


 
    
}

class StudentnextCollections {
    
    public static void main(String[] args) {
        //Comparator was a interface
        Comparator<Studentnext> com = ( i , j) ->   i.age > j.age? 1:-1; 
        
        List<Studentnext> studs = new ArrayList<>();

        studs.add(new Studentnext(21, "guru prakash"));
        studs.add(new Studentnext(41, "hari prasad"));
        studs.add(new Studentnext(52, "ragu"));
        studs.add(new Studentnext(13, "rahu arjun"));


        Collections.sort(studs,com);

     //   System.out.println(studs);

     for(Studentnext s : studs){
        System.out.println(s);
     }



    }

}
