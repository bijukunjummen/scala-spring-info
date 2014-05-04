package mvctest.service

import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert._
import org.springframework.test.context.ContextConfiguration
import mvctest.SampleConfig
import org.springframework.beans.factory.annotation.Autowired

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(classes=Array(classOf[SampleConfig]))
class HotelRepositoryTest {
  
  @Autowired var hotelRepository: HotelRepository = _
	
  @Test
  def testHotelRepositoryFinder() {
    val hotels = hotelRepository.findByNameContaining("el 3")
    assertEquals(1, hotels.size())
    assertEquals("Test Hotel 1", hotels.get(0).getName)
  }
}