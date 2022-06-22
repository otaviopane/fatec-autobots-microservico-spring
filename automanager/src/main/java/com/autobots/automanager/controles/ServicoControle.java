package com.autobots.automanager.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Usuario;
import com.autobots.automanager.entidades.Servico;
import com.autobots.automanager.modelos.AdicionadorLinkServico;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.ServicoSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.ServicoRepositorio;

@RestController
@RequestMapping("/servico")
public class ServicoControle {
	@Autowired
	private ServicoRepositorio repositorio;
	@Autowired
	private AdicionadorLinkServico adicionadorLinkServico;
	@Autowired
	private ServicoSelecionador selecionarServico;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/servicos")
	public ResponseEntity<List<Servico>> obterServicos() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Servico> servicos = repositorio.findAll();
		if (servicos == null) {
			return new ResponseEntity<List<Servico>>(status);
		} else {
			adicionadorLinkServico.adicionarLink(servicos);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Servico>>(servicos, status);
		}
	}

	@GetMapping("/{id}")
	public Servico obterServico(@PathVariable long id) {
		List<Servico> servicos = repositorio.findAll();
		return selecionarServico.selecionar(servicos, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarServico(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getServicos().addAll(usuario.getServicos());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{servicoId}")
	public void deletarServico(@PathVariable long usuarioId, @PathVariable long servicoId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Servico> listaServicos = usuario.getServicos();
		Servico findServico = null;
		for (Servico servico : listaServicos) {
			if (servico.getId() == servicoId) {
				findServico = servico;
			}
		}
		listaServicos.remove(findServico);
		usuarioRepositorio.save(usuario);
	}
}
