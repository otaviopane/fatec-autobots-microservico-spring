package com.autobots.automanager.controles;

import java.util.List;

import com.autobots.automanager.entidades.Usuario;
import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.modelos.AdicionadorLinkDocumento;
import com.autobots.automanager.modelos.UsuarioSelecionador;
import com.autobots.automanager.modelos.DocumentoSelecionador;
import com.autobots.automanager.repositorios.UsuarioRepositorio;
import com.autobots.automanager.repositorios.DocumentoRepositorio;
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

@RestController
@RequestMapping("/documento")
public class DocumentoControle {
	@Autowired
	private DocumentoRepositorio repositorio;
	@Autowired
	private AdicionadorLinkDocumento adicionadorLinkDocumento;
	@Autowired
	private DocumentoSelecionador selecionarDocumento;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private UsuarioSelecionador usuarioSelecionador;

	@GetMapping("/documentos")
	public ResponseEntity<List<Documento>> obterDocumentos() {
		HttpStatus status = HttpStatus.NOT_FOUND;
		List<Documento> documentos = repositorio.findAll();
		if (documentos == null) {
			return new ResponseEntity<List<Documento>>(status);
		} else {
			adicionadorLinkDocumento.adicionarLink(documentos);
			status = HttpStatus.FOUND;
			return new ResponseEntity<List<Documento>>(documentos, status);
		}
	}

	@GetMapping("/{id}")
	public Documento obterDocumento(@PathVariable long id) {
		List<Documento> documentos = repositorio.findAll();
		return selecionarDocumento.selecionar(documentos, id);
	}

	@PutMapping("/cadastro")
	public void cadastrarDocumento(@RequestBody Usuario usuario) {
		List<Usuario> usuarios = usuarioRepositorio.findAll();
		Usuario usuarioAlvo = usuarioSelecionador.selecionar(usuarios, usuario.getId());
		usuarioAlvo.getDocumentos().addAll(usuario.getDocumentos());
		usuarioRepositorio.save(usuarioAlvo);
	}

	@DeleteMapping("/excluir/{usuarioId}/{documentoId}")
	public void deletarDocumento(@PathVariable long usuarioId, @PathVariable long documentoId) {
		Usuario usuario = usuarioRepositorio.getById(usuarioId);
		List<Documento> listaDocumentos = usuario.getDocumentos();
		Documento findDocumento = null;
		for (Documento documento : listaDocumentos) {
			if (documento.getId() == documentoId) {
				findDocumento = documento;
			}
		}
		listaDocumentos.remove(findDocumento);
		usuarioRepositorio.save(usuario);
	}
}