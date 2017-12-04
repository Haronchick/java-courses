package by.part2.example10;

public class Stringed implements Instrument {

  public void play() {
    System.out.println("Stringed.play()");
  }

  public String what() {
    return "Stringed";
  }

  public void adjust() {
  }
}