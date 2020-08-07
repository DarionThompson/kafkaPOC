//package DataSource;
//
//import org.hibernate.annotations.NaturalId;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "Person")
//public class Person {
//    private @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    long id;
//
//    @NaturalId(mutable = false)
//    @Column(name="FirstName")
//    private String firstName;
//
//    public Person(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person employee = (Person) o;
//        return Objects.equals(id, employee.id) &&
//                Objects.equals(firstName, employee.firstName) ;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, firstName);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                '}';
//    }
//}