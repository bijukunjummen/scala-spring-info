object warmer {

  trait SensorDevice {
    def isCoffeePresent: Boolean
  }

  class PotSensor extends SensorDevice {
    def isCoffeePresent = true
  }

  trait OnOffDevice {
    def on: Unit
    def off: Unit
  }
  
	class Heater extends OnOffDevice {
		def on = println("heater.on")
		def off = println("heater.off")
	}

  class Warmer(s: SensorDevice, o: OnOffDevice) {
    def trigger = {
      if (s.isCoffeePresent) o.on
      else o.off
    }
  }
  
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
	
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(947); 
	
  val ac = new AnnotationConfigApplicationContext(classOf[WarmerConfig]);System.out.println("""ac  : org.springframework.context.annotation.AnnotationConfigApplicationContext = """ + $show(ac ));$skip(53); 
  val warmer = ac.getBean("warmer", classOf[Warmer]);System.out.println("""warmer  : warmer.Warmer = """ + $show(warmer ));$skip(17); 
  warmer.trigger}
}
