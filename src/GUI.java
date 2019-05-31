import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame implements MouseListener {
    private JPanel pieceMap;
    private JPanel temp;
    private PiecePool pieces;
    private JLabel[][] inPlay;
    private JPanel gameMap;

    protected GUI() throws HeadlessException {
        this.setTitle("Quatro");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 800, 850);
        this.setLayout(null);

        pieceMap = new JPanel();
        pieceMap.setBackground(Color.darkGray);
        pieceMap.setLayout(new GridLayout(2, 8));
        pieceMap.setBounds(0, 500, 800, 300);
        pieceMap.addMouseListener(this);

        pieces = new PiecePool();
        for (Piece p : pieces.getList()) {
            p.setIcon(p.getImg());
            p.addMouseListener(this);
            p.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            p.setVerticalAlignment(SwingConstants.CENTER);
            p.setHorizontalAlignment(SwingConstants.CENTER);
            pieceMap.add(p);
        }

        temp = new JPanel();
        temp.setBackground(Color.pink);
        temp.setBounds(575, 200, 150, 150);

        gameMap = new JPanel();
        gameMap.setBackground(Color.gray);
        gameMap.setLayout(new GridLayout(4, 4));
        gameMap.setBounds(0, 0, 500, 500);

        inPlay = new Piece[4][4];
        for (int i = 0; i < inPlay.length; i++) {
            for (int j = 0; j < inPlay[i].length; j++) {
                Piece fillPiece = new Piece("", "", "", "", true, new ImageIcon(getClass().getResource("icons/def.png")));
                inPlay[i][j] = fillPiece;
                inPlay[i][j].setIcon(fillPiece.getImg());
                inPlay[i][j].setBorder(BorderFactory.createLineBorder(Color.white));
                inPlay[i][j].setVerticalAlignment(SwingConstants.CENTER);
                inPlay[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                inPlay[i][j].addMouseListener(this);
                gameMap.add(inPlay[i][j]);
                gameMap.revalidate();
                gameMap.repaint();
            }
        }

        this.add(gameMap);
        this.add(temp);
        this.add(pieceMap);

        setVisible(true);
    }

    private Validation validation = new Validation();

    public boolean rowCheck(int row) {
        Piece p0 = (Piece)inPlay[row][0];
        Piece p1 = (Piece)inPlay[row][1];
        Piece p2 = (Piece)inPlay[row][2];
        Piece p3 = (Piece)inPlay[row][3];
        if (validation.height(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.height);
        } else if (validation.color(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.color);
        } else if (validation.shape(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.shape);
        } else if (validation.dotted(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Line: " + (row + 1) + "\n" + "Type: " + p0.dotted);
        } else {
            return false;
        }
        return true;
    }

    public boolean columnCheck(int column) {
        Piece p0 = (Piece)inPlay[0][column];
        Piece p1 = (Piece)inPlay[1][column];
        Piece p2 = (Piece)inPlay[2][column];
        Piece p3 = (Piece)inPlay[3][column];
        if (validation.height(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.height);
        } else if (validation.color(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.color);
        } else if (validation.shape(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.shape);
        } else if (validation.dotted(p0, p1, p2, p3)) {
            JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Column: " + (column + 1) + "\n" + "Type: " + p0.dotted);
        } else {
            return false;
        }
        return true;
    }

    public void diagonal1Check(int y, int x) {
        if ((y == 0 && x == 0) || (y == 1 && x ==1) || (y == 2 && x == 2) || (y == 3 && x == 3)) {
            Piece p0 = (Piece)inPlay[0][0];
            Piece p1 = (Piece)inPlay[1][1];
            Piece p2 = (Piece)inPlay[2][2];
            Piece p3 = (Piece)inPlay[3][3];
            if (validation.height(p0, p1, p2 , p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.height);
            } else if (validation.color(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.color);
            } else if (validation.shape(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.shape);
            } else if (validation.dotted(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.dotted);
            }
        }
    }


    public void diagonal2Check(int y, int x) {
        if ((y == 0 && x == 3) || (y == 1 && x ==2) || (y == 2 && x == 1) || (y == 3 && x == 0)) {
            Piece p0 = (Piece)inPlay[0][3];
            Piece p1 = (Piece)inPlay[1][2];
            Piece p2 = (Piece)inPlay[2][1];
            Piece p3 = (Piece)inPlay[3][0];
            if (validation.height(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.height);
            } else if (validation.color(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.color);
            } else if (validation.shape(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.shape);
            } else if (validation.dotted(p0, p1, p2, p3)) {
                JOptionPane.showMessageDialog(this, "YOU WON!" + "\n" + "Diagonal " + "\n" + "Type: " + p0.dotted);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Piece tempPiece = null;
        if (e.getSource() instanceof Piece && !((Piece) e.getSource()).isPlayed()) {
            if (temp.getAccessibleContext().getAccessibleChildrenCount() > 0) {
                JOptionPane.showMessageDialog(this, "Please play the given piece!");
            } else {
                tempPiece = (Piece) e.getSource();
                tempPiece.setPlayed(true);
                temp.add(tempPiece);
                pieces.remove(tempPiece);
                pieceMap.revalidate();
                pieceMap.repaint();
            }
        } else if (e.getSource() instanceof Piece && ((Piece) e.getSource()).isPlayed()) {
            int y = validation.mouseY(((Piece) e.getSource()).getY());
            int x = validation.mouseX(((Piece) e.getSource()).getX());
            Piece toPut = (Piece) temp.getComponent(0);
            ImageIcon toPutImage = toPut.getImg();
            if (((Piece)inPlay[y][x]).getColor().isEmpty()) {
                inPlay[y][x].setIcon(toPutImage);
                ((Piece) inPlay[y][x]).setHeight(toPut.height);
                ((Piece) inPlay[y][x]).setColor(toPut.color);
                ((Piece) inPlay[y][x]).setShape(toPut.shape);
                ((Piece) inPlay[y][x]).setDotted(toPut.dotted);
                temp.remove(toPut);
                temp.revalidate();
                temp.repaint();
                rowCheck(y);
                columnCheck(x);
                diagonal1Check(y, x);
                diagonal2Check(y, x);
            } else {
                JOptionPane.showMessageDialog(this, "Field already taken!");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
