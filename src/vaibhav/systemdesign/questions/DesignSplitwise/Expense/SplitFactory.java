package vaibhav.systemdesign.questions.DesignSplitwise.Expense;


import vaibhav.systemdesign.questions.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import vaibhav.systemdesign.questions.DesignSplitwise.Expense.Split.ExpenseSplit;
import vaibhav.systemdesign.questions.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import vaibhav.systemdesign.questions.DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
