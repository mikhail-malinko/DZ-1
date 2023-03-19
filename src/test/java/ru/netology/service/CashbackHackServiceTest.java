package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }
}