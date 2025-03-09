package demo.appleImprovedsort.sortdemo;

import java.util.Comparator;

public class NameComparator implements Comparator<AppleImproved> {
    @Override
    public int compare(AppleImproved a1, AppleImproved a2) {
        return a1.getName().compareToIgnoreCase(a2.getName());
    }
}
