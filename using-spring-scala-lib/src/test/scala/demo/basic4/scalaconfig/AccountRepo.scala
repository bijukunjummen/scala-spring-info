package demo.basic4.scalaconfig

import org.springframework.stereotype.Repository

class AccountRepo {
  def getOne(id: Long) = {
    println("AccountRepo getOne called..")
    id
  }	
}