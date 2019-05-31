import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PiecePoolTest {

    public int size = 16;
    public PiecePool mockPiecePool;

    @Test void pieceLoads() {
        PiecePool piecePool = new PiecePool();
        assertTrue(piecePool.getList().size() == size);
    }

}
