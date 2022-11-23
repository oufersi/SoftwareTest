package com.yjy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static com.yjy.App.div;;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void divTest(){
        int returnVal;

        try{
            //div(10, 0);

            returnVal = div(10, 2);
            assertTrue("result error", returnVal == 5);
        } catch(Exception e){
            assertTrue(e.getMessage(), false);
        }
    }
}
