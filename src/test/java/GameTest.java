import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    public void createGame(){
        assertNotNull(game);
    }

    private void assertIllegalAgument(String guessNumber) {
        try{
            game.guess(guessNumber);
            fail();
        }
        catch (IllegalArgumentException e){

        }

    }

    @Test
    public void throwIllegalArgumentExeptionInvalidInput(){
        assertIllegalAgument(null);
        assertIllegalAgument("12");
        assertIllegalAgument("1234");
        assertIllegalAgument("12s");
        assertIllegalAgument("121");
    }

}