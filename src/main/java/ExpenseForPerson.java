import java.util.HashMap;

public class ExpenseForPerson
{
    public int givesToFriends = 0;
    public static HashMap<String, Integer> getFromFriends = new HashMap<>();

    public void updateBill(String person, int amountSpent, String paidFor) {
        String paidForWhom[] = paidFor.split(", ");
        int amountForIndividual = (amountSpent / paidForWhom.length);
        if (paidFor.contains(person)) {
            givesToFriends = amountSpent - amountForIndividual;

        } else {
            givesToFriends = amountSpent;
        }
        for (int i = 0; i < paidForWhom.length; i++) {
            if(!paidForWhom[i].equals(person)) {
                if (!getFromFriends.containsKey(paidForWhom[i])) {
                    getFromFriends.put(paidForWhom[i], amountForIndividual);
                } else {
                    int alreadyOwed = getFromFriends.get(paidForWhom[i]);
                    alreadyOwed += amountForIndividual;
                    getFromFriends.put(paidForWhom[i], alreadyOwed);
                }
            }
        }
    }
    public String consolidateExpense(String ExpenseForPersonName) {
        if (this.givesToFriends == 0) {
            return ExpenseForPersonName + " gives " + getFromFriends.get(ExpenseForPersonName);
        } else if (this.givesToFriends > getFromFriends.get(ExpenseForPersonName)) {
            return ExpenseForPersonName + " gets " + (this.givesToFriends -getFromFriends.get(ExpenseForPersonName));
        }
        return ExpenseForPersonName + " gives " + this.givesToFriends;
    }

}
