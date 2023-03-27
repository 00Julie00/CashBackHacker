package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldRemainderIfPurchase1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainderAbout1000IfPurchase0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainderAbout500IfPurchase500() {
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainderIfPurchase2500() {
        int actual = service.remain(2500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfPurchase999() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldRemainIfPurchase1001() {
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

}
