package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example11 {

  public static void main(String args[]) {
    char grade = 'D';

    switch (grade) {
      case 'A':
        System.out.println("Отлично!");
        break;
      case 'B':
      case 'C':
        System.out.println("Отлично выполнено");
        break;
      case 'D':
        System.out.println("Вы прошли");
      case 'F':
        System.out.println("Лучше попробуйте снова");
        break;
      default:
        System.out.println("Неверная оценка");
    }
    System.out.println("Ваша оценка " + grade);
  }
}