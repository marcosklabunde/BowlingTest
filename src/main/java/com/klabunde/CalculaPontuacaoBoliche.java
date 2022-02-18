package com.klabunde;

public class CalculaPontuacaoBoliche
{
	int pontuacaoDoJogo(int[] jogadas)
	{
		int pontuacao = 0;
		int numeroDeJogadas = 0;
		boolean primeiraTentativa = true;

		for (int i = 0; i < jogadas.length; i++)
		{
			if (primeiraTentativa)
			{
				numeroDeJogadas++;
			}

			int pinosDerrubados = jogadas[i];
			pontuacao += pinosDerrubados;

			if (numeroDeJogadas < 10)
			{
				boolean strike = primeiraTentativa && pinosDerrubados == 10;

				if (strike)
				{
					pontuacao += jogadas[i+1] + jogadas[i+2];
				}
				else
				{
					boolean spare = !primeiraTentativa && pinosDerrubados + jogadas[i-1] == 10;

					if (spare)
					{
						pontuacao += jogadas[i+1];
					}
				}

				primeiraTentativa = strike || !primeiraTentativa;
			}
		}

		return pontuacao;
	}
}
