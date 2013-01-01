package com.madgag.globs.openjdk;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GlobsTest {
    @Test
    public void testPatterns() throws Exception {
        Pattern pattern = Pattern.compile(Globs.toUnixRegexPattern("*.xml"));
        assertTrue(pattern.matcher("foo.xml").matches());
        assertFalse(pattern.matcher("bar.java").matches());
    }
}
