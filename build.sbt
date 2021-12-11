ThisBuild / scalaVersion := "3.1.0"
ThisBuild / scalacOptions ++= List("-feature", "-deprecation", "-Ykind-projector", "-source:future")
ThisBuild / libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.2.10",
  "org.scalatest" %% "scalatest" % "3.2.10" % "test"
)
lazy val root = project
  .aggregate(exercises, answers)
  .settings(
    name := "fpinscala"
  )

lazy val exercises = project
lazy val answers = project
