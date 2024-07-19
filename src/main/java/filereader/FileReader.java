package filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

	Properties s;

	public FileReader() throws IOException {

		File f = new File("C:\\Users\\RAJA\\work\\SasthaSafer\\propertyfile");

		FileInputStream g = new FileInputStream(f);

		s = new Properties();

		s.load(g);

	}

	public String getbrowser() {

		String br = s.getProperty("browser");

		return br;

	}

	public String geturl() {

		String ur = s.getProperty("url");

		return ur;

	}

	public String from() {

		String fro = s.getProperty("from");

		return fro;

	}

	public String to() {

		String to = s.getProperty("to");

		return to;

	}

	public String email() {

		String mail = s.getProperty("email");

		return mail;

	}

	public String phone() {

		String mob = s.getProperty("phone");

		return mob;

	}

	public String firstname() {

		String fn = s.getProperty("firstname");

		return fn;

	}

	public String lastname() {

		String ln = s.getProperty("lastname");

		return ln;

	}

	public String firstname1() {

		String fn1 = s.getProperty("firstname1");

		return fn1;

	}

	public String lastname1() {

		String ln1 = s.getProperty("lastname2");

		return ln1;
}
	
	
	public String cardnumber() {
		
	String cn = s.getProperty("cardnumber");
		
		return cn;
		
		
	}
	
	public String cvv() {
		
		String cv = s.getProperty("cvv");
			
			return cv;
			
			
		}
	
	
	public String expiry() {
		
		String ex = s.getProperty("expiry");
			
			return ex;
			
			
		}
	
	public String cardname() {
		
		String CN = s.getProperty("cardname");
			
			return CN;
			
			
		}
	
}




