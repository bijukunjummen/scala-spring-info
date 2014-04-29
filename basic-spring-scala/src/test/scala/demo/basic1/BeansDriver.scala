package demo.basic1

import org.springframework.context.support.ClassPathXmlApplicationContext

object BeansDriver extends App {
  val applicationContext = new ClassPathXmlApplicationContext("beans.xml", getClass)
  val c = applicationContext.getBean("consBean", classOf[ConstructorBean])
  println(c.foo)
}