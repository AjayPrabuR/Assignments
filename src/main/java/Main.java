public class Main {
    public static void main(String args[]) {
        ExpenseForPerson A = new ExpenseForPerson();
        A.updateBill("A", 100, "A, B, C, D");
        ExpenseForPerson B = new ExpenseForPerson();
        B.updateBill("B", 500, "C, D");
        ExpenseForPerson C = new ExpenseForPerson();
        ExpenseForPerson D = new ExpenseForPerson();
        D.updateBill("D", 300, "A, B");

        System.out.println(A.consolidateExpense("A"));
        System.out.println(B.consolidateExpense("B"));
        System.out.println(C.consolidateExpense("C"));
        System.out.println(D.consolidateExpense("D"));

    }
}
