package by.part2;

import by.part2.employee.Employee;

public class Example7 {

  public static class HrEmployee extends Employee {

    public HrEmployee(String name) {
      super(name);
    }

    @Override
    public void printEmployee() {
      System.out.println("Имя:" + name);
      System.out.println("Возраст:" + getAge());
//      System.out.println("Наименование:" + getDesignation());
      System.out.println("Заработная плата:" + getSalary());
    }
  }

  public static void main(String[] args) {
    /* Создание двух объектов с помощью конструктора. */
    Employee empOne = new Employee("Олег Олегов");
    Employee empTwo = new Employee("Иван Иванов");

    // Вызов метода для каждого созданного объекта.
    empOne.empAge(26);
    empOne.empDesignation("Старший инженер-программист");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empDesignation("Инженер-программист");
    empTwo.empSalary(500);
    empTwo.printEmployee();

    System.out.println(empOne.name + ", salary = " + empOne.getSalary());
  }
}
