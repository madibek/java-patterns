package kz.malgara.fatorypattern.calendar;

public class PacificCalendar extends Calendar {

    private ZoneFactory factory;

    public PacificCalendar() {
        this.factory = new ZoneFactory();
    }

    @Override
    public void createCalendar() {
        Zone zone = factory.createZone(ZoneUSEastern.ZONE_ID_US_EASTERN);
        zone.displayName();
    }
}
