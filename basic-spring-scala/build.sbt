name := """basic-spring-scala"""

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "1.9.1" % "test" ,
							"org.springframework" % "spring-context" % "4.0.2.RELEASE")
							
libraryDependencies += "org.springframework.scala" %% "spring-scala" % "1.0.0.BUILD-SNAPSHOT"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test"

resolvers ++= Seq("Spring Milestone Repository" at "http://repo.spring.io/milestone",
                  "Spring Snapshot Repository" at "http://repo.spring.io/snapshot",
                  "Spring Release Repository" at "http://repo.spring.io/release")
