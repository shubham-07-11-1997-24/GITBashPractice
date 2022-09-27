package org.Maven.Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeGitBash {
	    @Test
		public void TestPractice1() {
			String browser = System.getProperty("b");
			String url = System.getProperty("u");
			
			Reporter.log("browser is-----"+browser, true);
			Reporter.log("url is-----"+url, true);

	}

}
