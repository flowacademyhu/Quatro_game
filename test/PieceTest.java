import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PieceTest {

    private Piece testPiece = new Piece("tall", "white", "round", "dotted", false, null);

    @Test
    public void getColor() {
        String exp = "white";
        assertEquals(exp, testPiece.getColor(), "Nope");
    }

    @Test
    public void getShape() {
        String exp = "round";
        assertEquals(exp, testPiece.getShape());
    }

    @Test
    public void getHeight() {
        String exp = "tall";
        assertNotEquals(exp, testPiece.getHeight());
    }

    @Test
    public void getDotted() {
        String exp = "dotted";
        assertEquals(exp, testPiece.getDotted());
    }
}
