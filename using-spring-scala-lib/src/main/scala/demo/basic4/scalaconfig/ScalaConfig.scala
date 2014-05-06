package demo.basic4.scalaconfig

import org.springframework.scala.context.function.FunctionalConfiguration

class ScalaConfig extends FunctionalConfiguration {
  val accountRepo = bean("accountRepo") {
    new AccountRepo()
  }
  
  bean("transferService") {
    new TransferService(accountRepo())
  }

}