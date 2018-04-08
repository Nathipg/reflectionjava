import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.filter.Filter;
import org.simpleframework.xml.filter.MapFilter;


public class LureExample6 {


	public static void main(String[] args) {
		try {
			Map<String,String> map = new HashMap<String,String>();
			map.put("lure.company", "Monmouth");
			Filter filter = new MapFilter(map);
			
			Serializer serializer = new Persister(filter);
			File source = new File("lure2.xml");

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
