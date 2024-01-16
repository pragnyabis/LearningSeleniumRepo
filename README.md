# LearningSeleniumRepo
Learning **Selenium** and related frameworks (based on **Java**).

This projects includes learning about the following modules :-

1. Selenium WebDriver
2. WebDriver Manager
3. Page Object Model based framework
4. TestNG
5. Cucumber Framework, Gherkin
6. Extent Reports
7. Log4j 

and many more upcoming.

# Maven Build via cmd Note:-

1. Go to folder where the pom.xml of Project lies.
2. Make sure the that the filenames of class that are to be tested, end with ***...Test*** for Maven to recognize it as a Test file, OR have proper .xml filename(s) in profile tags of pom.xml file.
3. Make sure that **Maven Surefire Plugin** is added to pom.xml file.
4. Open cmd from file location as mentioned in step 1.
5. Type **mvn clean** and hit ENTER, to clear any temporary/unnecessary files.
6. Type **mvn compile** and hit ENTER, to compile the project, and check syntactical errors.
7. Type **mvn test** and hit ENTER, to run All the Tests, OR **mvn test -P<Profile Name>** for running tests under a particular profile, as mentioned in step 2.

# Start Jenkins on a Port

1. Download and Install latest Jenkins file for Windows.
2. Open a browser and goto https://localhost/<portnumber> as used in step 1 installation; OR 
3. Download **jenkins.war** file.
4. Go to folder where the jenkins.war of Project lies, and Open cmd from there.
5. Type **java -jar jenkins.war -httpPort=<Port number>** and hit ENTER.
6. Open a browser and goto https://localhost/<portnumber> as used in step 5.