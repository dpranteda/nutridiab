package it.cincione.nutridiab.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	public static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/")
	public String root(Locale locale) {
		return "redirect:/home";
	}
	
	/** Home page. */
	@RequestMapping("/home")
	public String home(Model model, RedirectAttributes redirectAttrs) {
		//LOGGER.info("/home");

		try{
			//Check del profilo del utente loggato
			//CurrentUser currentUser = Utils.getAuthenticatedUser();
			//return goToShow(model, prepareHomeWrapper(currentUser), redirectAttrs);
			return "template";
		}catch (Exception ex) {
			//LOGGER.error(Utils.getLogMessage("GET /home"),ex);
			//redirectAttrs.addFlashAttribute("message", new Message("message.errore", "message.errore_eccezione", "error"));
			//LOGGER.info(Utils.getLogMessage("REDIRECT: /login"));
			return "redirect:/login";
		}
	}
}
