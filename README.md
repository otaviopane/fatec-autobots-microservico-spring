# **Desenvolvimento Web III - Quinta Atividade Prática**
## **Professor Gerson Penha Neto**
---
#### **Contextualização:**
Um sistema distribuído é uma coleção de programas de computador que utilizam recursos computacionais em vários pontos centrais de computação diferentes para atingir um objetivo comum e compartilhado. Os sistemas distribuídos visam remover gargalos ou pontos centrais de falha de um sistema. A internet é o maior exemplo de sistema distribuído.

O contraponto dos sistemas distribuídos são os sistemas centralizados. Um sistema de computação centralizado é onde toda a computação é executada por um único computador em um único local. A principal diferença entre sistemas centralizados e distribuídos é o padrão de comunicação entre os pontos centrais do sistema.

O estado de um sistema centralizado está contido em um ponto central que os clientes acessam de maneira personalizada. Todos os pontos de um sistema centralizado acessam o ponto central, o que pode levar ao congestionamento e lentidão da rede. Se este ponto central falhar ou travar todo o sistema é prejudicado.

Uma arquitetura de micro-serviços é um tipo de sistema distribuído, pois decompõe um aplicativo em componentes ou “serviços” diferentes. Por exemplo, uma arquitetura de 
micro-serviços pode ter serviços que correspondem a recursos de negócios (pagamentos, usuários, produtos etc.) em que cada componente correspondente lida com a lógica empresarial para essa responsabilidade.

Um micro-serviço, geralmente, é um serviço pequeno e único oferecido por uma empresa. Ele deriva da arquitetura de computação distribuída que conecta muitos serviços pequenos, em vez de ter um serviço grande. O micro-serviço pode então ser entregue por meio de uma API.

API é o acrônimo de Application Programming Interface (interface de programação de aplicativos), um intermediário de software que permite que dois aplicativos conversem entre si. Uma API permite que aplicativos acessem dados e interajam com componentes de software externos, sistemas operacionais ou micro-serviços.


---
#### **Atividade:**
Enfim, o sistema automanager foi lançado e bem aceito pelas lojas de manutenção veicular e venda de autopeças. Agora todas as unidades da Toyota e Volkswagen, no Brasil, obrigatoriamente utilizam o sistema. Em breve, o sistema será o padrão para 
todas as unidades da américa latina e você se tornará o maior fornecedor deste tipo de serviço para o continente sul-americano.

O sucesso do sistema chamou atenção dos CIOs (Chief Information Officer) e CEOs (Chief Executive Officer) dos grupos Toyota e Volkswagen. Os diretores desejam ter acesso a informações das unidades em tempo real e solicitaram isto com urgência a autobots.

Após uma reunião com a cúpula dos grupos e seus CIOs se chegou à conclusão de que a melhor forma de disponibilizar as informações desejadas é através de APIs. Serão APIs RESTFull, que deverão ser protegidas por autenticação e autorização com JWT. Cada API deverá corresponder a um micro-serviço único e, dependendo do que cada uma deva fornecer, elas poderão se comunicar e trocar dados entre si para compor suas respostas.

As APIs serão utilizadas para integrar o sistema automanager a outros sistemas dos grupos empresariais parceiros e por isso são consideradas partes críticas na cadeia de comunicação dos sistemas. Dado sua importância você será responsável pelo 
desenvolvimento de cada uma das APIs.

Você construir APIs para entregar as seguintes informações:

• Lista de todos os clientes cadastrados por empresa (loja), com suas informações completas (documentos, telefones, endereço etc.);

• Lista de todos os funcionários cadastrados por empresa (loja), com suas informações completas (documentos, perfil, telefones, endereço etc.);

• Lista de serviços e mercadorias disponíveis para venda por empresa (loja). Informações completas com data de cadastro, nome, descrição, valor etc.;

• Lista de todas os serviços ou peças vendidas por empresa para um determinado período;

• Lista de todos os veículos atendidos por empresa (loja);

Lembre-se, cada API é um micro-serviço RESTFull, portanto você deve utilizar o protocolo HTTP e qualquer verbo que julgar necessário. Além disso, você é o dono do aplicativo automanager e pode fazer qualquer alteração necessária se quiser.

Por fim, um dos engenheiros da Toyota deixou um exemplo, simples e sem autenticação/autorização. Você pode utilizar este exemplo como auxílio, se quiser. O exemplo pode ser acesso pelo endereço: https://github.com/gerson-pn/atvv-autobots-microservico-spring


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
git checkout Atividade05
```

### Executar o projeto:
#### Depois de esperar carregar as dependências do projeto utilizando o Eclipse ou VSCode:
Na pasta raiz do projeto, execute o arquivo:
```bash
/automanager/src/main/java/com/autobots/automanager/AutomanagerApplication.java
```


## Projeto já está sendo executado :D

------
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
