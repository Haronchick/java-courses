package by.part2;

public class Example2 {

  public static class Puppy{
     public Puppy(){
     }

     public Puppy(String name){
        // Так выглядит конструктор в Java и у него один параметр, name.
     }
  }

  public static void main(String[] args) {
    Puppy puppy = new Puppy();
    System.out.println(puppy);
  }
}
