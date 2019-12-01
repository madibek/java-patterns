package kz.malgara.fatorypattern.calendar;

public class ZoneUSCenter extends Zone {

    public static final String ZONE_ID_US_CENTER = "us-center";

    public ZoneUSCenter() {
        this.zoneId = ZONE_ID_US_CENTER;
        this.offSet = 1;
        this.displayName = "US Center Zone";
    }
}
