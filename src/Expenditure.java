import java.util.Scanner;
public class Expenditure {

    private double totalExpenses;
    private String ExpenseName;
    Expenditure[] expensesList = new Expenditure[100];
    int numExpenses;
    Scanner sc = new Scanner(System.in);

    public Expenditure() {
        totalExpenses = 0.0;
        numExpenses = 0;
        //System.out.println("constructor of Expenditure.");
    }
    public Expenditure(String ExpenseName , double totalExpenses){
        setExpenseName(ExpenseName);
        settotalExpenses(totalExpenses);
        //System.out.println("Parameter Constructor of Expenditure.");
    }

    public void setExpenseName(String expenseName) {
        ExpenseName = expenseName;
    }

    public void settotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }
    public double getTotalExpenses() {
        return totalExpenses;
    }

    public String getExpenseName() {
        return ExpenseName;
    }

    public void addExpense() {
        System.out.println("Enter name of this expense [string type]");
        String ExpenseName =sc.next();
        System.out.println("Enter expense amount [double type]");
        double Amount = sc.nextDouble();

        totalExpenses += Amount;
        Expenditure amount= new Expenditure(ExpenseName ,Amount );
        expensesList[numExpenses] =amount;

        numExpenses++;
        System.out.println("Expense added successfully");
    }

    public void DisplayExpenses() {
        if (numExpenses == 0) {
            System.out.println("No expense added \n" );
            return;
        }
        System.out.println("List of expenses:");
        for (int i = 0; i < numExpenses; i++) {
            System.out.println((i + 1) + "."+" Name: "+ expensesList[i].getExpenseName() +
                    ", Rs" + expensesList[i].getTotalExpenses() );
        }
        System.out.println("\n \tTotal expenses: Rs" + getTotalExpenses()+"\n");
    }
}