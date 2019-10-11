public class Employee {
    public Object getPersonInfo;
    
    String FIO;
    String position;
    String email;
    long tel;
    int salary;
    int age;

    public static void main(String[] args) {

    }

    public Employee(){
        FIO = "Иванов Иван Иванович";
        position = "инженер";
        email = "IvanovII@mail.ru";
        tel = 89995552288L;
        salary = 40000;
        age = 25;
    }

    public static void getPersonInfo(Employee person) {
        System.out.println("Сотрудник "+ person.getFIO() + " (возраст " + person.getAge() + ")" + " на позиции " + person.getPosition() + " с зарплатой " + person.getSalary());
        System.out.println("E-mail: " + person.getEmail());
        System.out.println("Tel.: " + person.getTel());
    }

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


}
