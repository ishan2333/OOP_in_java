

public class Classes_and_Objects {
    
    public static class Fruits {
    int price ;
    }

    public static void main(String[]  args){
        System.out.println("Hello World");

        Fruits apple = new Fruits() ;
        apple.price = 234;
        System.out.println(apple.price);

    }
}