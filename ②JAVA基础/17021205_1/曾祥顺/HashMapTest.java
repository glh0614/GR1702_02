import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2004��1��6�� ����8:33:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		//������洢����
		//ӳ�� key �� -----> value ֵ
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country China = new Country("�й�", 16);
		Country Japan = new Country("�ձ�", 2);
		Country India = new Country("ӡ��", 12);
		
		hashMap.put(India, "Delhi");
		hashMap.put(Japan, "Tokyo");
		hashMap.put(China, "BeiJing");
		
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(entry.toString());
			System.out.println(value.toString());
			
		}
		}
	}

