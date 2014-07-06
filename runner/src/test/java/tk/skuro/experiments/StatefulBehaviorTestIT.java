package tk.skuro.experiments;

import org.apache.http.HttpStatus;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

/**
 * Created by skuro on 06/07/14.
 */
public class StatefulBehaviorTestIT {

    @Test
    public void setHereGetThere(){
        // 1. make a mutating request on the supplier webapp
        setBaseUrl("http://localhost:8080/supplier");
        beginAt("/set?v=WOOT");
        assertResponseCode(HttpStatus.SC_OK);
        gotoPage("/supplier");
        assertTextPresent("WOOT");

        // 2. verify that the mutation is visible on the consumer webapp
        setBaseUrl("http://localhost:8080/consumer");
        beginAt("/consumer");
        assertTextPresent("WOOT");
    }

}
