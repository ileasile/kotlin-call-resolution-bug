rootProject.name = "kotlin-bug-3"

include("a")
project(":a").projectDir = file("a")

include("b")
project(":b").projectDir = file("b")