package by.part2;

import java.util.*;

public class Example10 {


  interface Instrument {

    // Константа
    int i = 5; // static & final

    void play(); // автоматически public

    String what();

    void adjust();
  }

  static class Wind implements Instrument {

    public void play() {
      System.out.println("Wind.play()");
    }

    public String what() {
      return "Wind";
    }

    public void adjust() {
    }
  }

  static class Percussion implements Instrument {

    public void play() {
      System.out.println("Percussion.play()");
    }

    public String what() {
      return "Percussion";
    }

    public void adjust() {
    }
  }

  static class Stringed implements Instrument {

    public void play() {
      System.out.println("Stringed.play()");
    }

    public String what() {
      return "Stringed";
    }

    public void adjust() {
    }
  }

  static class Brass extends Wind {

    public void play() {
      System.out.println("Brass.play()");
    }

    public void adjust() {
      System.out.println("Brass.adjust()");
    }
  }

  static class Woodwind extends Wind {

    public void play() {
      System.out.println("Woodwind.play()");
    }

    public String what() {
      return "Woodwind";
    }
  }


  public static void main(String[] args) {
    Instrument[] orchestra = new Instrument[5];
    int i = 0;
    // Приведение к базовому типу во время добавления в массив:
    orchestra[i++] = new Wind();
    orchestra[i++] = new Percussion();
    orchestra[i++] = new Stringed();
    orchestra[i++] = new Brass();
    orchestra[i++] = new Woodwind();
    tuneAll(orchestra);
  }

  static void tuneAll(Instrument[] instruments) {
    for (Instrument instrument : instruments) {
      tune(instrument);
    }

  }

  // Не беспокойтесь о типе, добавленные типы
  // продолжают работать правильно:
  static void tune(Instrument i) {
    // ...
    i.play();
  }
}
