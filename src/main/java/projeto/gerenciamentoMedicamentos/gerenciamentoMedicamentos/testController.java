package projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

	@RequestMapping("/")
	public String index() {
		return "html/indexnovo";
	}
}