package demo.basic4.scalaconfig

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.stereotype.Repository

class TransferService (val accountRepo: AccountRepo) {
	def get(id: Long) = accountRepo.getOne(id)
}