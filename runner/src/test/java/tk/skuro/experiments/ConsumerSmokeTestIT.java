package tk.skuro.experiments;

import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

/**
 * Makes sure the Consumer is up and running
 */
public class ConsumerSmokeTestIT {

    @Before
    public void fixtures(){
        setBaseUrl("http://localhost:8080/consumer");
    }

    @Test
    public void supplierSmokeTest() {
        beginAt("/consumer");
        assertTextPresent("OK");
    }

}
