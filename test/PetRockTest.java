import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.junit.Assert.*;

public class PetRockTest {
    @Test
    public void isMyTestWorking() throws Exception {
       PetRock rocky = new PetRock("Rocky");
       assertEquals("Rocky", rocky.getName());
    }
}