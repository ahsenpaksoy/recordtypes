package records2;

public class Runner {
    public static void main(String[] args) {

        Student student1 = new Student("Victor","Hugo","123456");
        Student student2 = new Student("Lev","Tolstoy","123789");

        StudentRepo repo = new StudentRepo();

        //bu ogrencileri kaydedelim
        repo.save(student1);
        repo.save(student2);

        //tum kayıtlari listeleyelim
        System.out.println("-------------------- Tum Ogrenciler --------------------");
        repo.printAllStudents();

        student1.printFirstName();

        //listedeki 1. indexteki ogrencinin numarasi yanlis girilmis
        //degistirmek istiyoruz...

        //String bir degerde concatınation yapildiginda yeni obje olusturulur

        Student newStudent = new Student(repo.students.get(1).firstName(),
                                         repo.students.get(1).lastName(),
                                         "123780");
        repo.save(newStudent);

        //eski ogrenciyi de silelim
        repo.delete(student2);

        //tum ogrencileri listele
        System.out.println("-------------------- Tum Ogrenciler --------------------");
        repo.printAllStudents();




    }
}






