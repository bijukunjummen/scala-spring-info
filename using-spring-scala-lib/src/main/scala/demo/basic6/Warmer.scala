package demo.basic6

class Warmer(s: SensorDevice, o: OnOffDevice) {
  def trigger = {
    if (s.isCoffeePresent) o.on
    else o.off
  }
}