package it.cincione.nutridiab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class VisitController {
	public static final Logger LOGGER = LoggerFactory.getLogger(VisitController.class);

	private final String URL_ROOT = "/visit";
	private final String URL_LIST = URL_ROOT + "/list";
	private final String URL_NEW = URL_ROOT + "/new";
	
	private final String VIEW_ROOT = "views/visit";
	private final String VIEW_LIST = VIEW_ROOT + "/list";
	private final String VIEW_NEW = VIEW_ROOT + "/new";

	
	/** visit list */
	@RequestMapping(value = URL_LIST)
	public String visitList(Model model, RedirectAttributes redirectAttrs) {
		LOGGER.info("GET: " + URL_LIST);

		try{
			//Check del profilo del utente loggato
			//CurrentUser currentUser = Utils.getAuthenticatedUser();
			//return goToShow(model, prepareHomeWrapper(currentUser), redirectAttrs);
			return VIEW_LIST;
		}catch (Exception ex) {
			//LOGGER.error(Utils.getLogMessage("GET /home"),ex);
			//redirectAttrs.addFlashAttribute("message", new Message("message.errore", "message.errore_eccezione", "error"));
			//LOGGER.info(Utils.getLogMessage("REDIRECT: /login"));
			return "redirect:/login";
		}
	}
	
	/** new visit */
	@RequestMapping(value = URL_NEW)
	public String newVisit(Model model, RedirectAttributes redirectAttrs) {
		LOGGER.info("GET: " + URL_NEW);

		try{
			//Check del profilo del utente loggato
			//CurrentUser currentUser = Utils.getAuthenticatedUser();
			//return goToShow(model, prepareHomeWrapper(currentUser), redirectAttrs);
			return VIEW_NEW;
		}catch (Exception ex) {
			//LOGGER.error(Utils.getLogMessage("GET /home"),ex);
			//redirectAttrs.addFlashAttribute("message", new Message("message.errore", "message.errore_eccezione", "error"));
			//LOGGER.info(Utils.getLogMessage("REDIRECT: /login"));
			return "redirect:/login";
		}
	}
}
