package test;

public class test {
    private  int ex1; 
    protected  int ex2;
    public  int ex3;
    int ex4; 
}

class A{
    public static void main( String args[] ) {
        Sample s1 = new Sample();
        s1.ex1 = 1;  //‡@
        s1.ex2 = 1;  //‡A
        s1.ex3 = 1;  //‡B
        s1.ex4 = 1;  //‡C
    }
}
