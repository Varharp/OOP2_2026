public class segment {
    public Point p1, p2;

    public double lenght(){
        double dx = p1.x - p2.x;
        double dy = p1.y - p1.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return "segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public String toSvg(){
        return" <line x1=\"" + p1.x +"\" y1=\"" + p1.y + "\"" +
                " x2=\"" + p2.x +"\" y2=\"" + p2.y + "\"" +
                " style=\"stroke:red;stroke-width:2\" />";
    }
}
