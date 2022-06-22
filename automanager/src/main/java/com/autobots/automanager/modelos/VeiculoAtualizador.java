package com.autobots.automanager.modelos;

import java.util.List;

import com.autobots.automanager.entidades.Veiculo;

public class VeiculoAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();

	public void atualizar(Veiculo veiculo, Veiculo atualizacao) {
		if (atualizacao != null) {
			if (!verificador.verificar(atualizacao.getDdd())) {
				veiculo.setDdd(atualizacao.getDdd());
			}
			if (!verificador.verificar(atualizacao.getNumero())) {
				veiculo.setNumero(atualizacao.getNumero());
			}
		}
	}

	public void atualizar(List<Veiculo> veiculos, List<Veiculo> atualizacoes) {
		for (Veiculo atualizacao : atualizacoes) {
			for (Veiculo veiculo : veiculos) {
				if (atualizacao.getId() != null) {
					if (atualizacao.getId() == veiculo.getId()) {
						atualizar(veiculo, atualizacao);
					}
				}
			}
		}
	}
}