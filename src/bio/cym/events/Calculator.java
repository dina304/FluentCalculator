package bio.cym.events;

import bio.cym.events.eventTypes.AddEvent;
import bio.cym.events.eventTypes.Event;
import bio.cym.events.eventTypes.RemoveEvent;
import bio.cym.events.eventTypes.SeedEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    List<Event> array;
    int index;

    public Calculator() {
        array = new ArrayList<>();
    }

    public Calculator Seed(int num) {
        array.add(new SeedEvent(num));
        return this;
    }

    public Calculator Plus(int num) {
        this.array.add(new AddEvent(num));
        return this;
    }

    public Calculator Minus(int num) {
        this.array.add(new RemoveEvent(num));
        return this;
    }

    public Calculator Undo() {
        List<Event> activeEventList = this.array.stream().filter((event -> event.isActive())).collect(Collectors.toList());
        activeEventList.get(activeEventList.size() - 1).setActive(false);
        return this;
    }

    public Calculator Redo() {
        List<Event> inActiveEventList = this.array.stream().filter((event -> !event.isActive())).collect(Collectors.toList());
        inActiveEventList.get(0).setActive(true);
        return this;
    }

    public int Result() {
        return this.array.stream().filter((item) -> item.isActive())
                .reduce(0, (answer, event) -> event.calculate(answer), Integer::sum);
    }

}
