import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void addFuncionarioPendente(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public boolean verificarPendenciasFuncionario(Funcionario funcionario) {
        return this.funcionarios.contains(funcionario);
    }

}
