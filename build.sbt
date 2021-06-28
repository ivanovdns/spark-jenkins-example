
name := "spark-jenkins"

version := "0.1"

scalaVersion := "2.12.13"

idePackagePrefix := Some("com.epam")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.2" % Test,
  "org.apache.spark" %% "spark-core" % Version.spark,
  "org.apache.spark" %% "spark-sql" % Version.spark,
  "org.apache.spark" %% "spark-core" % Version.spark % Provided,
  "org.apache.spark" %% "spark-core" % Version.spark % Test,
  "org.apache.spark" %% "spark-core" % Version.spark % Test classifier "tests"
)