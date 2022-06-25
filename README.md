# **Desenvolvimento Web III - Terceira Atividade Prática**
## **Professor Gerson Penha Neto**
---
#### **Contextualização:**
Os níveis de maturidade, para os micro-serviços, foram implementados e a aplicação automanager está cada vez melhor – isto animou a equipe de marketing da empresa, que partiu em busca de investidores e grupos empresariais para, finalmente, lançar o produto no mercado.

Após duas semanas de apresentações, e apesar da animação, o retorno obtido pela equipe de marketing não foi positivo. Todos os investidores solicitaram mudanças na aplicação que não atende, ainda, as necessidades básicas de uma loja de manutenção veicular e venda de autopeças.

Foram várias solicitações de atualizações no software, mas nem todas serão atendidas. Inteligentemente, a equipe de marketing selecionou alguns parceiros específicos, investidores promissores que deram sugestões importantíssimas e irão ajudar muito no lançamento do software. Os novos parceiros da autobots são: Toyota Motor Corporation e o grupo Volkswagen.

Toyota Motor Corporation é um fabricante automotivo japonês com sede na Toyota, província de Aichi, no Japão. O grupo Volkswagen é o maior fabricante de automóveis do mundo e tem a sua sede na cidade de Wolfsburg, na Baixa Saxônia. Os novos parceiros pretendem instalar o automanager nas suas redes de manutenção veicular e lojas de autopeças no Brasil. Isto é uma oportunidade imperdível.

---
#### **Atividade:**
Após várias reuniões com os investidores e com sua equipe de desenvolvimento definiu-se o que é preciso adicionar no sistema para que o primeiro MVP seja lançado. 

As atualizações foram divididas em duas partes, denominadas de “atualização de base” e “atualização de segurança”. Por decisão unânime da equipe de desenvolvimento, primeiro será feito a “atualização de base” e você será o responsável pelo seu desenvolvimento, enquanto o restante da equipe avalia os melhores fornecedores de serviços cloud, para implantação do sistema no Brasil.

A “atualização de base” consiste em adicionar mais capacidades no sistema, que atualmente apenas registra clientes e informações como número de documentos, telefone e endereço. Agora o sistema deverá ser preparado para armazenar informações como usuários, veículos, serviços, peças, vendas e o que mais for minimamente necessário para a operação de uma loja de manutenção veicular.

Após conversas com a equipe de desenvolvimento, chegou-se a uma estrutura, um diagrama de classes, onde apresenta-se os relacionamentos entre as classes e evidencia-se as novas capacidades do sistema. Este diagrama é apresentado na Figura 
1.

![diagrama de classe](https://user-images.githubusercontent.com/58819253/174511706-b930091c-3236-4369-b110-95555038f0b5.png)

A equipe de desenvolvimento preparou um projeto com os códigos das classes apresentadas na Figura 1. O objetivo é implementar estas classes no sistema, bem como todo o CRUD para as entidades e HATEOAS.

Você tem liberdade para modificar os códigos, que foram sugeridos pela equipe de desenvolvimento, afinal, você é o fundador da empresa e o maior idealizador do produto. Contudo, as funcionalidades não devem ser negligenciadas, porque foram solicitações dos investidores, as novas funcionalidades são:

• Cadastro de empresa, ou seja, a unidade comercial que oferece o serviço de manutenção e venda de mercadorias.

• Inclusão associação de usuários a uma determinada empresa.

• Definição dos tipos de usuário no sistema, que pode ser cliente, fornecedor ou funcionário.

• Cadastro de veículos, mercadorias e serviços, para gerenciamento de vendas e serviços prestados a um usuário e seu veículo.

• Inclusão de credencial para acesso de um usuário ao sistema.

Os códigos desenvolvidos pela equipe de desenvolvimento estão disponíveis a partir no endereço: https://github.com/gerson-pn/atviii-autobots-microservico-spring

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
git checkout Atividade03
```

### Executar o projeto:
Na pasta raiz do projeto, execute o arquivo:
```bash
/automanager/src/main/java/com/autobots/automanager/AutomanagerApplication.java
```


## Projeto já está sendo executado :D

------
# Rotas
###  Rotas do Documento (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                   | Rota                                           |
| :-----------------------------------------------: | :-------------------------- | :--------------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos documentos     | `http://localhost:8080/documento/documentos`   | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um document | `http://localhost:8080/documento/{id}`         |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um documento    | `http://localhost:8080/documento/cadastro`     |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um documento    | `http://localhost:8080/documento/excluir`      |

</details>

---
###  Rotas do Email (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                        | Rota                                   |
| :-----------------------------------------------: | :------------------------------- | :------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos emails              | `http://localhost:8080/email/emails`   | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um email         | `http://localhost:8080/email/{id}`     |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um email             | `http://localhost:8080/email/cadastro` |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um email             | `http://localhost:8080/email/excluir`  |

</details>

---
###  Rotas do Empresa (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                          | Rota                                      |
| :-----------------------------------------------: | :--------------------------------- | :---------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos empresas              | `http://localhost:8080/empresa/empresas`  | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de uma empresa        | `http://localhost:8080/empresa/{id}`      |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um empresa             | `http://localhost:8080/empresa/cadastro`  |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Atualizar dados de uma empresa     | `http://localhost:8080/empresa/atualizar` |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um empresa             | `http://localhost:8080/empresa/excluir`   |

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
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um endereco          | `http://localhost:8080/endereco/cadastro` |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Atualizar dados de um endereco   | `http://localhost:8080/endereco/atualizar`|
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um endereco          | `http://localhost:8080/endereco/excluir`  |

</details>

---
###  Rotas da Mercadoria (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                     | Rota                                            |
| :-----------------------------------------------: | :---------------------------- | :---------------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos mercadorias      | `http://localhost:8080/mercadoria/mercadorias`  | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um mercadoria | `http://localhost:8080/mercadoria/{id}`         |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um mercadoria     | `http://localhost:8080/mercadoria/cadastro`     |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um mercadoria     | `http://localhost:8080/mercadoria/excluir`      |

</details>

---

###  Rotas do Serviço (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                    | Rota                                      |
| :-----------------------------------------------: | :--------------------------- | :---------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos servicos        | `http://localhost:8080/servico/servicos`  | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um servico   | `http://localhost:8080/servico/{id}`      |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um servico       | `http://localhost:8080/servico/cadastro`  |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um servico       | `http://localhost:8080/servico/excluir`   |

</details>

---
###  Rotas do Telefone (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                   | Rota                                       |
| :-----------------------------------------------: | :-------------------------- | :----------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos telefones      | `http://localhost:8080/telefone/telefones` | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um telefone | `http://localhost:8080/telefone/{id}`      |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um telefone     | `http://localhost:8080/telefone/cadastro`  |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um telefone     | `http://localhost:8080/telefone/excluir`  |

</details>

---
###  Rotas do Usuário (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                          | Rota                                      |
| :-----------------------------------------------: | :--------------------------------- | :---------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos usuários              | `http://localhost:8080/usuario/usuarios`  | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de uma usuário        | `http://localhost:8080/usuario/{id}`      |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um usuário             | `http://localhost:8080/usuario/cadastro`  |
| [![](https://img.shields.io/badge/-PUT-orange)]() | Atualizar dados de uma usuário     | `http://localhost:8080/usuario/atualizar` |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um usuário             | `http://localhost:8080/usuario/excluir`   |

</details>

---
###  Rotas do Veiculo (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                   | Rota                                    |
| :-----------------------------------------------: | :-------------------------- | :-------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos veículos      | `http://localhost:8080/veiculo/veiculos` | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um veiculo | `http://localhost:8080/veiculo/{id}`     |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um veiculo     | `http://localhost:8080/veiculo/cadastro` |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um veiculo     | `http://localhost:8080/veiculo/excluir`  |

</details>

---
###  Rotas da Venda (CRUD)

<details>
    <summary> Aperte aqui:</summary>
<br>

| Tipo                                              | Descrição                | Rota                                   |
| :-----------------------------------------------: | :----------------------- | :------------------------------------- |
| [![](https://img.shields.io/badge/-GET-purple)]() | Listagem dos vendas      | `http://localhost:8080/venda/vendas`   | 
| [![](https://img.shields.io/badge/-GET-purple)]() | Listar dados de um venda | `http://localhost:8080/venda/{id}`     |
| [![](https://img.shields.io/badge/-POST-green)]() | Cadastro de um venda     | `http://localhost:8080/venda/cadastro` |
| [![](https://img.shields.io/badge/-DELETE-red)]() | Exclusão de um venda     | `http://localhost:8080/venda/excluir`  |

</details>

---