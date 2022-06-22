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
import com.autobots.automanager.entidades.Mercadoria;
import com.autobots.automanager.modelos.AdicionadorLinkMercadoria;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.MercadoriaSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.MercadoriaRepositorio;

@RestController
@RequestMapping("/mercadoria")
public class MercadoriaControle {
	@Autowired
	private MercadoriaRepositorio repositorio;
	@Autowired
	private AdicionadorLinkMercadoria adicionadorLinkMercadoria;
	@Autowired
	private MercadoriaSelecionador selecionarMercadoria;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/mercadorias")
	public ResponseEntity<List<Mercadoria>> obterMercadorias() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Mercadoria> mercadorias = repositorio.findAll();
		if (mercadorias == null) {
			return new ResponseEntity<List<Mercadoria>>(status);
		} else {
			adicionadorLinkMercadoria.adicionarLink(mercadorias);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Mercadoria>>(mercadorias, status);
		}
	}

	@GetMapping("/{id}")
	public Mercadoria obterMercadoria(@PathVariable long id) {
		List<Mercadoria> mercadorias = repositorio.findAll();
		return selecionarMercadoria.selecionar(mercadorias, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarMercadoria(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getMercadorias().addAll(usuario.getMercadorias());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{mercadoriaId}")
	public void deletarMercadoria(@PathVariable long usuarioId, @PathVariable long mercadoriaId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Mercadoria> listaMercadorias = usuario.getMercadorias();
		Mercadoria findMercadoria = null;
		for (Mercadoria mercadoria : listaMercadorias) {
			if (mercadoria.getId() == mercadoriaId) {
				findMercadoria = mercadoria;
			}
		}
		listaMercadorias.remove(findMercadoria);
		usuarioRepositorio.save(usuario);
	}
}
