libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "0.5.3",
   "javax.servlet" % "servlet-api" % "2.3" % "provided",
   "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container",
   "org.clapper" %% "avsl" % "0.3.6"
)

seq(webSettings :_*)

seq(coffeeSettings:_*)

resourceManaged in (Compile, CoffeeKeys.coffee) <<= (baseDirectory) {_ / "src" / "main" / "webapp" / "js"}

CoffeeKeys.bare in (Compile, CoffeeKeys.coffee) := true
