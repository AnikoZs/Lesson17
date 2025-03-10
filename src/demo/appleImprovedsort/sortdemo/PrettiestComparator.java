package demo.appleImprovedsort.sortdemo;

import java.util.Comparator;

public class PrettiestComparator implements Comparator<AppleImproved> {
    @Override
    public int compare(AppleImproved a1, AppleImproved a2) {
        if (a1.getColor().equalsIgnoreCase("Pink") && !a2.getColor().equalsIgnoreCase("Pink")) {
            return -1;
        }
        if (!a1.getColor().equalsIgnoreCase("Pink") && a2.getColor().equalsIgnoreCase("Pink")) {
            return 1;
        }
        return Double.compare(a2.getSweetness(), a1.getSweetness());
    }
}
