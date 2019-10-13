public class New_Employees {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", 892312312, 30000, 30);
        persArray[1] = new Employee("Sergeeva Anna", "Team Leader", " seranna@mailbox.com ", 892376439, 50000, 42);
        persArray[2] = new Employee("Korshun Nikola", "Programmer", " kornikola@mailbox.com ", 898923571, 40000, 21);
        persArray[3] = new Employee("Mironov Andrey", "Director", " mirandrey@mailbox.com ", 893927164, 70000, 56);
        persArray[4] = new Employee("Jekolov Alex", "Tech.leader", " jekalex@mailbox.com ", 896630261, 60000, 39);


        for(int i = 0; i < persArray.length; i++){
            if(persArray[i].getAge() > 40){
                persArray[i].getPersonInfo(persArray[i]);
                System.out.println();
            }
        }
    }
}
