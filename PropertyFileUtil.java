package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFileUtil {

 public String getDataPropertyFile(String keyname ) throws IOException {
	 

		FileInputStream fls = new FileInputStream("src\\test\\resources\\LoginCredential.properties");
			
		Properties p = new Properties();
		
		p.load(fls);

		
		String value = p.getProperty(keyname);
		
      return value;
      
      
     




}
}
