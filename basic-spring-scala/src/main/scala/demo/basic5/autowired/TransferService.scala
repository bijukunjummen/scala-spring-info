package demo.basic5.autowired

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TransferService @Autowired() (val accountRepo: AccountRepo) {
	def get(id: Long) = accountRepo.getOne(id)
}