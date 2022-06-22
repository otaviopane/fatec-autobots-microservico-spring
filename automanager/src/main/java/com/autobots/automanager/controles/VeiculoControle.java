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
import com.autobots.automanager.entidades.Veiculo;
import com.autobots.automanager.modelos.AdicionadorLinkVeiculo;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.VeiculoSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.VeiculoRepositorio;

@RestController
@RequestMapping("/veiculo")
public class VeiculoControle {
	@Autowired
	private VeiculoRepositorio repositorio;
	@Autowired
	private AdicionadorLinkVeiculo adicionadorLinkVeiculo;
	@Autowired
	private VeiculoSelecionador selecionarVeiculo;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/veiculos")
	public ResponseEntity<List<Veiculo>> obterVeiculos() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Veiculo> veiculos = repositorio.findAll();
		if (veiculos == null) {
			return new ResponseEntity<List<Veiculo>>(status);
		} else {
			adicionadorLinkVeiculo.adicionarLink(veiculos);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Veiculo>>(veiculos, status);
		}
	}

	@GetMapping("/{id}")
	public Veiculo obterVeiculo(@PathVariable long id) {
		List<Veiculo> veiculos = repositorio.findAll();
		return selecionarVeiculo.selecionar(veiculos, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarVeiculo(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getVeiculos().addAll(usuario.getVeiculos());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{veiculoId}")
	public void deletarVeiculo(@PathVariable long usuarioId, @PathVariable long veiculoId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Veiculo> listaVeiculos = usuario.getVeiculos();
		Veiculo findVeiculo = null;
		for (Veiculo veiculo : listaVeiculos) {
			if (veiculo.getId() == veiculoId) {
				findVeiculo = veiculo;
			}
		}
		listaVeiculos.remove(findVeiculo);
		usuarioRepositorio.save(usuario);
	}
}
