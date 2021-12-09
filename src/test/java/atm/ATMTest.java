package atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    private ATM atm;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void process() {
        atm.process(90);

        assertTrue(outputStreamCaptor.toString().contains("Please receive 0 of 5 UAH bills"));
        assertTrue(outputStreamCaptor.toString().contains("Please receive 1 of 10 UAH bills"));
        assertTrue(outputStreamCaptor.toString().contains("Please receive 4 of 20 UAH bills"));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}