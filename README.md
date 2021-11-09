# Autumn-Demo-Cucumber
Demo project for API Automation via Cucumber using Autumn Framework

# Setup:
- Install Java 8
- Install Maven Maven

# Get the latest Source Code

Open Terminal or command line cd to the desired folder where the test automation source code needs to be checkout

Run command git clone https://github.com/autumn-framework/Autumn-Demo-Cucumber.git

This will download the latest template source code

# To clean and compile the build

mvn clean install -DskipTests

OR

mvn clean compile

# To Run test cases in parallel mode

mvn clean install -PTEST -DsuiteType=group -DThreadCount=5


