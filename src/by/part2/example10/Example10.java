package by.part2.example10;

public class Example10 {


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
    i.play();
  }
}
