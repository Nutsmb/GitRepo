public class Employee {
    public Object getPersonInfo;

    String FIO;
    String position;
    String email;
    long tel;
    int salary;
    int age;

    public Employee(String FIO, String position, String email, long tel, int salary, int age) {
        setFIO(FIO);
        setPosition(position);
        setEmail(email);
        setTel(tel);
        setSalary(salary);
        setAge(age);
    }

    public static void main(String[] args) {

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

    public void setFIO(String _FIO) {
        FIO = _FIO;
    }

    public void setPosition(String _position) {
        position = _position;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public void setTel(long _tel) {
        tel = _tel;
    }

    public void setSalary(int _salary) {
        salary = _salary;
    }

    public void setAge(int _age) {
        age = _age;
    }
}
