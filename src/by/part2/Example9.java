package by.part2;

public class Example9 {

  public static abstract class Employee {

    String name;
    int age;
    String designation;
    double salary;

    // Это конструктор класса Employee.
    public Employee(String name) {
      this.name = name;
    }

    // Присвоение возраста работника переменной age.
    public void empAge(int empAge) {
      age = empAge;
    }

    /* Присвоение переменной designation. */
    public void empDesignation(String empDesig) {
      designation = empDesig;
    }

    /* Присвоение переменной salary. */
    public void empSalary(double empSalary) {
      salary = empSalary;
    }

    /* Вывод подробной информации. */
    abstract void printEmployee();
  }

  public static class HrEmployee extends Employee {

    public HrEmployee(String name) {
      super(name);
    }

    @Override
    void printEmployee() {
      System.out.println("Имя:" + name);
      System.out.println("Возраст:" + age);
      System.out.println("Наименование:" + designation);
      System.out.println("Заработная плата:" + salary);
    }
  }

  public static class TeatcherEmployee extends Employee {

    private String subject;

    public TeatcherEmployee(String name, String subject) {
      super(name);
      this.subject = subject;
    }


    @Override
    void printEmployee() {
      System.out.println("Имя:" + name);
      System.out.println("Возраст:" + age);
      System.out.println("Наименование:" + designation);
      System.out.println("Заработная плата:" + salary);
      System.out.println("Предмет:" + subject);
    }
  }

  public static void main(String[] args) {
    /* Создание двух объектов с помощью конструктора. */
    Employee empOne = new HrEmployee("Олег Олегов");
    Employee empTwo = new TeatcherEmployee("Иван Иванов", "Физика");

    // Вызов метода для каждого созданного объекта.
    empOne.empAge(26);
    empOne.empDesignation("Старший инженер-программист");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empDesignation("Инженер-программист");
    empTwo.empSalary(500);
    empTwo.printEmployee();
  }
}
