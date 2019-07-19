package cn.com.wenjin.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurroundedRegionsTest {
    @Test
    public void test(){
        SurroundedRegions rg = new SurroundedRegions();

        char[][] array = {{'*','*','*','*'},{'*','o','o','*'},{'*','*','o','*'},{'*','o','*','*'}};
        rg.solve(array);
        System.out.println(array);
    }
}