package test;

public class Main2 {
    public static void main(String[] args) {
      int isHungry = 1;
      String food = "パスタ";
      System.out.println("こんにちは");
      if (isHungry == 0){
          System.out.println("お腹いっぱいです");
      } else {
          System.out.println(food + "を食べます");
      }
      System.out.println("ごちそうさまでした");
    }
  }