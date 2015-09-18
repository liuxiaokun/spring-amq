package com.fred.demo;

import org.junit.Test;
import org.springframework.web.util.HtmlUtils;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @date 2015/9/17
 */
public class TestEscapeCase {


    @Test
    public void testEscape() {

        String escaped = HtmlUtils.htmlEscape("<script>alert('哈哈哈哈');</script>");
        System.out.println(escaped);

        String unescape = HtmlUtils.htmlUnescape(escaped);
        System.out.println(unescape);

    }
}
