package com.autobots.automanager.modelos;

import java.util.List;

import com.autobots.automanager.entidades.Mercadoria;

public class MercadoriaAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();

	public void atualizar(Mercadoria mercadoria, Mercadoria atualizacao) {
		if (atualizacao != null) {
			if (!verificador.verificar(atualizacao.getDdd())) {
				mercadoria.setDdd(atualizacao.getDdd());
			}
			if (!verificador.verificar(atualizacao.getNumero())) {
				mercadoria.setNumero(atualizacao.getNumero());
			}
		}
	}

	public void atualizar(List<Mercadoria> mercadorias, List<Mercadoria> atualizacoes) {
		for (Mercadoria atualizacao : atualizacoes) {
			for (Mercadoria mercadoria : mercadorias) {
				if (atualizacao.getId() != null) {
					if (atualizacao.getId() == mercadoria.getId()) {
						atualizar(mercadoria, atualizacao);
					}
				}
			}
		}
	}
}