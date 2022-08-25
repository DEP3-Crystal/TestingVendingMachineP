import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class VendingMachineTest {
    @Test
    public void  getChange(){
        VendingMachine client1 =new VendingMachine();
        Assert.assertArrayEquals(new int[]{1,0,0,0,0,4}, client1.getChange(5,0.99).stream().mapToInt(Integer::intValue).toArray());

    }
}
