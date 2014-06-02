This is an example project that run Cucumber feature with a Firefox Wave Toolbar.
Idea for this tool came from Alister Scott's article:
* [Automated local accessibility testing using WAVE and WebDriver](http://watirmelon.com/2013/02/12/automated-local-accessibility-testing-using-wave-and-webdriver/)

Apart from that rest of the code is based on few other projects:
* [Cucumber-JVM-Parallel](https://github.com/tristanmccarthy/Cucumber-JVM-Parallel)
* [java-parallel](https://github.com/cucumber/cucumber-jvm/tree/java-parallel-example/examples/java-parallel)
* [java-webbit-websockets-selenium](https://github.com/cucumber/cucumber-jvm/tree/java-parallel-example/examples/java-webbit-websockets-selenium)

btw. It allows you to run Cucumber features (tests/scenarios) in multiple browsers simultaneously using Selenium (WebDriver) and TestNG.


## Running features in IDE
Tested in IntelliJ Idea 13.1.3
To run all stories from IDE only in Firefox, simply right click on:
* cucumber.examples.java.testNG.runners.RunCukesTestInFirefox

And chose "Run ..."

To run all stories in Firefox right click on:
* src/test/resources/TestNGRunTestsLocally.xml

And chose "Run ..."

To run just one selected feature, change the feature name in the class below:

    org.kowalcj0.accessibilityWave.runners.RunSingleFeature

And as in previous example, right click on this class and chose "Run ..."


## Running features from CLI
Run tests using local browsers:

    mvn clean install

or

    mvn clean test


## Viewing the results
All Cucumber reports [html, json, xml, js] are in: target/cucumber-report