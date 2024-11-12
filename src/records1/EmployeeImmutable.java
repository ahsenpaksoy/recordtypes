package records1;
    /*
    Bazı durumlarda thread güvenliği(thread-safe), cachede veri tutarlılığı,
    test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.
     */

import java.util.Objects;

public class EmployeeImmutable { // bu class i aynen record ile yapalim

    private final String firstName;
    private final String lastName;
    private final String email;

    //paramli const
    public EmployeeImmutable(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getter : read only
    //setter : final oldugu icin degistiirilemesin diye yazmiyoruz
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //toString


    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true; //employee2.equals(employee2)  referans ve degerler ayniysa

        if (obj==null || this.getClass()!=obj.getClass()) return false;
        //employee2.equals(null)
        //employee2.equals(employee1)

        EmployeeImmutable emp=(EmployeeImmutable) obj;
        //employee2.equals(employee)  class ayni referans farkli ise degerlerine bak hepsi true ise ayni obje lerdir

        return Objects.equals(this.firstName,emp.firstName) &&
                Objects.equals(this.lastName,emp.lastName) &&
                Objects.equals(this.email,emp.email);
        //emp2 ile emp3 fieldlari ayni ise true
    }

    //bu class tan uretilen objeler icin benzersiz kodlar uretir. object classindaki mevcut hali referensa bakar
    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,email);
    }
}










