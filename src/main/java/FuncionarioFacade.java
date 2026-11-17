public class FuncionarioFacade {

    public static boolean verificarPendencias(Funcionario funcionario) {
        if (Rh.getInstancia().verificarPendenciasFuncionario(funcionario)) {
            return false;
        }
        if (Almoxarifado.getInstancia().verificarPendenciasFuncionario(funcionario)) {
            return false;
        }
        return true;
    }
}