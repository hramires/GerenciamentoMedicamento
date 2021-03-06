package projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.Conexao;
import projeto.gerenciamentoMedicamentos.gerenciamentoMedicamentos.model.Remedio;

public class RemedioRepository {

	public List<Remedio> getListRemedios() {
		List<Remedio> medicamentos = new ArrayList<Remedio>();
		ResultSet resultSet;
		resultSet = this.retornaRemedios();
		int id;
		String nome;
		String indicacao;
		boolean manha = false;
		boolean tarde = false;
		boolean noite = false;

		try {
			while (resultSet.next()) {
				id = resultSet.getInt("id");
				nome = resultSet.getString("nome");
				indicacao = resultSet.getString("indicacao");
				manha = resultSet.getBoolean("manha");
				tarde = resultSet.getBoolean("tarde");
				noite = resultSet.getBoolean("noite");
				medicamentos.add(new Remedio(id, nome, indicacao, manha, tarde, noite));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicamentos;
	}

	public ResultSet retornaRemedios() {
		String sql = "SELECT * FROM remedio";
		return Conexao.getInstance().executeQuery(sql);
	}
}
