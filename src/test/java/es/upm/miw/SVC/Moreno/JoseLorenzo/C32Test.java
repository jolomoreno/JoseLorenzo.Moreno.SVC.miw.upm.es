package es.upm.miw.SVC.Moreno.JoseLorenzo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C32Test {
    private C32 c32;

    @BeforeEach
    void before() {
        c32 = new C32();
    }

    @Test
    void testM1() {
        assertEquals("mA", c32.mA());
    }


}