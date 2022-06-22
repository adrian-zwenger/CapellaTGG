package junittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junittests.SaGeneratorTestcases.SaGeneratorComponentHierarchy;

@RunWith(Suite.class)
@SuiteClasses({SaGeneratorComponentHierarchy.class})
public class SaGeneratorTests {

}
