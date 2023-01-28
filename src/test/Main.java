package test;

public class Main {
    public static void main(String[] args) {
      System.out.println("繧医≧縺薙◎蜊�縺�縺ｮ鬢ｨ縺ｸ");
      System.out.println("縺ゅ↑縺溘�ｮ蜷榊燕繧貞�･蜉帙＠縺ｦ縺上□縺輔＞");
      String name = new java.util.Scanner(System.in).nextLine();
      System.out.println("縺ゅ↑縺溘�ｮ蟷ｴ鮨｢繧貞�･蜉帙＠縺ｦ縺上□縺輔＞");
      String ageString = new java.util.Scanner(System.in).nextLine();
      int age = Integer.parseInt(ageString);
      int fortune = new java.util.Random().nextInt(3);
      fortune++;
      System.out.println("蜊�縺�邨先棡縺後〒縺ｾ縺励◆");
      System.out.println(age + "豁ｳ縺ｮ" + name + "縺輔ｓ縲√≠縺ｪ縺溘�ｮ驕区ｰ礼分蜿ｷ縺ｯ" + fortune + "縺ｧ縺�");
      System.out.println("1�ｼ壼､ｧ蜷峨2�ｼ壻ｸｭ蜷峨3�ｼ壼翠縲4�ｼ壼�ｶ");
    }
  }
  