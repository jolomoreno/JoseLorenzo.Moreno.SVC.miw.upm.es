package es.upm.miw.SVC.Moreno.JoseLorenzo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {
    private C22 c22;

    @BeforeEach
    void before() {
        c22 = new C22();
    }

    @Test
    void testM1() {
        assertEquals("mA", c22.mA());
    }
}
