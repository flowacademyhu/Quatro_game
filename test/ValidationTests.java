import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ValidationTests {

    private Piece test0 = new Piece("kicsi", "fekete", "negyzet", "pottyos", false, null);
    private Piece test1 = new Piece("kicsi", "fekete", "negyzet", "sima", false, null);
    private Piece test2 = new Piece("kicsi", "fekete", "kor", "pottyos", false, null);
    private Piece test3 = new Piece("kicsi", "feher", "negyzet", "sima", false, null);
    private int mouseY = 125;
    private int mouseX = 250;


    @Test
    public void validateHeight() {
        Validation val = new Validation();
        assertTrue(val.height(test0, test1, test2, test3));
    }

    @Test
    public void validateColor() {
        Validation val = new Validation();
        assertFalse(val.color(test0, test1, test2, test3));
    }

    @Test
    public void validateShape() {
        Validation val = new Validation();
        assertFalse(val.shape(test0, test1, test2, test3));
    }

    @Test void validateDotted() {
        Validation val = new Validation();
        assertFalse(val.dotted(test0, test1, test2, test3));
    }

    @Test void validateMouseY() {
        Validation val = new Validation();
        int exp = 1;
        assertEquals(exp, val.mouseY(mouseY), "Doest not compile correctly!");
    }

    @Test void validateMouseX() {
        Validation val = new Validation();
        int exp = 2;
        assertEquals(exp, val.mouseX(mouseX), "Does not compile correctly!");
    }

}
