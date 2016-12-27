name := "Hello Anduril"

scalaVersion := "2.11.8"

scalaSource in Compile := baseDirectory.value / "pipeline"

//Those anduril dependencies that I found at Maven

libraryDependencies += "org.apache.commons" % "commons-math" % "2.1"

libraryDependencies += "org.apache.commons" % "commons-exec" % "1.1"


