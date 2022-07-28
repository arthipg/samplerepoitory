package automation;

	import org.junit.After;
	import org.junit.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.configuration.ChartLocation;
    import com.aventstack.extentreports.reporter.configuration.Theme;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class asreport {
		
		static ExtentHtmlReporter htmlReporter;
		static ExtentReports extent;
		static ExtentTest logger;
		@Test
		public void startReport(){
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"//STMExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		extent.setSystemInfo("Environment", "QA");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("placeorder");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		}
		@Test
		public void passTest(){
		logger = extent.createTest("Login _TC_001");

		logger.log(Status.PASS, "Entered Username");
		//logger.log(Status.PASS, MarkupHelper.createLabel("Entered Username", ExtentColor.GREEN));
		logger.log(Status.PASS, "Entered Passed");
		}
		
		@After
		public void endReport(){
		extent.flush();
		    }
		
		
	}




