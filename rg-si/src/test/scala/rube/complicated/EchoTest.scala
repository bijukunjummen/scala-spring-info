package rube.complicated

import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.junit.Test

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(Array("rube.xml"))
class EchoTest {
  @Autowired
  var echoGateway: EchoGateway = _
  
  @Test
  def testEcho() {
    val aMessage = "Hello from Spring Integration"
    val response = echoGateway.echo(aMessage)
    println(response)    
  }
}