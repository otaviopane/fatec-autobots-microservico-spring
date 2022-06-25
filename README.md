# **Desenvolvimento Web III - Primeira Atividade Prática**
## **Professor Gerson Penha Neto**
---
#### **Contextualização:**
A venda de automóveis novos geralmente é aquecida, no Brasil. Mas, no ano de 2021, o segmento de usados passou por um fenômeno no qual os carros estavam valorizados e o mercado superaquecido. O acumulado do ano, entre os meses de janeiro e setembro registrava um percentual positivo em 30% sobre o mesmo período de 2020.

A venda de carros 0km cresceu 6,5% em novembro ante outubro de 2021. Apesar do aumento, foi o pior indicador para o mês desde 2005. Foram 173 mil carros novos vendidos no mês contra 162,3 mil no 10º mês do ano. Os dados são da Anfavea (Associação Nacional dos Fabricantes de Veículos Automotores) e engloba automóveis, veículos comerciais leves, caminhões e ônibus. Segundo a Anfavea, a oferta de semicondutores foi o principal desafio do setor.

A baixa oferta de veículos novos e a demanda aquecida por automóveis próprios estimularam as vendas nas concessionárias voltadas para a venda de veículos seminovos e usados ao longo de 2021. Em Minas Gerais, a comercialização avançou 11,5% em 2021, se comparada com 2020, somando 1,85 milhão de unidades. Estes dados foram disponibilizados pela Federação Nacional das Associações dos Revendedores de Veículos Automotores (Fenauto).

No País, também foi registrada alta nas vendas. De acordo com a Fenauto, o total de carros comercializados foi de 15.106.724 unidades, resultado 17,8% superior ao apurado em 2020.

A falta de semicondutores também afeta a manutenção de veículos usados e, no ano de 2021, o custo com manutenção de automóveis aumentou consideravelmente, mesmo com a procura elevada. Diante da alta demanda tornou-se fundamental investimento no atendimento ao cliente, visto que os preços elevados afetam bastante o critério de busca pelos serviços de manutenção. Além disso, soma-se a necessidade de agilizar a gestão das lojas especializadas em manutenção veicular.

---
#### **Atividade:**
Considere que você é um empreendedor e abriu recente sua startup, que fornece sistema para gestão de lojas especializadas em manutenção veicular e vendas de autopeças. O nome da empresa é um orgulho, chama-se AutoBots!

O objetivo é construir uma aplicação que funcione de maneira rápida e com acesso via internet. Além disso, a aplicação deve ser flexível e facilmente integrada a outros sistemas, caso seja vontade dos clientes. Por isso, depois de conversar com sua equipe de desenvolvimento, optou-se pela arquitetura de micro-serviços, no back-end.

Dado a decisão, o primeiro trabalho da equipe foi desenvolver um CRUD básico, que é padrão para todo tipo de sistema de gestão, o cadastro das informações do cliente.

A estrutura de classes pensada pela equipe de desenvolvimento segue o diagrama UML da Figura 1. Esta estrutura representa as entidades, ou seja, as classes que utilizadas para manipular a base de dados.

![diagrama de classe](https://user-images.githubusercontent.com/58819253/174506049-d1cd409d-efef-491f-b4a1-49e5076b072e.png)

Nesta primeira etapa do projeto, a equipe de desenvolvimento tentou seguir os principais padrões de projeto e conceitos SOLID. Por isso, classe adicionais foram criadas para realizar as regras de negócio. O diagrama UML da Figura 2 apresenta as classes.

![diagrama de classe](https://user-images.githubusercontent.com/58819253/174506063-a377f906-426e-4cd6-9628-d1b6a1280f8b.png)

Apesar do esforço da equipe, o CRUD ainda está incompleto. Faltam ainda os procedimentos de inserção, atualização, seleção e remoção para todas as entidades da base de dados. Além disso, o que foi desenvolvido, talvez, não esteja do seu agrado e precisa de atualização.

Além de empreendedor, você também é um desenvolvedor e por isso irá assumir esta responsabilidade, terminar os demais CRUDs e, se julgar necessário, atualizar qualquer código.

Desde o início sua equipe trabalha remotamente e, por isso, existe um repositório remoto, onde todo o código atualizado do projeto foi colocado. Você deverá acessar o repositório para obter tudo o que foi desenvolvido e poder continuar o trabalho de desenvolvimento. O acesso ao código pode ser feito pelo link: https://github.com/gerson-pn/atvi-autobots-microservico-spring


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
git checkout Atividade01
```

### Executar o projeto:
#### Depois de esperar carregar as dependências do projeto utilizando o Eclipse ou VSCode:
Na pasta raiz do projeto, execute o arquivo:
```bash
/automanager/src/main/java/com/autobots/automanager/AutomanagerApplication.java
```


### Projeto já está sendo executado :D

---
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
| [![](https://img.shields.io/badge/-PUT-orange)]() | Cadastro de um cliente             | `http://localhost:8080/cliente/cadastro` |
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