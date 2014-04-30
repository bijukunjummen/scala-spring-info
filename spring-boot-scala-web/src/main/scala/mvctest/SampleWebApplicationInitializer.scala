package mvctest

import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder

class SampleWebApplicationInitializer extends SpringBootServletInitializer {

  override def configure(app: SpringApplicationBuilder): SpringApplicationBuilder = {
    app.sources(classOf[SampleConfig])
    super.configure(app)
  }
}