package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain1() {
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain2() {
        int expected = 100;
        int actual = service.remain(1900);

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain3() {
        int expected = 900;
        int actual = service.remain(100);

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain4() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}