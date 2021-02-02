# Running Cucumber with fat jar

This repo is an attempt to run Cucumber tests from a fat jar (So it can be executed on AWS Device Farm)

To build the jar run `mvn clean package -DskipTests=true`

After that the jars will be generated on the target folder.


To execute the tests run `java -cp "dependency-jars/*:learn-appium-1.0-SNAPSHOT.jar:learn-appium-1.0-SNAPSHOT-tests.jar" org.junit.platform.console.ConsoleLauncher --include-engine cucumber -c com.learnappium.RunCucumberTest`