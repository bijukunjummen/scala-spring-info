package demo.basic5.autowired

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Service

object SpringConfigDriver extends App {
  val ac = new AnnotationConfigApplicationContext(classOf[AutowiredConfig])
  val transferService = ac.getBean("transferService", classOf[TransferService])
  transferService.get(1l)
}