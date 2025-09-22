// 모든 프로젝트에서 공통으로 사용할 Scala 버전을 설정합니다.
// 사용하시는 버전에 맞게 수정하셔도 됩니다.
ThisBuild / scalaVersion := "3.3.1"

// 각 하위 폴더를 개별 프로젝트로 정의합니다.
lazy val example = (project in file("example")).settings(name := "example")
lazy val recfun = (project in file("recfun")).settings(name := "recfun")
lazy val funsets = (project in file("funsets")).settings(name := "funsets", libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test")
lazy val objsets = (project in file("objsets")).settings(name := "objsets")
//lazy val patmat = (project in file("patmat")).settings(name := "patmat")
//lazy val streams = (project in file("streams")).settings(name := "streams")
//lazy val forcomp = (project in file("forcomp")).settings(name := "forcomp")

// 루트 프로젝트를 정의하고, 위에서 만든 모든 하위 프로젝트를 하나로 묶습니다.
// VS Code가 이 부분을 보고 전체 프로젝트 구조를 파악합니다.
lazy val root = (project in file("."))
  .aggregate(
    example,
    recfun,
    funsets,
    objsets,
    //patmat,
    //streams,
    //forcomp
  )