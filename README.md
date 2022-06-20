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

![diagrama de classe](https://user-images.githubusercontent.com/58819253/174502876-e04a6faa-8e04-4c17-b2a7-5ea2d05fe73b.png)

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

### Executar o projeto:
Na pasta raiz do projeto, execute o arquivo:
```bash
/automanager/src/main/java/com/autobots/automanager/AutomanagerApplication.java
```


## Projeto já está sendo executado :D

------
