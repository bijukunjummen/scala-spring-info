package demo.basic2

import org.springframework.context.support.ClassPathXmlApplicationContext

object BeansDriver extends App {
  val applicationContext = new ClassPathXmlApplicationContext("beans.xml", getClass)

  val s = applicationContext.getBean("setterBean", classOf[SetterBean]);

  println(s.foo)

}