package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldRemainderIfPurchase1000() {
        int amount = 1000;
        assertEquals(0, service.remain(amount));
    }


    @Test
    public void shouldRemainderAbout1000IfPurchase0() {
        int amount = 0;
        assertEquals(1000, service.remain(amount));
    }


    @Test
    public void shouldRemainderAbout500IfPurchase500() {
        int amount = 500;
        assertEquals(500, service.remain(amount));
    }

    @Test
    public void shouldRemainderIfPurchase2500() {
        int amount = 2500;
        assertEquals(500, service.remain(amount));
    }

    @Test
    public void shouldRemainIfPurchase999() {
        int amount = 999;
        assertEquals(1, service.remain(amount));
    }

}
