/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 */

description = """
Example Gradle project demonstrating the Gradle a Java application
Project name: ${project.name}
"""

plugins{
    // Apply the application plugin for building hava applications
    application
}

repositories{
    // User Maven repositrory to get the libs
    mavenCentral()

}

dependencies{
    //Specify  the TestNG framework
    testImplementation("org.testng:testng:7.4.0")

    // The dependancy also uses the google guava library
    implementation("com.google.guava:guava:30.0-jre")


}

application{
    //Define the main class for the application
    mainClass.set("GradleDemo.App")


}

tasks.test{
    // use TestNG for unit test
    useTestNG()

}

java {
    withJavadocJar()
}


