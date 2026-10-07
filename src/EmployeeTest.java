public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

//        Sortable s = new Sortable();
//        System.out.println(staff[0].compare(staff[1]));
//        System.out.println(staff[1].compare(staff[2]));
//        System.out.println(staff[2].compare(staff[0]));

//        System.out.println("+++ Sebelum kenaikan gaji:");
//        for (Employee e : staff) {
//            e.print();
//        }
//
//        System.out.println("\n+++ Setelah kenaikan gaji 5%:");
//        for (Employee e : staff) {
//            e.raiseSalary(5);        Sortable s = new Sortable();
//            e.print();
//        }

        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            e.print();
        }

        Manager m = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        Employee e = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println(m.compare(e));
    }
}