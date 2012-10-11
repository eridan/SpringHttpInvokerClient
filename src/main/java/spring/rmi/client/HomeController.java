package spring.rmi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.rmi.service.RemoteService;

@Controller
public class HomeController {
    
    @Autowired
    RemoteService remoteService;
    
    @RequestMapping(method= RequestMethod.GET, value="/index.do")
    public ModelAndView getIndexPage() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("sum", remoteService.getSum(2,2));
        mav.addObject("mult", remoteService.getMultiplication(2,2));
        return mav;
    }
    
}
