package by.part2;

import by.part2.employee.Employee;

public class Example4 {

  public static void main(String[] args) {
    /* Сначала создайте объект */
    Employee employee = new Employee("Иванов Иван");
    /* Теперь вызовите переменную следующим образом */
    System.out.println(employee.name);
    /* Теперь Вы можете вызвать метод класса */
    System.out.println(employee.getSalary());
  }
}
