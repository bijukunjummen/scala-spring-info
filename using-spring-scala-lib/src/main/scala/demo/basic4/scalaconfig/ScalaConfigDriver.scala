package demo.basic4.scalaconfig

import org.springframework.scala.context.function.FunctionalConfigApplicationContext

object ScalaConfigDriver extends App {
  val ac = FunctionalConfigApplicationContext[ScalaConfig]
  val ts = ac.getBean("transferService", classOf[TransferService])
  ts.get(1l);
}