
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Student {
 int age;
 String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
 }

 public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
 }


 
    
}

class StudentCollections {
    
    public static void main(String[] args) {
        //Comparator was a interface
        Comparator<Student> com = new Comparator<Student>() {
             public int compare(Student i ,Student j){
                if(i.name.length() > j.name.length()){
                     return 1;
                }
                else
                    return -1;
            } 
        };
        
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "guru prakash"));
        studs.add(new Student(41, "hari prasad"));
        studs.add(new Student(52, "ragu"));
        studs.add(new Student(13, "rahu arjun"));


        Collections.sort(studs, com);

     //   System.out.println(studs);

     for(Student s : studs){
        System.out.println(s);
     }



    }

}
