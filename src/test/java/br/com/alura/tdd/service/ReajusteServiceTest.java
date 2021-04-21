package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	@Test
	void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		
		Funcionario funcionario = new Funcionario("Lagertha", LocalDate.now(), new BigDecimal("3000"));
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("3090.00"), funcionario.getSalario());
	}

}
