package demo.basic4.javaconfig

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import demo.basic1.ConstructorBean
import demo.basic2.SetterBean
import demo.basic3.CollectionBean

object SpringConfigDriver extends App {
  val ac = new AnnotationConfigApplicationContext(classOf[SpringConfig])
  val cb = ac.getBean("consBean", classOf[ConstructorBean])
  println(cb.foo)

  val sb = ac.getBean("setterBean", classOf[SetterBean])
  println(sb.foo)

  val collBean = ac.getBean("collBean", classOf[CollectionBean])
  println(collBean)

  val sCollBean1 = ac.getBean("scollBean1", classOf[SCollectionBean])
  println(sCollBean1)

  val sCollBean2 = ac.getBean("scollBean2", classOf[SCollectionBean])
  println(sCollBean2)
  
  
}