package cn.com.wenjin.dp;

import static org.junit.Assert.*;

public class CoinChangeTest {

    @org.junit.Test
    public void coinChange() {
        int []a = {2,5,7};
        CoinChange cc = new CoinChange(a);
        System.out.println(cc.coinChange(27));
        for (int i=0;i<10;++i){
            System.out.println(i);
        }

    }
}