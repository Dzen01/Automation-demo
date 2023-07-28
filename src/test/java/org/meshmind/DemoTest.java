package org.meshmind;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTest {
    @BeforeClass
    public void demoBeforeClass(){
        System.out.println("Before Class");
    }
    @Test
    public void demoTest1(){
        System.out.println("Demo Test 1");
    }
    @Test
    public void demoTest2(){
        System.out.println("Demo Test 2");
    }
    @Test
    public void demoTest3(){
        System.out.println("Demo Test 3");
    }
    @Test
    public void newDemoTest1(){
        System.out.println("New Demo Test 1");
    }
    @Test
    public void newDemoTest2(){
        System.out.println("New Demo Test 2");
    }
    @Test
    public void newDemoTest3(){
        System.out.println("New Demo Test 3");
    }
}
