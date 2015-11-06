

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
    // Main function called to run tests
    public static void main() {
        BankAccountTest tester = new BankAccountTest();
        tester.testConstructor1();
        tester.testConstructor2();
        tester.testGetBalance();
        tester.testGetName();
        tester.testWithdraw();
        tester.testWithdrawNegativeAmount();
        tester.testWithdrawOverdrawn();
        tester.testDeposit();
        tester.testDepositNegative();
    }

    /**
     * Default constructor for test class BankAccountTest
     */
    public BankAccountTest()
    {
        
    }

    // Since there are two types of constructors for this class
    // we need to test them both.  
    public void testConstructor1()
    {
        BankAccount bankAccount1 = new BankAccount("Roger");
        System.out.println("Bank account constructor 1 test: name=Roger, balance=0: "+bankAccount1.name+' '+bankAccount1.balance);
    }

    public void testConstructor2()
    {

    }

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








