package quanlykinhdoanhdochoitreem;

import java.util.Comparator;


public class SXHoaDon implements Comparator<HoaDon> {

    @Override
    public int compare(HoaDon o1, HoaDon o2) {
        return o1.getMaHD().compareTo(o2.getMaHD());
    }
    
}
