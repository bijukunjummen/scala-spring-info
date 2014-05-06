package demo.basic3

import org.springframework.context.support.ClassPathXmlApplicationContext

object CollectionDriver extends App {
  val applicationContext = new ClassPathXmlApplicationContext("beans.xml", getClass)
  val c = applicationContext.getBean("collBean", classOf[CollectionBean])

  println(c.aCollection)

}