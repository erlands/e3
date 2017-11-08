package cn.itcast.catTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.ItemCatService;
import cn.itcast.utils.TreeNode;

public class CatTest {

	@Test
	public void run(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");												
		ItemCatService service = (ItemCatService) ac.getBean("itemCatService");
		List<TreeNode> list = service.findByParentId(0l);
		for (TreeNode node : list) {
			System.err.println("---------->"+node.getText());
		}
	}
	
}
