package Josua.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReaderCsvTest {
    private ReaderCsv readerCsv = new ReaderCsv();

    @Test
    public void testgetReaderCsv(){
        List<String> data = new ArrayList<>();
        readerCsv.readerCsv("1", 1);
    }
}
