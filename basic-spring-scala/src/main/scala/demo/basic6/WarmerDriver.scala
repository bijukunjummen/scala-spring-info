package demo.basic6

import org.springframework.context.annotation.AnnotationConfigApplicationContext

//Based on sample at http://jonasboner.com/2008/10/06/real-world-scala-dependency-injection-di/

object WarmerDriver extends App {
  val ac = new AnnotationConfigApplicationContext(classOf[WarmerConfig])
  val warmer = ac.getBean("warmer", classOf[Warmer])
  warmer.trigger
}