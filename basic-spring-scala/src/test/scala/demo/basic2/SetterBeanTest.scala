package demo.basic2

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.scalatest.FunSuite
import org.springframework.test.context.ContextConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.junit.Test

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(Array("beans.xml"))
class SetterBeanTest {

  @Autowired var bean: SetterBean = _

  @Test
  def testConstructorAutowire() = {
    println(bean.foo)
  }

}