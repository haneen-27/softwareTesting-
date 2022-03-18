import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class physicsTest {
    @Test
    public void sum(){

        physics p= new physics();
        int n=2;
        int [][]A= {{100,100,-100},{-100,-100,100}};

        assertEquals(true,p.sum(n,A));
    }


}