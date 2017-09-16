import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;

public class StackWalkingTest {

  @Test
  public void testWalkClass() throws Exception {
    final StackWalker stackWalker =
        StackWalker.getInstance(
            StackWalker.Option.RETAIN_CLASS_REFERENCE);
    final Set<String> classNames = stackWalker.walk(stream ->
        stream.map(StackWalker.StackFrame::getClassName)
            .collect(Collectors.toSet())
    );
    assertTrue(classNames.contains("StackWalkingTest"));
  }
}
