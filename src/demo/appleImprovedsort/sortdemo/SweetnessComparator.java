package demo.appleImprovedsort.sortdemo;

import java.util.Comparator;

public class SweetnessComparator implements Comparator<AppleImproved> {
    @Override
    public int compare(AppleImproved a1, AppleImproved a2) {
        return Double.compare(a2.getSweetness(), a1.getSweetness());
    }
}
