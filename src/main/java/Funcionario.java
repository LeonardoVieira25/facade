
public class Funcionario {

    public boolean tirarFerias() {
        return FuncionarioFacade.verificarPendencias(this);
    }
}
