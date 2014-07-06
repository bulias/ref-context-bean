package tk.skuro.experiments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by skuro on 06/07/14.
 */
@Controller
public class SupplierController {

    @Autowired
    private ServiceBean serviceBean;

    @RequestMapping("/supplier")
    @ResponseBody
    public String callMeMaybe() {
        return serviceBean.serve();
    }

}
