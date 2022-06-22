package com.autobots.automanager.modelos;

import com.autobots.automanager.entidades.Empresa;

public class EmpresaAtualizador {
	private StringVerificadorNulo verificador = new StringVerificadorNulo();
	private EnderecoAtualizador enderecoAtualizador = new EnderecoAtualizador();
	private DocumentoAtualizador documentoAtualizador = new DocumentoAtualizador();
	private TelefoneAtualizador telefoneAtualizador = new TelefoneAtualizador();

	private void atualizarDados(Empresa empresa, Empresa atualizacao) {
		if (!verificador.verificar(atualizacao.getNome())) {
			empresa.setNome(atualizacao.getNome());
		}
		if (!verificador.verificar(atualizacao.getNomeSocial())) {
			empresa.setNomeSocial(atualizacao.getNomeSocial());
		}
		if (!(atualizacao.getDataCadastro() == null)) {
			empresa.setDataCadastro(atualizacao.getDataCadastro());
		}
		if (!(atualizacao.getDataNascimento() == null)) {
			empresa.setDataNascimento(atualizacao.getDataNascimento());
		}
	}

	public void atualizar(Empresa empresa, Empresa atualizacao) {
		atualizarDados(empresa, atualizacao);
		enderecoAtualizador.atualizar(empresa.getEndereco(), atualizacao.getEndereco());
		documentoAtualizador.atualizar(empresa.getDocumentos(), atualizacao.getDocumentos());
		telefoneAtualizador.atualizar(empresa.getTelefones(), atualizacao.getTelefones());
	}
}
