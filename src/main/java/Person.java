import java.util.HashMap;

public class Person
{
    public int givesToFriends = 0;
    public static HashMap<String, Integer> getFromFriends = new HashMap<>();

    public void updateBill(String person, int amountSpent, String paidFor) {
        String paidForWhom[] = paidFor.split(", ");
        int from = 0;
        int amountForIndividual = (amountSpent / paidForWhom.length);
        if (paidFor.startsWith(person)) {
            givesToFriends = amountSpent - amountForIndividual;
            from = 1;
        } else {
            givesToFriends = amountSpent;
        }
        for (int i = from; i < paidForWhom.length; i++) {
            if (!getFromFriends.containsKey(paidForWhom[i])) {
                getFromFriends.put(paidForWhom[i], amountForIndividual);
            } else {
                int alreadyOwed = getFromFriends.get(paidForWhom[i]);
                alreadyOwed += amountForIndividual;
                getFromFriends.put(paidForWhom[i], alreadyOwed);
            }
        }
    }

    public String consolidateBill(String personName, Person id) {
        if (id.givesToFriends == 0) {
            return "givesfull";
        } else if (id.givesToFriends > getFromFriends.get(personName)) {
            return "gets";
        }
        return "gives";
    }
}
