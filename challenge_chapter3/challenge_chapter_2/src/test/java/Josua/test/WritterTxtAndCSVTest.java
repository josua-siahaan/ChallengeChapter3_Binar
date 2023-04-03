package Josua.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WritterTxtAndCSVTest {
    private WritterTxtAndCSV writterTxtAndCSV = new WritterTxtAndCSV();

    @Test
    public void testgetWritterTxtAndCSV(){
        List<String> data = new ArrayList<>();
//        data.add("Josua");
        writterTxtAndCSV.writterTxtAndCsv("1", data);

    }
}
