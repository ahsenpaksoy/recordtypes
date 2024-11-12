package records1;

//mutable

public class Employee { //POJO : Plain Old Java Objects
    private String firstName;
    private String lastName;
    private String email;

    //paramli const

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //getter - setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
    //toString : object class indan gelir. object nın stringe donusmesini saglar.
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';

     */

     //toString
    @Override
    public String toString() {
        return "isim='" + firstName + '\'' +
                ", soyisim='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    //istenirse degisiklik yapilabilir

}
