import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void podeTirarFeriasSemPendencias() {
        Funcionario funcionario = new Funcionario();
        assertEquals(true, funcionario.tirarFerias());
    }

    @Test
    void naoPodeTirarFeriasCompendenciaNoRh() {
        Funcionario funcionario = new Funcionario();
        Rh.getInstancia().addFuncionarioPendente(funcionario);
        assertEquals(false, funcionario.tirarFerias());
    }

    @Test
    void naoPodeTirarFeriasCompendenciaNoAlmoxarifado() {
        Funcionario funcionario = new Funcionario();
        Almoxarifado.getInstancia().addFuncionarioPendente(funcionario);
        assertEquals(false, funcionario.tirarFerias());
    }

}
