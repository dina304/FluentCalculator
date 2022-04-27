package bio.cym.events.eventTypes;

public class RemoveEvent extends Event {

    public RemoveEvent(int num) {
        super(num);
    }

    @Override
    public int calculate(int accomulated) {
       return accomulated - getNum();

    }
}
