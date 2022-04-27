package bio.cym.events.eventTypes;

public abstract class Event {
    private int num;
    private boolean isActive=true;
    public Event(int num) {
        this.num = num;
    }
    public abstract int calculate(int accomulated);

    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
