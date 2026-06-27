package firstpkg;

import java.io.FileReader;
import java.util.Properties;

public class FileHandling 
{

	public static void read_prop_file() throws Exception
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("browsername"));
		
		System.out.println(prop.get("url"));
		
		
		
	}
	
	
	public static void read_text_data() throws Exception
	{
		//File f = new File("C:\\TestData\\data.txt");  //file connection
		
		//FileReader fr = new FileReader(f);
		
		FileReader fr = new FileReader("C:\\TestData\\data.txt");
		
		int r = fr.read(); //E/69
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception
{

		//read_text_data();
		read_prop_file();
		
	}
	
}
