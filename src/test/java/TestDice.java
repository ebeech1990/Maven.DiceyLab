import org.junit.Assert;
import org.junit.Test;

public class TestDice{
    @Test
    public void testCraps() {
        // Given

        // When
        Dice crapsDice = new Dice("c");


        // Then

        Integer actualCraps = crapsDice.tossAndSum();


        Assert.assertTrue(actualCraps <= 42);

    }

    @Test
    public void testYatzee() {
        // Given

        // When

        Dice yatzeeDice = new Dice("y");

        // Then


        Integer actualYatzee = yatzeeDice.tossAndSum();


        Assert.assertTrue(actualYatzee <= 105);
    }
}