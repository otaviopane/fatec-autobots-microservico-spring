package com.autobots.automanager.controles;

import java.util.List;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.modelo.ClienteSelecionador;
import com.autobots.automanager.modelo.DocumentoSelecionador;
import com.autobots.automanager.repositorios.ClienteRepositorio;
import com.autobots.automanager.repositorios.DocumentoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documento")
public class DocumentoControle {
  @Autowired
  private DocumentoSelecionador selecionador;

  @Autowired
  private ClienteSelecionador selecionadorCliente;

  @Autowired
  private ClienteRepositorio repositorioCliente;

  @Autowired
  private DocumentoRepositorio repositorio;

  @GetMapping("/")
  public List<Documento> obterDocumentos() {
    List<Documento> documentos = repositorio.findAll();
    return documentos;
  }

  @GetMapping("/{id}")
  public Documento obterCliente(@PathVariable long id) {
    List<Documento> documentos = repositorio.findAll();
    return selecionador.selecionar(documentos, id);
  }

  @PutMapping("/cadastro")
  public void cadastrarCliente(@RequestBody Cliente cliente) {
    List<Cliente> clientes = repositorioCliente.findAll();
    Cliente selecionado = selecionadorCliente.selecionar(clientes, cliente.getId());
    selecionado.setDocumento(cliente.getDocumento());
    repositorioCliente.save(selecionado);
  }

  @DeleteMapping("/delete/{id}")
  public void deletarDocumento(@PathVariable long id) {
    List<Cliente> clientes = repositorioCliente.findAll();
    Cliente selecionado = selecionadorCliente.selecionar(clientes, id);
    selecionado.setDocumento(null);
    repositorioCliente.save(selecionado);
  }

}
