public class Main {
    public static void main(String args[]) {
        Person A = new Person();
        A.updateBill("A", 100, "A, B, C, D");
        Person B = new Person();
        B.updateBill("B", 500, "C, D");
        Person C = new Person();
        Person D = new Person();
        D.updateBill("D", 300, "A, B");
        if (A.consolidateBill("A", A).equals("gets")) {
            System.out.print("A gets " + (A.givesToFriends - Person.getFromFriends.get("A")));
        } else {
            System.out.print("A gives " + A.givesToFriends);
        }
        if (B.consolidateBill("B", B).equals("gets")) {
            System.out.print("\nB gets " + (B.givesToFriends - Person.getFromFriends.get("B")));
        } else {
            System.out.print("\nB gives " + B.givesToFriends);
        }

        if (C.consolidateBill("C", C).equals("gets")) {
            System.out.print("\nC gets " + (C.givesToFriends - Person.getFromFriends.get("C")));
        } else if (C.consolidateBill("C", C).equals("givesfull")) {
            System.out.print("\nC gives " + Person.getFromFriends.get("C"));
        } else {
            System.out.print("\nC gives " + C.givesToFriends);
        }
        if (D.consolidateBill("D", D).equals("gets")) {
            System.out.print("\nD gets " + (D.givesToFriends - Person.getFromFriends.get("D")));
        } else {
            System.out.print("\nD gives " + D.givesToFriends);
        }

    }
}
