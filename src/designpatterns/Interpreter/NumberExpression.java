package designpatterns.Interpreter;

// Terminal Expression (Numbers)
public class NumberExpression implements AbstractExpression {
    private String stringVal;

    public NumberExpression(String stringVal) {
        this.stringVal = stringVal;
    }

    @Override
    public int interpret(Context context) {
        return context.get(stringVal);
    }
}


class AddExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

class SubtractExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public SubtractExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}