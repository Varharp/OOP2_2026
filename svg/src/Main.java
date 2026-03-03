public class Main {
    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 50.0;
        p1.y = 50.0;
        System.out.println(p1);
        System.out.println(p1.toSvg());
        p1.translate(10, -20);
        System.out.println(p1);
        System.out.println(p1.toSvg());

        Point p2 = p1.translated(-30, 40);
        System.out.println(p2);
        System.out.println(p2.toSvg());

        segment s1 = new segment();
        s1.p1 = p1;
        s1.p2 = p2;
        System.out.println("dlugosc s1 = " +s1.lenght());

        System.out.println(s1);
        System.out.println(s1.toSvg());



                // w domu ad 5 na plus
    }
}