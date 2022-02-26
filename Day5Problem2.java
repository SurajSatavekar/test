
/* Find The names of student whose marks is greater than 80 from student list by using Stream */

package Day5Assignments;
import java.util.stream.*;  
import java.util.ArrayList;
import java.util.List;
class Student{
    String name;  
    int marks;  
    public Student( String name, int marks) {  
        this.name = name;  
        this.marks=marks;
    }  
}  
public class Day5Problem2 {  
    public static void main(String[] args) {  
        ArrayList<Student> studentsList = new ArrayList<Student>();  
         
        studentsList.add(new Student("Suraj",90));  
        studentsList.add(new Student("Abhijeet",92));  
        studentsList.add(new Student("Pravin",78));  
        studentsList.add(new Student("Jivan",82));  
        studentsList.add(new Student("Ketan",75));  
        List<String> stdList =studentsList.stream().filter(m -> m.marks > 80).map(m->m.name).collect(Collectors.toList());
        System.out.println(stdList);  
        }  
    }  
