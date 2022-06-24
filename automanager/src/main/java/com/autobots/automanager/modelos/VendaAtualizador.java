package com.autobots.automanager.modelos;

import java.util.List;
import java.util.Set;

import com.autobots.automanager.entidades.Venda;

public class VendaAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();
	private VendaAtualizador vendaAtualizador = new VendaAtualizador();
	private UsuarioAtualizador usuarioAtualizador = new UsuarioAtualizador();
	private MercadoriaAtualizador mercadoriaAtualizador = new MercadoriaAtualizador();
	private ServicoAtualizador servicoAtualizador = new ServicoAtualizador();
	private VeiculoAtualizador veiculoAtualizador = new VeiculoAtualizador();

	public void atualizarDados(Venda venda, Venda atualizacao) {
		if (!(atualizacao.getCadastro() == null)) {
			venda.setCadastro(atualizacao.getCadastro());
		}
		if (!verificador.verificar(atualizacao.getIdentificacao())) {
			venda.setIdentificacao(atualizacao.getIdentificacao());
		}
		if (!(atualizacao.getCliente() == null)) {
			venda.setCliente(atualizacao.getCliente());
		}
		if (!(atualizacao.getFuncionario() == null)) {
			venda.setFuncionario(atualizacao.getFuncionario());
		}
		if (!(atualizacao.getMercadorias() == null)) {
			venda.setMercadorias(atualizacao.getMercadorias());
		}
		if (!(atualizacao.getServicos() == null)) {
			venda.setServicos(atualizacao.getServicos());
		}
		if (!(atualizacao.getVeiculo() == null)) {
			venda.setVeiculo(atualizacao.getVeiculo());
		}
	}

	public void atualizar(Venda venda, Venda atualizacao) {
		atualizarDados(venda, atualizacao);
		usuarioAtualizador.atualizar(venda.getCliente(), atualizacao.getCliente());
		usuarioAtualizador.atualizar(venda.getFuncionario(), atualizacao.getFuncionario());
		mercadoriaAtualizador.atualizar(venda.getMercadorias(), atualizacao.getMercadorias());
		servicoAtualizador.atualizar(venda.getServicos(), atualizacao.getServicos());
		veiculoAtualizador.atualizar(venda.getVeiculo(), atualizacao.getVeiculo());
	}

	public void atualizar(Set<Venda> vendas, Set<Venda> atualizacoes) {
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