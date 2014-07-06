package tk.skuro.experiments;

import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

/**
 * Created by skuro on 06/07/14.
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
