package Tests;

import java.util.List;

import Utils.PropertiesFile.PropertiesFile;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;


public class runtest {
	public static final String suitesFolder = "src/test/java/TestSuites/";

	public static void main(String[] args) throws Exception {

		String currentSuite="";
		String clusterToTest="";

		//get test suite file name
		if (args.length > 0)
			currentSuite = args[0];
		else
			currentSuite = "BlockURLSuite.xml";

		//get cluster to test name
		if (args.length > 1){
			clusterToTest = args[1];
			PropertiesFile.writeProperty("ClusterToTest",clusterToTest.toLowerCase() );
			PropertiesFile.saveFile("Set cluster to test: " + clusterToTest);
		}

		//get cluster to test name
		if (args.length > 2){
			String action = args[2].toUpperCase();
			PropertiesFile.writeProperty("Action",action );
			PropertiesFile.saveFile("Set action to test: " + action);
		}


		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		//suites.add(suitesFolder + "BlockURLSuite.xml");//path to xml..
		suites.add(suitesFolder + currentSuite);//path to xml..
		testng.setTestSuites(suites);
        testng.addListener(tla);
		testng.run();
		

	}

}
