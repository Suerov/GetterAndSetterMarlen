public class Person {
    private String name;

    private String lastname;
    private  int age;
    private  BankAcc kot;

    public Person() {

    }

    public Person(String name, String lastname, int age, BankAcc kot) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.kot = kot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAcc getKot() {
        return kot;
    }

    public void setKot(BankAcc kot) {
        this.kot = kot;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", kot=" + kot +
                '}';
    }
}
