package kz.malgara.fatorypattern.calendar;

import static kz.malgara.fatorypattern.calendar.ZoneUSCenter.ZONE_ID_US_CENTER;
import static kz.malgara.fatorypattern.calendar.ZoneUSEastern.ZONE_ID_US_EASTERN;

public class ZoneFactory {

    public Zone createZone(String zoneId) {
        Zone zone = null;
        if (ZONE_ID_US_CENTER.equals(zoneId)) {
            zone = new ZoneUSCenter();
        } else if (ZONE_ID_US_EASTERN.equals(zoneId)) {
            zone = new ZoneUSEastern();
        }
        return zone;
    }
}
