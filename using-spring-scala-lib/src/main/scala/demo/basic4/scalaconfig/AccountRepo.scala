package demo.basic4.scalaconfig

class AccountRepo {
  def getOne(id: Long) = {
    println("AccountRepo getOne called..")
    id
  }	
}