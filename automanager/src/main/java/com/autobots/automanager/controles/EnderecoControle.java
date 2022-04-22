package com.autobots.automanager.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.autobots.automanager.entidades.Endereco;
// import com.autobots.automanager.modelos.AdicionadorLinkEndereco;
// import com.autobots.automanager.modelos.EnderecoSelecionador;
import com.autobots.automanager.repositorios.EnderecoRepositorio;

@Controller
public class EnderecoControle {
	@Autowired
	private EnderecoRepositorio repositorio;
	// @Autowired
	// private EnderecoSelecionador selecionador;
	// @Autowired
	// private AdicionadorLinkEndereco adicionadorLink;

	@GetMapping("/enderecos")
	public ResponseEntity<List<Endereco>> obterEnderecos() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Endereco> enderecos = repositorio.findAll();
		if (enderecos == null) {
			return new ResponseEntity<List<Endereco>>(status);
		} else {
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Endereco>>(enderecos, status);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<List<Endereco>> obterEndereco(@PathVariable long id) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Endereco> enderecos = repositorio.findAll();
		if (enderecos == null) {
			return new ResponseEntity<List<Endereco>>(status);
		} else {
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Endereco>>(enderecos, status);
		}
	}

	// @PutMapping("/alterar")
	// public void alterarCliente(@RequestBody Cliente cliente) {
	// List<Cliente> clientes = repositorioCliente.findAll();
	// Cliente selecionado = selecionadorCliente.selecionar(clientes,
	// cliente.getId());
	// selecionado.setEndereco(cliente.getEndereco());
	// repositorioCliente.save(selecionado);
	// }

	// @DeleteMapping("/excluir")
	// public void deletarEndereco(@PathVariable long id) {
	// List<Cliente> clientes = repositorioCliente.findAll();
	// Cliente selecionado = selecionadorCliente.selecionar(clientes, id);
	// selecionado.setEndereco(null);
	// repositorioCliente.save(selecionado);
	// }
}
