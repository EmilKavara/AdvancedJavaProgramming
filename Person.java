import java.time.LocalDate;
public class Person {
    private final int id;
    private String name;
    private String surname;
    private String gender;
    private LocalDate birthDate;
    public Person(int id, String name, String surname, String gender, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate=birthDate;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", birth date=" + birthDate +
                '}';
    }
}
