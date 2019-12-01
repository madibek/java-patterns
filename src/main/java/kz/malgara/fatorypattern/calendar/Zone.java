package kz.malgara.fatorypattern.calendar;

public abstract class Zone {

    protected String zoneId;

    protected String displayName;

    protected int offSet;

    public String getDisplayName() {
        return displayName;
    }

    public String getZoneId() {
        return zoneId;
    }

    public int getOffSet() {
        return offSet;
    }

    public void displayName() {
        System.out.println(displayName + ", " + zoneId + " (" + offSet + ")");
    }
}
