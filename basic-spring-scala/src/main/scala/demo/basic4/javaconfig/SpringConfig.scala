package demo.basic4.javaconfig

import demo.basic1.ConstructorBean
import org.springframework.context.annotation.Bean
import demo.basic2.SetterBean
import java.util.Arrays
import demo.basic3.CollectionBean
import scala.collection.JavaConversions._
import org.springframework.context.annotation.Configuration

@Configuration
class SpringConfig {

  @Bean
  def consBean(): ConstructorBean = {
    new ConstructorBean("bar")
  }
  
  @Bean
  def setterBean(): SetterBean = {
    val sb = new SetterBean
    sb.foo = "bar"
    sb
  }
  
  @Bean
  def collBean(): CollectionBean = {
    val list = Arrays.asList("item1", "item2")
    CollectionBean(list)
  }
  
  @Bean
  def scollBean1(): SCollectionBean = {
    val seq = Seq("item1", "item2")
    new SCollectionBean(seq)    
  }
  
  @Bean
  def scollBean2(): SCollectionBean = {
    val list = Arrays.asList("item1", "item2")
    new SCollectionBean(list)    
  }  
}