package Josua.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModusTest {
    private Modus modus = new Modus();
    @DisplayName("Modus")

    @Test
    public void testgetModus(){
        List<Integer> data = new ArrayList<>();
        int result = modus.getModus(data);
        assertEquals(0, result);
    }
}
