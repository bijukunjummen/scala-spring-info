package mvctest.service

import org.springframework.data.repository.CrudRepository
import mvctest.domain.Hotel
import java.lang.Long
import java.util.List

trait HotelRepository extends CrudRepository[Hotel, Long] {
  def findByNameContaining(name: String): List[Hotel]
}