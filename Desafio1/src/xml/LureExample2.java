package xml;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class LureExample2 {


	public static void main(String[] args) {
		try {
			Serializer serializer = new Persister();
			File source = new File("lure.xml");

			Lure lure = serializer.read(Lure.class, source);

			System.out.println(lure.getCompany());
			System.out.println(lure.getModel());
			System.out.println(lure.getQuantityInStock());
			System.out.println(lure.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
