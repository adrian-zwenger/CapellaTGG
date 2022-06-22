package junittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junittests.SaHelperTestcases.*;

@RunWith(Suite.class)
@SuiteClasses(
		{
			SaHelperCreateMethods.class,
			SaHelperInsertionMethods.class,
			SaHelperComponentModelHelpers.class,
			SaHelperFunctionModelHelpers.class,
			SaHelperCapabilityModelHelpers.class
		}
	)
public class SaHelperTests {

}
