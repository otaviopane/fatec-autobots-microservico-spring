package com.autobots.automanager.modelos;

import java.util.List;

import com.autobots.automanager.entidades.Servico;

public class ServicoAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();

	public void atualizar(Servico servico, Servico atualizacao) {
		if (atualizacao != null) {
			if (!verificador.verificar(atualizacao.getDdd())) {
				servico.setDdd(atualizacao.getDdd());
			}
			if (!verificador.verificar(atualizacao.getNumero())) {
				servico.setNumero(atualizacao.getNumero());
			}
		}
	}

	public void atualizar(List<Servico> servicos, List<Servico> atualizacoes) {
		for (Servico atualizacao : atualizacoes) {
			for (Servico servico : servicos) {
				if (atualizacao.getId() != null) {
					if (atualizacao.getId() == servico.getId()) {
						atualizar(servico, atualizacao);
					}
				}
			}
		}
	}
}