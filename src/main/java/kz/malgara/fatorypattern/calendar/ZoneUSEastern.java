package kz.malgara.fatorypattern.calendar;

public class ZoneUSEastern extends Zone {

    public static final String ZONE_ID_US_EASTERN = "us-eastern";

    public ZoneUSEastern() {
        this.zoneId = ZONE_ID_US_EASTERN;
        this.offSet = 4;
        this.displayName = "US Eastern Zone";
    }
}
