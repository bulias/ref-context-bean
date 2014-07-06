package tk.skuro.experiments;

import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

/**
 * Makes sure the Supplier is up and running
 */
public class SupplierSmokeTestIT {

    @Before
    public void fixtures(){
        setBaseUrl("http://localhost:8080/supplier");
    }

    @Test
    public void supplierSmokeTest() {
        beginAt("/supplier");
        assertTextPresent("OK");
    }

}
