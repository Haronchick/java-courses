package by.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example12 {

  public static void main(String args[]) throws FileNotFoundException {
    File f = new File("D://java/file.txt");
    FileReader fr = new FileReader(f);
  }
}
