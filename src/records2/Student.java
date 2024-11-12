package records2;

public record Student(String firstName, String lastName, String studentNumber) {

    //    public void setStudentNumber(String number){
//        this.studentNumber=number;
//    }

    //NOT: recordlar default olarak immutable yani
    //değiştirilemez read-only'dir.
    //fieldları finaldır ve setter gibi metodlar eklenemez.

    public void printFirstName(){
        System.out.println("Ogrencinin adi : " + this.firstName);
    }



}
