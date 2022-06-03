import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void EveryStatement (){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.EMPTY_LIST));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        //System.out.println("Test za empty list");
        ex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("mel", "#", "pasovska")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
       // System.out.println("Test za not perfect square");
        assertEquals(Arrays.asList("#", "2", "0", "3", "#", "2", "#", "3", "#"), SILab2.function(Arrays.asList("#", "0", "0", "0", "#", "0", "#", "0", "#")));
         // test 3 every statement
    }

    @Test
    void  EveryBranch(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        //test 2.1
        ex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("mel", "#", "pasovska")));        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        //test 2.2
        assertEquals(Arrays.asList("#", "2", "0", "3", "#", "2", "#", "3", "#"), SILab2.function(Arrays.asList("#", "0", "0", "0", "#", "0", "#", "0", "#")));
        //2.3

    }

}