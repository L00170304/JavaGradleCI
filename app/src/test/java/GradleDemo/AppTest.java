package GradleDemo;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting(){
        // Arrange
        App myApp = new App();

        // Act and Assert
        assertNotNull(myApp.getGreeting(), "app should have a greeting");

    }
    
    /* @Test public void appFailedTest(){
        // Arrange
        App myApp = new App();

        // Act and Assert
        assertNull(myApp.getGreeting(), "app should have a greeting");

    } */
    
}
