public class CashBackServiceTest {
    @org.testng.annotations.Test
    public void shouldGetRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals (actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldGetRemainIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals (actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldGetRemainIfAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals (actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldGetRemainIfAmountLessOneBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals (actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldGetRemainIfNextBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals (actual, expected);
    }
}
