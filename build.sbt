val spinalVersion = "1.7.0a"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.spinalhdl",
      scalaVersion := "2.13.7",
      version      := "2.0.0"
    )),
    libraryDependencies ++= Seq(
      "com.github.spinalhdl" % "spinalhdl-core_2.13" % spinalVersion,
      "com.github.spinalhdl" % "spinalhdl-lib_2.13" % spinalVersion,
      compilerPlugin("com.github.spinalhdl" % "spinalhdl-idsl-plugin_2.13" % spinalVersion),
      "org.scalatest" %% "scalatest" % "3.2.5",
      "org.yaml" % "snakeyaml" % "1.8"
    ),
    name := "VexRiscv"
  )

fork := true
