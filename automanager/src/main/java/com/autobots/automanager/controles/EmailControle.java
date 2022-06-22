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
import com.autobots.automanager.entidades.Email;
import com.autobots.automanager.modelos.AdicionadorLinkEmail;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.EmailSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.EmailRepositorio;

@RestController
@RequestMapping("/email")
public class EmailControle {
	@Autowired
	private EmailRepositorio repositorio;
	@Autowired
	private AdicionadorLinkEmail adicionadorLinkEmail;
	@Autowired
	private EmailSelecionador selecionarEmail;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/emails")
	public ResponseEntity<List<Email>> obterEmails() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Email> emails = repositorio.findAll();
		if (emails == null) {
			return new ResponseEntity<List<Email>>(status);
		} else {
			adicionadorLinkEmail.adicionarLink(emails);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Email>>(emails, status);
		}
	}

	@GetMapping("/{id}")
	public Email obterEmail(@PathVariable long id) {
		List<Email> emails = repositorio.findAll();
		return selecionarEmail.selecionar(emails, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarEmail(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getEmails().addAll(usuario.getEmails());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{emailId}")
	public void deletarEmail(@PathVariable long usuarioId, @PathVariable long emailId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Email> listaEmails = usuario.getEmails();
		Email findEmail = null;
		for (Email email : listaEmails) {
			if (email.getId() == emailId) {
				findEmail = email;
			}
		}
		listaEmails.remove(findEmail);
		usuarioRepositorio.save(usuario);
	}
}
