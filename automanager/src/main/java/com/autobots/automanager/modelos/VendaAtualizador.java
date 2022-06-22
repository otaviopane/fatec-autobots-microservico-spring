package com.autobots.automanager.modelos;

import java.util.List;

import com.autobots.automanager.entidades.Venda;

public class VendaAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();

	public void atualizar(Venda venda, Venda atualizacao) {
		if (atualizacao != null) {
			if (!verificador.verificar(atualizacao.getDdd())) {
				venda.setDdd(atualizacao.getDdd());
			}
			if (!verificador.verificar(atualizacao.getNumero())) {
				venda.setNumero(atualizacao.getNumero());
			}
		}
	}

	public void atualizar(List<Venda> vendas, List<Venda> atualizacoes) {
		for (Venda atualizacao : atualizacoes) {
			for (Venda venda : vendas) {
				if (atualizacao.getId() != null) {
					if (atualizacao.getId() == venda.getId()) {
						atualizar(venda, atualizacao);
					}
				}
			}
		}
	}
}