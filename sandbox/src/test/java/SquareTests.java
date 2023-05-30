import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {
    @Test
    public void testSquare() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(5, 10);
        Assert.assertEquals(r.area(), 50.0);
    }


}
