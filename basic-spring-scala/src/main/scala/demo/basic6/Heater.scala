package demo.basic6

class Heater extends OnOffDevice {
	def on = println("heater.on")
	def off = println("heater.off")
}