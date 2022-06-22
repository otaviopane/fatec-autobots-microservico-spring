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
import com.autobots.automanager.entidades.Telefone;
import com.autobots.automanager.modelos.AdicionadorLinkTelefone;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.TelefoneSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.TelefoneRepositorio;

@RestController
@RequestMapping("/telefone")
public class TelefoneControle {
	@Autowired
	private TelefoneRepositorio repositorio;
	@Autowired
	private AdicionadorLinkTelefone adicionadorLinkTelefone;
	@Autowired
	private TelefoneSelecionador selecionarTelefone;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/telefones")
	public ResponseEntity<List<Telefone>> obterTelefones() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Telefone> telefones = repositorio.findAll();
		if (telefones == null) {
			return new ResponseEntity<List<Telefone>>(status);
		} else {
			adicionadorLinkTelefone.adicionarLink(telefones);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Telefone>>(telefones, status);
		}
	}

	@GetMapping("/{id}")
	public Telefone obterTelefone(@PathVariable long id) {
		List<Telefone> telefones = repositorio.findAll();
		return selecionarTelefone.selecionar(telefones, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarTelefone(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getTelefones().addAll(usuario.getTelefones());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{telefoneId}")
	public void deletarTelefone(@PathVariable long usuarioId, @PathVariable long telefoneId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Telefone> listaTelefones = usuario.getTelefones();
		Telefone findTelefone = null;
		for (Telefone telefone : listaTelefones) {
			if (telefone.getId() == telefoneId) {
				findTelefone = telefone;
			}
		}
		listaTelefones.remove(findTelefone);
		usuarioRepositorio.save(usuario);
	}
}
