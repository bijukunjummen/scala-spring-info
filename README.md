scala-spring-info
=================


There are three projects under this root project

1. basic-spring-scala - this is a project which has some basic samples of using Scala with Spring Framework and has samples to demonstrate the use of xml based bean configuration, Annotation based bean configuration and JavaConfig based bean configuration
	The sample is rounded up with a reimplementation of a cake pattern sample using Java Configuration

	The best way to run the sample is through sbt. Start up sbt in the basic-spring-scala project `sbt` and then for each of the sample run this:

	`runMain demo.basic1.BeansDriver`
	
2. using-spring-scala-lib - this is project which makes use of the Spring-scala project and has reimplementations of the pure spring based samples now using spring-scala

3. spring-boot-scala-web - this is a sample Spring-boot based application but written entirely using scala. The best way to run this
project is using `./gradlew run` and the endpoint should come up at `http://localhost:8080/hotels`

4. rg-si - this is a sample spring-integration project but mostly written using scala
