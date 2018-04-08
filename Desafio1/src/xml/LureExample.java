package xml;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class LureExample {


	public static void main(String[] args) {
		try {
			Serializer serializer = new Persister();
			Lure lure = new Lure();
			lure.setCompany("Donzai");
			lure.setModel("Marlin Buster");
			lure.setQuantityInStock(23);
			lure.setType("Trolling");
			
			File result = new File("lure.xml");

			serializer.write(lure, result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
