package records2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    List<Student> students = new ArrayList<>();

    //ogrencileri kaydetme
    public void save(Student student){
        this.students.add(student);

    }

    //tum ogrencileri listeleme
    public void printAllStudents(){
        for (Student std : this.students){
            System.out.println(std);
        }
    }

    //mevcut ogrenciyi silme
    public void delete(Student student){
        this.students.remove(student);
    }

}





