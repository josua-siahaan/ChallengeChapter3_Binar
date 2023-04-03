package Josua.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MEanTest {
    private MEan mean = new MEan();
    @DisplayName("Mean")

    @Test
    public void testgetMean(){
        List<Integer> data = new ArrayList<>();
        String result = mean.getMean(data);
        assertEquals("NaN", result);

    }
}
