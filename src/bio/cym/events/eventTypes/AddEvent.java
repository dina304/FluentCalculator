package bio.cym.events.eventTypes;

public class AddEvent extends Event {

    public AddEvent(int num) {
        super(num);
    }

    @Override
    public int calculate(int accomulated) {
        return (getNum() + accomulated);
    }
}

