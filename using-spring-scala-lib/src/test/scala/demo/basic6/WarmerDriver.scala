package demo.basic6

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.scala.context.function.FunctionalConfigApplicationContext

//Based on sample at http://jonasboner.com/2008/10/06/real-world-scala-dependency-injection-di/

object WarmerDriver extends App {
  val ac = FunctionalConfigApplicationContext[WarmerConfig]
  val warmer = ac.getBean("warmer", classOf[Warmer])
  warmer.trigger
}