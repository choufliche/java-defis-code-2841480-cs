import static org.junit.Assert.*;
import org.junit.Test;

public class PermutationSansTiers {

  @Test
  public void test() {
    int a = 99;
    int b = 101;

    a=a+b;
    b=a-b;
    a=a-b;

    assertEquals(101, a);
    assertEquals(99, b);
  }
}
