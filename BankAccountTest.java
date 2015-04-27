

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BankAccountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BankAccountTest
{
    /**
     * Default constructor for test class BankAccountTest
     */
    public BankAccountTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testConstructor1()
    {
        BankAccount bankAcco1 = new BankAccount("Roger");
        assertEquals("testConstructor1: name='Roger'", "Roger", bankAcco1.name);
        assertEquals("testConstructor1: balance=0", 0, bankAcco1.balance, 0.1);
    }

    @Test
    public void testConstructor2()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals("testConstructor1: name='Roger'", "Roger", bankAcco1.name);
        assertEquals("testConstructor1: balance=100", 100, bankAcco1.balance, 0.1);
    }

    @Test
    public void testGetBalance()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(100, bankAcco1.getBalance(), 0.1);
    }

    @Test
    public void testGetName()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(100, bankAcco1.getBalance(), 0.1);
    }

    @Test
    public void testWithdraw()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(true, bankAcco1.withdraw(50));
        assertEquals(50, bankAcco1.getBalance(), 0.1);
    }

    @Test
    public void testWithdrawNegativeAmount()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(false, bankAcco1.withdraw(-100));
        assertEquals(100, bankAcco1.getBalance(), 0.1);
    }

    @Test
    public void testWithdrawOverdrawn()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(false, bankAcco1.withdraw(150));
        assertEquals(100, bankAcco1.getBalance(), 0.1);
    }

    @Test
    public void testDeposit()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(true, bankAcco1.deposit(100));
        assertEquals(200, bankAcco1.getBalance(), 0.1);
    }

    @Test
    public void testDepositNegative()
    {
        BankAccount bankAcco1 = new BankAccount("Roger", 100);
        assertEquals(false, bankAcco1.deposit(-100));
        assertEquals(100, bankAcco1.getBalance(), 0.1);
    }
}








