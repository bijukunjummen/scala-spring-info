package demo.basic5.autowired

import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.junit.Test

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(classes=Array(classOf[SpringConfig]))
class SpringConfigTest {
  
  @Autowired
  var ts: TransferService = _
  
  @Test
  def testInvokeTransferService() {
    ts.get(2l)
  }
}