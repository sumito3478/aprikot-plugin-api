import sbt._
import Keys._

import info.sumito3478.aprikot.sbt._

object build extends Build {

  lazy val project = Project(
    id = "aprikot-plugin-api",
    base = file(".")
  ).settings(JavaProject.newSettings :_*
  ).settings(
    Seq(
      libraryDependencies ++= Seq(
        ),
      version := "0.0.1-SNAPSHOT"
    ): _*
  )

}

