package shop.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import shop.dao.ArrayWarehouse;
import shop.dao.GeneralWarehouse;
import shop.dao.JdbcWarehouse;
import shop.dao.ListWarehouse;
import shop.dao.MapWarehouse;
import shop.dao.MybatisWarehouse;
import shop.dao.SetWarehouse;
import shop.vo.Product;

/**
 * â�� ��ü(GeneralWarehouse Ÿ��) ������ 
 * ���������� �����ϴ� ���丮 Ŭ����
 * @author PC38206
 *
 */
public class WarehouseFactory {
	
	public static GeneralWarehouse getWarehouse(String type) {
		GeneralWarehouse warehouse = null;
		
		if ("array".equals(type)) {
			Product[] products = new Product[0];
			warehouse = new ArrayWarehouse(products);
			
		} else if ("list".equals(type)) {
			List<Product> products = new ArrayList<>();
			warehouse = new ListWarehouse(products);
			
		} else if ("set".equals(type)) {
			Set<Product> products = new HashSet<>();
			warehouse = new SetWarehouse(products);
			
		} else if ("map".equals(type)) {
			Map<String, Product> products = new HashMap<>();
			warehouse = new MapWarehouse(products);
			
		} else if ("jdbc".equals(type)) {
			warehouse = new JdbcWarehouse();
			
		} else if ("mybatis".equals(type)) {
			warehouse = new MybatisWarehouse();
		}
		
		return warehouse;
	}

}





