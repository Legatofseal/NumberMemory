package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Legat on 5/27/2016.
 */
public class NumberClassTest {

@Test
public void testParse (){
    assertFalse(NumberClass.isNumberByParse("tyr"));
    assertFalse(NumberClass.isNumberByParse("-tyr"));
    assertFalse(NumberClass.isNumberByParse("-4t5y6r"));
    assertFalse(NumberClass.isNumberByParse(""));
    assertFalse(NumberClass.isNumberByParse("-"));
    assertTrue(NumberClass.isNumberByParse("34"));
    assertTrue(NumberClass.isNumberByParse("-34"));


}
}