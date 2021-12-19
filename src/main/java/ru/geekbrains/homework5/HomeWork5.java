package ru.geekbrains.homework5;

public class HomeWork5 {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Petrov Petr", "Engineer", "petrov@mailbox.com", "892312313", 30000, 28);
        empArray[2] = new Employee("Antonov Anton", "Engineer", "antonov@mailbox.com", "892312314", 30000, 35);
        empArray[3] = new Employee("Sidorov Sidor", "Engineer", "sidorov@mailbox.com", "892312315", 30000, 45);
        empArray[4] = new Employee("Park Sergey", "Boss", "park@mailbox.com", "892312316", 100500, 41);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].info();
            }
        }
    }
}
