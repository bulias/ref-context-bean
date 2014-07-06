package tk.skuro.experiments;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by skuro on 06/07/14.
 */
public class SupplierServiceBean implements ServiceBean, InitializingBean {

    private String state = STATE_INITIAL;

    @Override
    public String serve() {
        return state;
    }

    @Override
    public void setInternal(String value) {
        state = value;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("INFO: SupplierServiceBean initialized");
    }
}
