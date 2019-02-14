import org.junit.Assert;
import org.junit.Test;
import ua.training.Model;

public class ModelTest extends Assert {

    @Test
    public void testRandWithMinMax(){
        Model model = new Model();
        int x = 3;
        int y = 9;
        int secretNum = model.rand(x,y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x=2, y=65);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x=-30, y=65);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x=1, y=5);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
        secretNum = model.rand(x, y);
        assertTrue(secretNum > x && secretNum < y);
    }

    @Test
    public void testDiapasonIsInclude1And99(){
        Model model = new Model();
        model.setMinBarrier(0);
        model.setMaxBarrier(100);

        boolean one = false;
        boolean ninetynine = false;
        int countOfTrying = 0;

        while(!one || !ninetynine){
            countOfTrying++;
            model.setSecretNumber();
            int secretNumber = model.getSecretNumber();
            if(secretNumber == 1){
                one = true;
            }else if(secretNumber == 99){
                ninetynine = true;
            }
            System.out.print(secretNumber+", ");
        }

        System.out.print("\nCount of trying: " + countOfTrying);
        assertTrue(one&&ninetynine);

    }
}
