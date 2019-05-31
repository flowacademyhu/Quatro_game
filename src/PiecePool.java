import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PiecePool {
    private List<Piece> list = new ArrayList<>();

    public PiecePool() {
        this.list.add(new Piece("tall", "black", "square", "dotted", false, new ImageIcon(getClass().getResource("icons/p9.png"))));
        this.list.add(new Piece("tall", "black", "square", "plain", false, new ImageIcon(getClass().getResource("icons/p8.png"))));
        this.list.add(new Piece("tall", "black", "round", "dotted", false, new ImageIcon(getClass().getResource("icons/p13.png"))));
        this.list.add(new Piece("tall", "black", "round", "plain", false, new ImageIcon(getClass().getResource("icons/p12.png"))));
        this.list.add(new Piece("tall", "white", "square", "dotted", false, new ImageIcon(getClass().getResource("icons/p1.png"))));
        this.list.add(new Piece("tall", "white", "square", "plain", false, new ImageIcon(getClass().getResource("icons/p0.png"))));
        this.list.add(new Piece("tall", "white", "round", "dotted", false, new ImageIcon(getClass().getResource("icons/p5.png"))));
        this.list.add(new Piece("tall", "white", "round", "plain", false, new ImageIcon(getClass().getResource("icons/p4.png"))));
        this.list.add(new Piece("small", "black", "square", "dotted", false, new ImageIcon(getClass().getResource("icons/p11.png"))));
        this.list.add(new Piece("small", "black", "square", "plain", false, new ImageIcon(getClass().getResource("icons/p10.png"))));
        this.list.add(new Piece("small", "black", "round", "dotted", false, new ImageIcon(getClass().getResource("icons/p15.png"))));
        this.list.add(new Piece("small", "black", "round", "plain", false, new ImageIcon(getClass().getResource("icons/p14.png"))));
        this.list.add(new Piece("small", "white", "square", "dotted", false, new ImageIcon(getClass().getResource("icons/p3.png"))));
        this.list.add(new Piece("small", "white", "square", "plain", false, new ImageIcon(getClass().getResource("icons/p2.png"))));
        this.list.add(new Piece("small", "white", "round", "dotted", false, new ImageIcon(getClass().getResource("icons/p7.png"))));
        this.list.add(new Piece("small", "white", "round", "plain", false, new ImageIcon(getClass().getResource("icons/p6.png"))));
    }

    public List<Piece> getList() {
        return list;
    }

    public void remove(Piece p) {
        this.list.remove(p);
    }


}
