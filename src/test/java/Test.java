import exercice_4.Mode;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    protected static Configuration config;

    @BeforeAll
    static void setUp() {
        String[] args = "-K 10 -A .90 -K 20 -P -K 30 -C".split("\\s+");
        config = CLIClassique.configure(args);
    }

    @org.junit.jupiter.api.Test
     void testAlpha() {
        assertEquals(0.9, config.getAlpha());
    }

    @org.junit.jupiter.api.Test
    void testEpsilon() {
        assertEquals(-1.0, config.getEpsilon());
    }

    @org.junit.jupiter.api.Test
    void testIndex() {
        assertEquals(30, config.getIndex());
    }

    @org.junit.jupiter.api.Test
    void testMode() {
        assertEquals(Mode.CREUSE, config.getMode());
    }
}
