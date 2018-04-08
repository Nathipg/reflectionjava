import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class LureExample4 {


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
			
			
			AdvancedLure lure2 = new AdvancedLure();
			lure2.setCompany("Ziggi");
			lure2.setModel("Tuna Finder");
			lure2.setQuantityInStock(44);
			lure2.setType("Trolling");
			
			ConfigurationScheme configurationScheme2 = new ConfigurationScheme();
			configurationScheme2.setColor("Red");
			configurationScheme2.setSize(5);
			lure2.setConfigurationScheme(configurationScheme2);
			
			List<AdvancedLure> lures = new ArrayList<AdvancedLure>();
			lures.add(lure);
			lures.add(lure2);
			
			Inventory inventory = new Inventory();
			inventory.setLures(lures);
			inventory.setWarehouse("Midwest");
			
			File result = new File("inventory.xml");

			serializer.write(inventory, result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}