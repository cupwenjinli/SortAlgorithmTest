package cn.com.wenjin.dp;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class WordBreakTest {

    @Test
    public void wordBreak() {
        String str = "wenjinlo";
        HashSet<String> hs = new HashSet<>();
        hs.add("wen");
        hs.add("jin");
        hs.add("li");
        WordBreak wb = new WordBreak(str,hs);
        boolean b =  wb.wordBreak(str,hs);
        System.out.println(b+str.substring(0,8));

    }
}