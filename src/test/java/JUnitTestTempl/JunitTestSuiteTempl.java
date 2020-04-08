package JUnitTestTempl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ExecutionProcedureJunitTempl.class, ArithmeticExceptionTestTempl.class,
		PrimeNumberCheckerTestTempl.class })

public class JunitTestSuiteTempl {
}
