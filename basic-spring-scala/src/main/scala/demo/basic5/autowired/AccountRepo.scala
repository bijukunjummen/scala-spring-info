package demo.basic5.autowired
import org.springframework.stereotype.Repository

@Repository
class AccountRepo {
  def getOne(id: Long) = {
    println("AccountRepo getOne called..")
    id
  }	
}