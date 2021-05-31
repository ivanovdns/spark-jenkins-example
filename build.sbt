
name := "spark-jenkins"

version := "0.1"

scalaVersion := "2.12.13"

idePackagePrefix := Some("com.epam")

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1"