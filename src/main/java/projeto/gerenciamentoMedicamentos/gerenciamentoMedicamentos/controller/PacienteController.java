package projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.model.Medicamento;
import projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.model.Paciente;
import projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.repositories.MedicamentoRepository;
import projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.repositories.PacienteRepository;

@RestController
public class PacienteController {

	@RequestMapping("/getPaciente")
	public List<Paciente> buscarPaciente() {
		return new PacienteRepository().getListPaciente();
	}
<<<<<<< HEAD
}
=======

}
>>>>>>> c6c41a8debd799044c7897871fe48ff07231199c
