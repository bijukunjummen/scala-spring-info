package demo.basic6

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.scala.context.function.FunctionalConfiguration


class WarmerConfig extends FunctionalConfiguration {
  val h = bean("heater") {
    new Heater
  }
  
  val p = bean("potSensor") {
    new PotSensor
  }
  
  bean("warmer") {
    new Warmer(p(), h())
  }
}