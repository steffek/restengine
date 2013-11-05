import AssemblyKeys._ // put this at the top of the file

name :="bkengine"

scalaVersion :="2.10.2"

version :="1.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

assemblySettings

resolvers ++= Seq(
  "Scala Tools Repo Releases" at "http://scala-tools.org/repo-releases",
  "Typesafe Repo Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "spray repo" at "http://repo.spray.io/",
  "sbt-plugin-releases" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/",
  "Big Bee Consultants" at "http://repo.bigbeeconsultants.co.uk/repo"
)

libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"     % "1.2-M8",
  "io.spray"            %   "spray-routing" % "1.2-M8",
  "io.spray"            %   "spray-testkit" % "1.2-M8" % "test",
  "com.typesafe.akka"   %%  "akka-actor"    % "2.2.0-RC1",
  "com.typesafe.akka"   %%  "akka-testkit"  % "2.2.0-RC1" % "test",
  "org.specs2"          %%  "specs2"        % "1.14" % "test",
// -- Json --
  "org.json4s" %% "json4s-native" % "3.2.2",
  "com.typesafe.akka" %% "akka-slf4j" % "2.1.4",
  //--"Lucene"--
  "org.apache.lucene" % "lucene-core" % "4.5.0",
  "org.apache.lucene" % "lucene-analyzers-morfologik" % "4.5.0",
  "org.apache.lucene" % "lucene-analyzers-common" % "4.5.0",
  "org.apache.lucene" % "lucene-suggest" % "4.5.0",
  "org.apache.lucene" % "lucene-queries" % "4.5.0",
  "org.apache.lucene" % "lucene-queryparser" % "4.5.0",
  "org.apache.lucene" % "lucene-codecs" % "4.5.0",
  "commons-lang" % "commons-lang" % "2.6",
  "org.scalatest" % "scalatest_2.10" % "2.0.M6" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.35.0",
  "mysql" % "mysql-connector-java" % "5.1.18",
  "uk.co.bigbeeconsultants" %% "bee-client" % "0.21.+",
  "org.slf4j" % "slf4j-api" % "1.7.+",
  "ch.qos.logback" % "logback-core"    % "1.0.+",
  "ch.qos.logback" % "logback-classic" % "1.0.+"
)

seq(Revolver.settings: _*)

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
