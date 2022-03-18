import static org.junit.Assert.*;

import org.junit.Test;
public class watermelonTest {
    @Test
    public void weight(){
        watermelon w = new watermelon();
        assertEquals(false,w.weight(220));
    }
}

