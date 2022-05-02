package GradleDemo;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {


    /**
     * Test to confirm this is a greeting returned.
     */
    @Test public void appHasAGreeting(){
        // Arrange
        App myApp = new App();

        // Act and Assert
        assertNotNull(myApp.getGreeting(), "app should have a greeting");

    }

    /**
     * Test to force a failed test.
     */
     @Test(enabled = false) public void appFailedTest(){
        // Arrange
        App myApp = new App();

        // Act and Assert
        assertNull(myApp.getGreeting(), "app should have a greeting");

    }
    
}
