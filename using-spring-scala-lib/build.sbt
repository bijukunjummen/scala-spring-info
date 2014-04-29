name := """using-spring-scala-lib"""

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("org.springframework" % "spring-context" % "4.0.2.RELEASE")
							
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.3" % "test"

libraryDependencies += "org.springframework" % "spring-test" % "4.0.2.RELEASE" % "test"

libraryDependencies += "org.springframework.scala" %% "spring-scala" % "1.0.0.BUILD-SNAPSHOT"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

resolvers ++= Seq("Spring Milestone Repository" at "http://repo.spring.io/milestone",
                  "Spring Snapshot Repository" at "http://repo.spring.io/snapshot",
                  "Spring Release Repository" at "http://repo.spring.io/release")