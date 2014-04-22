package demo.basic2

import org.springframework.context.support.ClassPathXmlApplicationContext

object CollectionDriver extends App {
	val applicationContext = new ClassPathXmlApplicationContext("beans.xml", getClass)
	val c = applicationContext.getBean("collectionBean", classOf[CollectionBean])
	
	println(c.aCollection)
	
}