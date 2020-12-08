# Test automation project

I created a UI test automation framework for one of my website called The Monkees official website.
The framework contains:
- UI Automation with Selenium WebDriver in order to check UI elements on the website
- Logging function
- Reporting function
- CI with Jenkins

Original project of this website: [link](https://github.com/IstvanGercsak/TheMonkees)

# Website

Website link [here](https://istvangercsak.github.io/TheMonkees/)

# Used technologies

- IntelliJ IDEA - Community Edition
- Java (JDK 14)
- Selenium WebDriver
    - UI automation API tool in order to control website interactions
    - Used browser
        - Chrome browser
        - Mozilla Firefox browser
- TestNG
    - Testing framework
- Maven
    - Project building automation tool

# How to use it

- Fork the git repository
- Install the dependencies with the help of the POM
- Right click on one the testNG runner file / Run
- Log will create automatically

Before the first run it is necessary to download the most updated drivers for the browsers,
 as well as to keep the installed browser up to date on our machines. (Based on the given 
 Operation System which is used for this)

If you are using Mac(as myself) you should put these drivers into the appropriate folders in your project:
- Chrome driver:
    - {$Project folder}/driver/chromeDriver_mac/chromedriver
- Mozilla Firefox(gecko) driver:
    - {$Project folder}/driver/firefoxDriver_mac/geckodriver

This is one of the disadvantage of this approach as we always have to keep our browsers on the same version and 
ind the case of a browser update, we have to update the used drivers as well.

# CI integration with jenkins

- I created a local Jenkins server
- I created a job for my test
- I prepare my project to run my test on Jenkins as follows:
```xml
 <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testNG_ALL.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

- I configure the job to run the project with "maven test" command from the test folder.
For this I created a Pre Step with the following command:

```shell script
cd /Users/istvangercsak/IdeaProjects/Test
mvn test
```

# Reporting and Logging 

## Reporting

- Built in Jenkins and testNG reporting function:

![image](assets/test_result_jenkins.png)

## Logging
- log4j logging function
    - It will expand the log file in the "../logs/log.log" file
    - You can see the actual run details in the Jenkins job in each run
    
![image](assets/log.png)