public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иванов", "Иван Иванович", 1, 60000);
        EMPLOYEES[1] = new Employee("Петров", "Николай Семенович", 1, 70000);
        EMPLOYEES[2] = new Employee("Дмитриев", "Михаил Дмитриевич", 2, 71000);
        EMPLOYEES[3] = new Employee("Савельев", "Леонид Борисович", 2, 70000);
        EMPLOYEES[4] = new Employee("Миронов", "Геннадий Евгеньевич", 3, 70000);
        EMPLOYEES[5] = new Employee("Семенов", "Владимир Владимирович", 3, 1110000);
        EMPLOYEES[6] = new Employee("Игнатьев", "Борис Олегович", 4, 70000);
        EMPLOYEES[7] = new Employee("Бабаев", "Евгений Митрофанович", 4, 70000);
        EMPLOYEES[8] = new Employee("Лесков", "Алексей Иванович", 5, 70000);
        EMPLOYEES[9] = new Employee("Толстой", "Дмитрий Петровия", 5, 70000);


        printInfo();

    }

    private static void printInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }


}