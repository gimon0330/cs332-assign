scalaVersion := "2.13.14"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8"  % Test,   // 이미 있음
  "junit"          % "junit"     % "4.13.2" % Test    // << 추가: org.junit.runner.RunWith 제공
)
