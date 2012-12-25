import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  /*
   * Documentation
   * -------------
   * SecureSocial: http://securesocial.ws/guide/installation.html
   */
    val appName         = "DreamHut"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
		"postgresql" % "postgresql" % "9.1-901.jdbc4",
	    "com.typesafe" %% "play-plugins-util" % "2.0.1",
	    "org.mindrot" % "jbcrypt" % "0.3m",
	    "securesocial" % "securesocial_2.9.1" % "2.0.7"
    )
    
    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      resolvers += Resolver.url("SecureSocial Repository", url("http://securesocial.ws/repository/releases/"))(Resolver.ivyStylePatterns)
    )
}
