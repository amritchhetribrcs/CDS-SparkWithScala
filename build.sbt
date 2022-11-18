import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.8"
val sparkVersion = "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion

ThisBuild / scalaVersion := "2.13.8"
lazy val root = (project in file("."))
  .settings(
    name := "CDS-SparkWithScala"

)

