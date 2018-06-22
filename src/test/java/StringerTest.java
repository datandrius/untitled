import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Method;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Satalia Team.
 */
public class StringerTest {

  private Stringer stringer = new Stringer();
  private Method m;

  @Before
  public void setUp() throws Exception {
    m = stringer.getClass().getDeclaredMethod("concatMinusLines", String.class, String.class);
    m.setAccessible(true);
  }

  @Test
  public void privateMethod() throws Exception {
    assertThat(m.invoke(stringer, "vienas", "du"), is("vienas - du"));
  }

  @Test
  public void publicMethod() {
    assertEquals("vienas - du", new Stringer().concatLines("vienas", "du"));
  }


}