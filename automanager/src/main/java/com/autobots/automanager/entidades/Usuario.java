package com.autobots.automanager.entidades;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.hateoas.RepresentationModel;

import com.autobots.automanager.enumeracoes.PerfilUsuario;

import com.autobots.automanager.modelos.Perfil;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(exclude = { "mercadorias", "vendas", "veiculos" }, callSuper = false)
@Entity
public class Usuario extends RepresentationModel<Usuario> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Credencial credencial;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Perfil> Perfis = new ArrayList<>();
	@Column
	private String nomeSocial;
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Telefone> telefones = new HashSet<>();
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Endereco endereco;
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Documento> documentos = new HashSet<>();
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Email> emails = new HashSet<>();
	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Credencial> credenciais = new HashSet<>();
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<Mercadoria> mercadorias = new HashSet<>();
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Venda> vendas = new HashSet<>();
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Veiculo> veiculos = new HashSet<>();
}