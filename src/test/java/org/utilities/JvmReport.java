package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonPath) {

		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JVMReport");
	
		Configuration con = new Configuration(f, "COASTFASHION");
		con.addClassifications("Platform Name", "Windows 7");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("Browser Version", "103");
		con.addClassifications("Sprint", "32.1.4");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
	}
}	
