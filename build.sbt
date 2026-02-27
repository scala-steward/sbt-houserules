val Version = new {
  val SbtScalafix = "0.14.6"
  val SbtScalafmt = "2.5.6"
  val SbtScoverage = "2.4.4"
  val SbtTpolecat = "0.5.3"
  val Scala = "2.12.21"
}

inThisBuild(
  Def.settings(
    developers := List(Developer("taig", "Niklas Klein", "mail@taig.io", url("https://taig.io/"))),
    dynverVTagPrefix := false,
    homepage := Some(url("https://github.com/taig/sbt-houserules/")),
    licenses := List("MIT" -> url("https://raw.githubusercontent.com/taig/sbt-houserules/main/LICENSE")),
    organization := "io.taig",
    organizationHomepage := Some(url("https://taig.io/")),
    versionScheme := Some("early-semver")
  )
)

enablePlugins(SbtPlugin, BlowoutYamlPlugin)

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % Version.SbtScalafix)
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % Version.SbtScalafmt)
addSbtPlugin("org.scoverage" % "sbt-scoverage" % Version.SbtScoverage)
addSbtPlugin("org.typelevel" % "sbt-tpolecat" % Version.SbtTpolecat)

blowoutGenerators ++= {
  val workflows = file(".github") / "workflows"
  BlowoutYamlGenerator.lzy(workflows / "main.yml", GitHubActionsGenerator.main) ::
    BlowoutYamlGenerator.lzy(workflows / "tag.yml", GitHubActionsGenerator.tag) ::
    BlowoutYamlGenerator.lzy(workflows / "pull-request.yml", GitHubActionsGenerator.pullRequest) ::
    Nil
}

name := "sbt-houserules"

scalafmtAll := {
  (Compile / scalafmt)
    .dependsOn(Test / scalafmt)
    .dependsOn(Compile / scalafmtSbt)
    .value
}

scalafmtCheckAll := {
  (Compile / scalafmtCheck)
    .dependsOn(Test / scalafmtCheck)
    .dependsOn(Compile / scalafmtSbtCheck)
    .value
}

scalaVersion := Version.Scala
