/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2004��1��1�� ����12:14:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Country {

	String name;
	long population;
	
	
	public Country(String name, long population) {
		this.name = name;
		this.population = population;
		
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	
}
