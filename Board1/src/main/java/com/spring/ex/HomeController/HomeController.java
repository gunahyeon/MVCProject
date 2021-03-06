package com.spring.ex.HomeController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
   
   /**
    * Simply selects the home view to render by returning its name.
    */
   @RequestMapping(value = "/")
   public String home(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
      response.setContentType("text/html; charset=UTF-8");
      request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
      return "index";
   }
   
   
   
   @RequestMapping(value = "/index.do", method = RequestMethod.GET)
   public String index_do(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
      
      response.setContentType("text/html; charset=UTF-8");
      request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

      //HttpSession session = request.getSession();
      
      /*
       * if ((UserDTO) session.getAttribute("userData") != null) { UserDTO userdto =
       * (UserDTO) session.getAttribute("userData");
       * System.out.println("userdto : "+userdto.getUserId());
       * model.addAttribute("userData", userdto); }
       */

      return "index";
   }
   
   @RequestMapping(value = "/Join.do", method = RequestMethod.GET)
   public String join(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
      
      response.setContentType("text/html; charset=UTF-8");
      request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        return "Join";
   }
}