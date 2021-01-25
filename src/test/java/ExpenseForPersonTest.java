import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ExpenseForPersonTest {
    @Test
    public void shouldShowBGives125WhenGivenFollowingInput()
    {
        //given
        ExpenseForPerson A = new ExpenseForPerson();
        A.updateBill("A", 100, "A, B, C, D");
        ExpenseForPerson B = new ExpenseForPerson();
        ExpenseForPerson C = new ExpenseForPerson();
        ExpenseForPerson D = new ExpenseForPerson();
        D.updateBill("D", 300, "A, B, D");

        //when
        // String actual=B.consolidateExpense("B");

        //then
        Assertions.assertEquals("B gives 125",B.consolidateExpense("B"));

    }
}



