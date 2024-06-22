package vaibhav.systemdesign.designpattern.interpreterdesignpattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 1);
        context.put("b", 2);
        context.put("c", 3);
        context.put("d", 4);

        AbstractExpression abstractExpression = new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b")), new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"),
                new NumberTerminalExpression("d")));
        int interpretedResult = abstractExpression.interpret(context);
        System.out.println(interpretedResult);
    }
}
