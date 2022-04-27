package bio.cym.events;

public class MainCalculator {
    public static void main(String[] args) {
        int result = new Calculator()
                .Seed(10)
                .Plus(5)
                .Plus(5)
                .Result();
        System.out.println(result);
        int result2 = new Calculator()
                .Seed(10)
                .Plus(5)
                .Minus(2)
                .Undo()
                .Undo() // -> 10
                .Redo() // -> 15
                .Result();
        System.out.println(result2);
        int result3 = new Calculator()
                .Seed(10)
                .Plus(5)
                .Minus(2)
                .Undo()
                .Redo()
                .Undo()
                .Plus(3)
                .Result(); // -> result = 18
        System.out.println(result3);

    }
}

