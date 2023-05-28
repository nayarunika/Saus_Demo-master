# Saus Demo with Intlij POM(page Object Model) using page factory 
Web automation testing using Selenium, Cucumber, Java, and design pattern Page Object Model (POM) with Page Factory.

## 1. POM

The POM design pattern was used to construct this automation. Describe POM. Page Object Model is referred to as POM. A design pattern used to create automation is POM. where each page of a program or website is treated as a separate class. This has the benefit that other classes won't be impacted when the interface of one page changes. 

## 2. Cucumber dan Gherkin

Then, we'll use Gherkin and Cucumber for scenario scripting.<br/>
Describe cucumber. Gherkin definition.<br/>
A tool that helps BDD (behavior-driven development) is cucumber.<br/>
A set of grammar rules called "Gherkin" gives unstructured text enough organization so that Cucumber can comprehend it. Gherkin is used to write scenario scripts.<br/><br/>Refer to this link: https://docs.cucumber.io/docs/guides/overview

## 3. Preparation

| Items        | Remarks                                                         |
| ------------ | ------------------------------------------------------------ |
| Editor       | Intellij IDEA Community (https://www.jetbrains.com/idea/download/#section=windows) |
| JDK          | JDK 9 (https://www.oracle.com/java/technologies/javase/javase-jdk9-downloads.html) |
| Web Driver   | Chrome Driver (https://chromedriver.chromium.org/downloads)<br />Firefox Driver (https://github.com/mozilla/geckodriver/releases) |
| Browser      | Chrome/Mozilla Firefox/Edge latest version   |

## 4. Installation

Install Editor Intellij Idea Community and JDK.

## 5. Configuration

#### Windows

###### JDK 9

1. Right-click My Computer > Properties > Advance system settings > Environment Variables > PATH > Edit 
2. Type `C:\Java\java-9\bin` 
3. Click Save

#### Linux dan Mac OS

###### JDK 9

*Automatically set*

## 6. Project

#### Clone

Clone this repository through terminal or command prompt.

### Intellij IDEA Configuration

Open this automation using Intellij IDEA.

##### Project Setting

1. Click File > Project Structure
2. Make sure JDK 8 is selected in Project SDK

##### Plugin

1. Klik Preferences > Plugins
2. Search using keyword `cucumber for java`
3. Click Install
4. Repeat steps 2-3 for plugin `gherkin`

## 7. Package & Class

### Struktur Project

```
|-- test
		|-- java
        			|-- helpers
				|-- pages
				|-- setups
				|-- steps
		|-- resources
				|-- features
				|-- webdriver
```

- `helpers` package for Runner class or other required class
- `pages` package for all page classes.
- `setups` package for all automation configuration.
- `steps` package for all page step definitions.
- `resources` package for all features or non java classes.

## 8. Running Automation

First Way:
- Open TestRunner class and run it.

Second Way:
- Using terminal or cmd, type ```mvn test```

Run and generate report:
- ```mvn test site surefire-report:report```
