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
import com.autobots.automanager.entidades.Venda;
import com.autobots.automanager.modelos.AdicionadorLinkVenda;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.VendaSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.VendaRepositorio;

@RestController
@RequestMapping("/venda")
public class VendaControle {
	@Autowired
	private VendaRepositorio repositorio;
	@Autowired
	private AdicionadorLinkVenda adicionadorLinkVenda;
	@Autowired
	private VendaSelecionador selecionarVenda;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/vendas")
	public ResponseEntity<List<Venda>> obterVendas() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Venda> vendas = repositorio.findAll();
		if (vendas == null) {
			return new ResponseEntity<List<Venda>>(status);
		} else {
			adicionadorLinkVenda.adicionarLink(vendas);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Venda>>(vendas, status);
		}
	}

	@GetMapping("/{id}")
	public Venda obterVenda(@PathVariable long id) {
		List<Venda> vendas = repositorio.findAll();
		return selecionarVenda.selecionar(vendas, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarVenda(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getVendas().addAll(usuario.getVendas());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{vendaId}")
	public void deletarVenda(@PathVariable long usuarioId, @PathVariable long vendaId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Venda> listaVendas = usuario.getVendas();
		Venda findVenda = null;
		for (Venda venda : listaVendas) {
			if (venda.getId() == vendaId) {
				findVenda = venda;
			}
		}
		listaVendas.remove(findVenda);
		usuarioRepositorio.save(usuario);
	}
}
