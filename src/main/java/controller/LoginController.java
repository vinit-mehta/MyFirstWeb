package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {
	@RequestMapping(value = {"/", "/welcome"} ,method = RequestMethod.GET)
	public ModelAndView printWelcome() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "welcome page!");
        model.setViewName("login");
		return model;
	}
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView protectedPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Admin Dashboard");
        model.addObject("message", "This is protected page - Only for Administrators !");
        model.setViewName("dashboard");
        return model;

    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }

        model.setViewName("login");

        return model;

    }
}