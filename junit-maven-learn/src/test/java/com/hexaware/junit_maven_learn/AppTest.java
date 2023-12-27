package com.hexaware.junit_maven_learn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testWelcome()
    {
    	App obj = new App();
    	String result = obj.welcome("jsv");
    	assertEquals("jsv", result);
    	//assertTrue( true );
    }
}
