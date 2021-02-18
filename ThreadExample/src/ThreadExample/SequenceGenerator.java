package ThreadExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SequenceGenerator {

    private int n;

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public SequenceGenerator(int n) {
        this.n = n;
    }

    public ArrayList<Integer> GenerateSequence() throws Exception{
        arrayList.clear();
        for (int i = 0; i < n; i++) {
        	arrayList.add(ThreadLocalRandom.current().nextInt(0, n+1));
        }
        return this.arrayList;

    }


}