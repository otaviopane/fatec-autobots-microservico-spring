package com.autobots.automanager.controles;

import java.util.List;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.entidades.Telefone;
import com.autobots.automanager.modelo.ClienteSelecionador;
import com.autobots.automanager.modelo.TelefoneSelecionador;
import com.autobots.automanager.repositorios.ClienteRepositorio;
import com.autobots.automanager.repositorios.TelefoneRepositorio;

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
@RequestMapping("/telefone")
public class TelefoneControle {
  @Autowired
  private TelefoneSelecionador selecionador;

  @Autowired
  private ClienteSelecionador selecionadorCliente;

  @Autowired
  private ClienteRepositorio repositorioCliente;

  @Autowired
  private TelefoneRepositorio repositorio;

  @GetMapping("/")
  public List<Telefone> obterTelefones() {
    List<Telefone> telefones = repositorio.findAll();
    return telefones;
  }

  @GetMapping("/{id}")
  public Telefone obterCliente(@PathVariable long id) {
    List<Telefone> telefones = repositorio.findAll();
    return selecionador.selecionar(telefones, id);
  }

  @PutMapping("/cadastro")
  public void cadastrarCliente(@RequestBody Cliente cliente) {
    List<Cliente> clientes = repositorioCliente.findAll();
    Cliente selecionado = selecionadorCliente.selecionar(clientes, cliente.getId());
    selecionado.setTelefone(cliente.getTelefone());
    repositorioCliente.save(selecionado);
  }

  @DeleteMapping("/delete/{id}")
  public void deletarTelefone(@PathVariable long id) {
    List<Cliente> clientes = repositorioCliente.findAll();
    Cliente selecionado = selecionadorCliente.selecionar(clientes, id);
    selecionado.setTelefone(null);
    repositorioCliente.save(selecionado);
  }

}
