package demo.basic6

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean

@Configuration
class WarmerConfig {
  @Bean
  def heater(): OnOffDevice = new Heater

  @Bean
  def potSensor(): SensorDevice = new PotSensor

  @Bean
  def warmer() = new Warmer(potSensor(), heater())
}