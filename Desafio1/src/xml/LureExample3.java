package xml;

import xml.AdvancedLure;
import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class LureExample3 {


	public static void main(String[] args) {
		try {
			Serializer serializer = new Persister();
			AdvancedLure lure = new AdvancedLure();
			lure.setCompany("Donzai");
			lure.setModel("Marlin Buster");
			lure.setQuantityInStock(23);
			lure.setType("Trolling");
			
			ConfigurationScheme configurationScheme = new ConfigurationScheme();
			configurationScheme.setColor("Blue");
			configurationScheme.setSize(3);
			lure.setConfigurationScheme(configurationScheme);
			
			File result = new File("advancedlure.xml");

			serializer.write(lure, result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
