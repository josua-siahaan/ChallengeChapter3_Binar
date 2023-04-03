package Josua.test;

//import ModuleRead;
//import Mean;
//import Median;
//import Modus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderCsv implements ModuleRead {
    @Override
    public List<String> readerCsv(String path, int opsi) {

        /*
            Deklarasi List
            berguna untuk menampung data yang diberikan oleh setiap fungsi
         */
        List<String> paketNilai = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();


        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            String[] tempArr;

            while ((line = br.readLine()) != null) {
                temp.clear();
                tempArr = line.split(";");
                for (int i = 0; i < tempArr.length; i++) {
                    if (i >= 1) {
                        temp.add(Integer.valueOf(tempArr[i]));
                    } else paketNilai.add(tempArr[i]);
                }

                switch (opsi) {
                    case 1:
                        paketNilai.add("Modus: " + Modus.getModus(temp) + "\n");
                        break;
                    case 2:
                        paketNilai.add("Mean   : " + MEan.getMean(temp));
                        paketNilai.add("Median : " + Median.getMedian(temp) + "\n");
                        break;
                    case 3:
                        paketNilai.add("Median: " + Median.getMedian(temp));
                        paketNilai.add("Mean: " + MEan.getMean(temp));
                        paketNilai.add("Modus: " + Modus.getModus(temp) + "\n");
                        break;
                    default:
                        break;

                }
            }
            br.close();
            return paketNilai;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

