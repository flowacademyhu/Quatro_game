public class Validation {

    public boolean height(Piece p0, Piece p1, Piece p2, Piece p3) {
        return p0.height.equals(p1.height) && p1.height.equals(p2.height) && p2.height.equals(p3.height);
    }

    public boolean color(Piece p0, Piece p1, Piece p2, Piece p3) {
        return p0.color.equals(p1.color) && p1.color.equals(p2.color) && p2.color.equals(p3.color);
    }

    public boolean shape(Piece p0, Piece p1, Piece p2, Piece p3) {
        return p0.shape.equals(p1.shape) && p1.shape.equals(p2.shape) && p2.shape.equals(p3.shape);
    }

    public boolean dotted(Piece p0, Piece p1, Piece p2, Piece p3) {
        return p0.dotted.equals(p1.dotted) && p1.dotted.equals(p2.dotted) && p2.dotted.equals(p3.dotted);
    }

    public int mouseY(int i) {
        int y = 0;
        if (i == 0) { y = 0; }
        else if (i == 125) { y = 1; }
        else if (i == 250) { y = 2; }
        else if (i == 375) { y = 3; }
        return y;
    }

    public int mouseX(int j) {
        int x = 0;
        if (j == 0) { x = 0; }
        else if (j == 125) { x = 1; }
        else if (j == 250) { x = 2; }
        else if (j == 375) { x = 3; }
        return x;
    }
}
