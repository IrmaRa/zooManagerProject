import org.junit.*;
import static org.junit.Assert.assertEquals;
import visitors.*;


public class VisitorTest {

@Test
public void hasAge() {
  Visitor visitor = new Visitor(5);
  assertEquals(5, visitor.getAge());
}

}