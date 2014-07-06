package tk.skuro.experiments;

import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

/**
 * Created by skuro on 06/07/14.
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
