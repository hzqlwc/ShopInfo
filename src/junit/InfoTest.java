package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ServiceInfo;


public class InfoTest {

	@Test
	public void test() {
        
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
		ServiceInfo serviceInfo= (ServiceInfo)context.getBean("BaseshopService");
		
		System.out.println(serviceInfo.servicegetSellinfo().size());
		
	}

	@Test
	public void test1() {
        
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
		ServiceInfo serviceInfo= (ServiceInfo)context.getBean("BaseshopService");
		
		System.out.println(serviceInfo.serviceshopcodes("1002A").getShopname());
		
	}

}
