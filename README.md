# Intro

This is a possible minimal solution of the Date Difference exercise.

# Build and run

To build the project and create JAR artifact, run `mvn clean install`.
The successfully passing tests will verify behaviors in different scenarios.

To run the console application using stdin and stdout, run `mvn exec:java`.

# Constraints and assumptions

> The application may not make use of the platform / SDK libraries for date manipulation
> (for example Date, Calendar classes).

I am assuming this also means not using 3rd party libraries like Joda Time etc.

> The application can limit calculation on an input range of dates from 1900 to 2010.
