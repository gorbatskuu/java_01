public class MyFirstProgram {
    public static void main(String[] args) {
        Square s = new Square(4);
        System.out.println(s.area());

        Rectangle r = new Rectangle(7, 8);
        System.out.println(r.area());

        hello("java");
    }

    public static void hello(String a){
        System.out.println("Hello " + a);
    }

}