package Josua.test;

import java.util.Arrays;
import java.util.List;

public class Median {
    public static float getMedian(List<Integer>data){
        if(data.size() % 2 != 0){
            return data.get(data.size()/2);
        }
//        return (data.get(data.size()/2) + data.get(data.size()/2-1)) / 2;
        return 1;
    }
}
