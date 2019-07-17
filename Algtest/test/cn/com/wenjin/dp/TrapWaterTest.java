package cn.com.wenjin.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrapWaterTest {

    @Test
    public void maxWater() {
        int[] array={0,1,0,2,1,0,1,3,2,1,2,1};
        TrapWater tw = new TrapWater();

        System.out.println(tw.maxWater(array));
    }
}