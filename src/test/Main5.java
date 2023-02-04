package test;

public class Main5 {
    public static void main(String[] args) {
        int[] moneyList ={121902,8302,55100};
        for (int i = 0; i < moneyList.length; i++){
            System.out.println(moneyList[i]);   
        }
        for (int value : moneyList){
            System.out.println(value);   
        }
      

      int[] numbers = {3, 4, 9};
      System.out.println("画面に数字を入力してください");
      int input = new java.util.Scanner(System.in).nextInt();
      
      for (int i = 0;i < numbers.length;i++){
          if (numbers[i] == input){
              System.out.println("アタリ！");
          }
      }
    }
}
