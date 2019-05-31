import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void GUIloads() {
        GUI gui = new GUI();
        Assertions.assertNotNull(gui);
    }
}
