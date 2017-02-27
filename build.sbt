name := """entropy-game-engine"""

version := "1.0"

scalaVersion := "2.12.1"
scalastyleFailOnError := true

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"
