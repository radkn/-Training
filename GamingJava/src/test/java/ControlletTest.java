import org.junit.Assert;
import org.junit.Test;
import ua.training.Controller;
import ua.training.Model;
import ua.training.View;

public class ControlletTest extends Assert {

    @Test
    public void testRandWithMinMax(){
        Controller controller = new Controller(new Model(), new View());
        int x = 3;
        int y = 9;
        int secretNum = controller.rand(x,y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x=2, y=65);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x=-30, y=65);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x=1, y=5);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
        secretNum = controller.rand(x, y);
        assertTrue(secretNum >= x && secretNum <= y);
    }
}

