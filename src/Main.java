
public class Main {


    public static void main(String[] args) {
        Person person= new Person();
        person.setName("Marsel");
        person.setLastname("Suerov");
        person.setAge(16);

        BankAcc bankAcc= new BankAcc();
        bankAcc.setNumber("4169585359572236");
        bankAcc.setBalance(5000);

        bankAcc.activateAcc();
        bankAcc.diActiveAcc();

        person.setKot(bankAcc);
        System.out.println(person);
    }
}