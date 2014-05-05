package rube.complicated

import java.util.List
import com.google.common.base.Joiner

class Aggregator {
	def aggregate(list: List[String]) = Joiner.on(" ").join(list)
}