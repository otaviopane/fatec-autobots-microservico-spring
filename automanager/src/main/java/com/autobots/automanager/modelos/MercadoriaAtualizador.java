package com.autobots.automanager.modelos;

import java.util.List;
import java.util.Set;

import com.autobots.automanager.entidades.Mercadoria;

public class MercadoriaAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();

	public void atualizar(Mercadoria mercadoria, Mercadoria atualizacao) {
		if (!(atualizacao.getValidade() == null)) {
			mercadoria.setValidade(atualizacao.getValidade());
		}
		if (!(atualizacao.getFabricao() == null)) {
			mercadoria.setFabricao(atualizacao.getFabricao());
		}
		if (!(atualizacao.getCadastro() == null)) {
			mercadoria.setCadastro(atualizacao.getCadastro());
		}
		if (!verificador.verificar(atualizacao.getNome())) {
			mercadoria.setNome(atualizacao.getNome());
		}
		if (!verificador.verificar(atualizacao.getDescricao())) {
			mercadoria.setDescricao(atualizacao.getDescricao());
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

	public void atualizar(Set<Mercadoria> mercadorias, Set<Mercadoria> atualizacoes) {
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