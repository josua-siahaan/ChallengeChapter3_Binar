package Josua.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianTest {
    public Median median = new Median();
    @DisplayName("Median")

    @Test
    public void testgetMedian(){
        List<Integer> data = new ArrayList<>();
        float result = median.getMedian(data);
        assertEquals(1, result);

    }
}
