package test;

public class Main6 {
    public static void main(String[] args) {
        String title = "件名";
        String address = "test@test";
        String text = "こんにちはOOさん";
        email (title,address,text);

        double triangleArea = calcTriangelArea (100,50);
        System.out.println("三角形の面積は" + triangleArea + "㎠");
        double circleArea = calcCircleArea (30);
        System.out.println("円の面積は" + circleArea + "㎠");
      }
      
      public static void email(String title,String address,String text){
          System.out.println( address + "からメールが届いています");
          System.out.println( "件名：" + title);
          System.out.println( "本文：" + text);
    
      }

      public static double calcTriangelArea(double bottom,double height){
        return bottom*height/2;
      }
      public static double calcCircleArea(double radius){
        return radius*radius*3.14;
      }

    
}
