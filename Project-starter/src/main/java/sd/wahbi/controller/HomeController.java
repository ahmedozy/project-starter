/**
 * 
 */
package sd.wahbi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ahmedozy
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/login")
	public String login(boolean error) {
		System.out.println("login...");
		return "login";
	}
}
