package bio.cym.events.eventTypes;

public class SeedEvent extends Event {

    public SeedEvent(int num) {
        super(num);
    }

    @Override
    public int calculate(int accomulated) {
        return getNum();

    }
}
