import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VendingMachineTest {
    @Test
    public void  getChange1(){
        VendingMachine client1 =new VendingMachine(5,0.99);
        Assert.assertArrayEquals(new int[]{1,0,0,0,0,4}, client1.getChange().stream().mapToInt(Integer::intValue).toArray());
    }
    @Test
    public  void  validAmount(){
        VendingMachine client1 =new VendingMachine(11,10.99);
        Assert.assertTrue(client1.validAmount());
        //        Assert.assertEquals(true,client1.clientProcessing());
    }


}
