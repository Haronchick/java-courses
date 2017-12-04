package by.part2;

public class Example3 {

  public static class Puppy {

    public Puppy(String name) {
      // Это конструктор и у него один параметр, name.
      System.out.println("Передаваемое имя:" + name);
    }
  }

  public static void main(String[] args) {
    // Создание объекта myPuppy.
    Puppy myPuppy = new Puppy("Багет");
  }
}
