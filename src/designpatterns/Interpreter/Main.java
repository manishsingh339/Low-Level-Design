package designpatterns.Interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 1);
        context.put("b", 15);
        context.put("c", 10);

        AbstractExpression expression = new AddExpression(
                new NumberExpression("a"),
                new SubtractExpression(new NumberExpression("b"), new NumberExpression("c"))
        );
        System.out.println("Result: " + expression.interpret(context));
    }
}
