package com.klabunde;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaPontuacaoBolicheTest
{
	@Test
	public void testeJogoCompleto()
	{
		int[] jogadas = {1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6};
		int resultado = new CalculaPontuacaoBoliche().pontuacaoDoJogo(jogadas);

		Assertions.assertEquals(133, resultado);
	}

	@Test
	public void testeSpare()
	{
		int[] jogadas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 2, 3, 0,0};
		int resultado = new CalculaPontuacaoBoliche().pontuacaoDoJogo(jogadas);

		Assertions.assertEquals(17, resultado);
	}

	@Test
	public void testeStrike()
	{
		int[] jogadas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 2, 3, 0, 0};
		int resultado = new CalculaPontuacaoBoliche().pontuacaoDoJogo(jogadas);

		Assertions.assertEquals(20, resultado);
	}

	@Test
	public void testeFullStrike()
	{
		int[] jogadas = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int resultado = new CalculaPontuacaoBoliche().pontuacaoDoJogo(jogadas);

		Assertions.assertEquals(300, resultado);
	}
}
