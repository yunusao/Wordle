import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class WordleModelTest {
    @Test
    public void testEvaluateGuess() {
        WordleModel model = new WordleModel("hello");
        assertEquals("GXXXX", model.evaluateGuess("hxxxx"));
        assertEquals("GGXXX", model.evaluateGuess("hexxx"));
        assertEquals("GGGXX", model.evaluateGuess("helxx"));
        assertEquals("GGGGX", model.evaluateGuess("hellx"));
        assertEquals("GGGGG", model.evaluateGuess("hello"));
    }

    @Test
    public void testIsWordGuessed() {
        WordleModel model = new WordleModel("hello");
        assertTrue(model.isWordGuessed("hello"));
        assertFalse(model.isWordGuessed("world"));
    }

    @Test
    public void testIsGameOver() {
        WordleModel model = new WordleModel("hello");
        for (int i = 0; i < 5; i++) {
            model.evaluateGuess("xxxxx");
        }
        assertTrue(model.isGameOver());
    }
}
