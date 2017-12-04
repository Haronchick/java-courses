package by.part2.employee;

public class Employee {

  public String name;
  private int age;
  String designation;
  protected double salary;

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

  private String getName() {
    return name;
  }

  protected int getAge() {
    return age;
  }

  String getDesignation() {
    return designation;
  }

  public double getSalary() {
    return salary;
  }

  /* Вывод подробной информации. */
  public void printEmployee() {
    System.out.println("Имя:" + getName());
    System.out.println("Возраст:" + getAge());
    System.out.println("Наименование:" + getDesignation());
    System.out.println("Заработная плата:" + getSalary());
  }
}
