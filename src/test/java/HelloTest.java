import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Satalia Team.
 */
public class HelloTest {

  @Test
  public void testCarList() {
    assertEquals("vienas du", Hello.concatLines("vienas", "du"));
  }

}