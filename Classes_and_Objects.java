

public class Classes_and_Objects {
    
    public static class Fruits {
    int price ;

    void sell(){
        System.out.println(this.price);
        System.out.println("SELL SUCCESS");

    }
    }

    public static void main(String[]  args){
        System.out.println("Hello World");

        Fruits apple = new Fruits() ;
        apple.price = 234;
        System.out.println(apple.price);
        apple.sell();

    }
}