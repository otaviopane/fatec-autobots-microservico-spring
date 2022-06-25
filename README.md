# **Desenvolvimento Web III - Segunda Atividade Prática**
## **Professor Gerson Penha Neto**
---
#### **Contextualização:**
Depois de muito desenvolvimento, você percebeu que a aplicação automanager está
incompleta. A arquitetura escolhida foi a de micro-serviços, mas o automanager não 
contempla os quatro níveis de maturidade, conhecidos como RMM (Richardson 
Maturity Model). Os níveis RMM podem ser lembrados pela Figura 1.

![diagrama de classe](https://user-images.githubusercontent.com/58819253/174507831-f7e76dc0-0ae7-4e82-9ae6-667448ca0952.png)
---
#### **Atividade:**
Você trabalhou bastante na aplicação e implementou todos os CRUDs faltantes. O 
objetivo agora é implementar os níveis de maturidade no automanager. Para isso, deve-se utilizar todos os recursos necessários e disponíveis nos frameworks e tecnologias 
utilizadas no desenvolvimento.
Para auxiliar nesta tarefa um ex-membro do time de desenvolvimento deixou uma 
parte, inicial, já pronta. Este membro não terminou o trabalho porque se retirou da 
empresa, mas disponibilizou um repositório com o seu desenvolvimento. Os códigos 
podem ser acessados pelo link: https://github.com/gerson-pn/atvii-autobots-microservico-spring.

------
------

## Como utilizar:

### Para fazer uso do projeto, será necessário:

------

### Clonar o projeto:

Com seu terminal aberto na pasta onde deseja salvar o repositório digite:

**Escolha uma opção a seguir:**

Fazendo uso do HTTPS:
```bash
git clone https://github.com/otaviopane/fatec-autobots-microservico-spring.git
```
Fazendo uso do SSH:
```bash
git clone git@github.com:otaviopane/fatec-autobots-microservico-spring.git
```

------

### Alterar para a branch da atividade:
No terminal execute:
```bash
git checkout Atividade02
```

### Executar o projeto:
Na pasta raiz do projeto, execute o arquivo:
```bash
/automanager/src/main/java/com/autobots/automanager/AutomanagerApplication.java
```


## Projeto já está sendo executado :D

------
---
# Rotas
###  Rotas do Cliente (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                          | Rota                                     |
| :-----------------------------------------------: | :--------------------------------- | :--------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos clientes              | `http://localhost:8080/cliente/clientes` | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um cliente         | `http://localhost:8080/cliente/{id}`     |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um cliente             | `http://localhost:8080/cliente/cadastro` |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Atualizar dados de um cliente      | `http://localhost:8080/cliente/atualizar`|
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um cliente             | `http://localhost:8080/cliente/excluir`  |

</details>

---

###  Rotas do Documento (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                   | Rota                                                  |
| :-----------------------------------------------: | :-------------------------- | :---------------------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos documentos     | `http://localhost:8080/documento/documentos`          | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um document | `http://localhost:8080/documento/{id}`                |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Cadastro de um documento    | `http://localhost:8080/documento/cadastro`            |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um documento    | `http://localhost:8080/documento/excluir/{clienteId}/{documentoId}`|

</details>

---

###  Rotas do Endereço (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                        | Rota                                      |
| :-----------------------------------------------: | :------------------------------- | :---------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos enderecos           | `http://localhost:8080/endereco/enderecos`| 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um endereco      | `http://localhost:8080/endereco/{id}`     |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um endereco          | `http://localhost:8080/endereco/cadastro`  |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Atualizar dados de um endereco   | `http://localhost:8080/endereco/alterar`  |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um endereco          | `http://localhost:8080/endereco/excluir`  |

</details>

---

###  Rotas do Telefone (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                   | Rota                                                             |
| :-----------------------------------------------: | :-------------------------- | :--------------------------------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos telefones      | `http://localhost:8080/telefone/telefones`                       | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um telefone | `http://localhost:8080/telefone/{id}`                            |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Cadastro de um telefone     | `http://localhost:8080/telefone/cadastro`                        |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um telefone     | `http://localhost:8080/telefone/excluir/{clienteId}/{telefoneId}`|

</details>

---