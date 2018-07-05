package cd.kaixuan;

import org.junit.validator.PublicClassValidator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.kaixuan.spring.mapper.ShopMapper;


public class Test {
	
	
	@org.junit.Test
	public void getSelecet() {
		AbstractApplicationContext ac
		= new ClassPathXmlApplicationContext(
				"spring-dao.xml");
		
		ShopMapper userMapper
		= ac.getBean(
				"shopMapper", ShopMapper.class);
		
	}

}
