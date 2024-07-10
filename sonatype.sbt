homepage := Some(url("https://github.com/thinkiny/spray-json-derived-codecs"))
versionScheme := Some("early-semver")

scmInfo := Some(
  ScmInfo(
    url("https://github.com/thinkiny/sbt-gluon-plugin"),
    "scm:git@github.com:thinkiny/sbt-gluon-plugin.git"
  )
)

licenses := List(
  "Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")
)

developers := List(
  Developer(
    id = "001",
    name = "Aaron An",
    email = "thinkiny@gmail.com",
    url = url("https://github.com/thinkiny/sbt-gluon-plugin")
  )
)

sonatypeCredentialHost := Sonatype.sonatypeCentralHost
publishTo := sonatypePublishToBundle.value
publishMavenStyle := true
