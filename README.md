Microsserviços com Spring Boot
------------------------------

Este repositório contém o código-fonte atualizado do tutorial de microsserviços com Spring Boot.
Você pode assistir ao tutorial no [YouTube](https://www.youtube.com/watch?v=mPPhcU7oWDU&t=20634s)

Introdução
----------

Neste projeto de microsserviços Spring Boot, são utilizadas diversas ferramentas e tecnologias que ajudam a criar, monitorar, gerenciar e testar a aplicação de maneira eficiente e escalável. Neste documento, será apresentada uma descrição das principais ferramentas utilizadas, agrupadas de acordo com suas funções e características.

Sumário
-------

1.  Orquestração e gerenciamento de contêineres
2.  Monitoramento e rastreamento
3.  Armazenamento de dados
4.  Segurança e autenticação
5.  Comunicação entre serviços
6.  Resiliência e tolerância a falhas
7.  Testes e desenvolvimento

Desenvolvimento
---------------

1.  Orquestração e gerenciamento de contêineres

    *   **Kubernetes**: Plataforma de orquestração de contêineres que permite gerenciar, escalar e automatizar implantações.
    *   **Docker**: Tecnologia que permite criar, implantar e executar aplicativos em contêineres.
    *   **JIB**: Plugin do Maven que simplifica a construção de imagens Docker para aplicações Java.
2.  Monitoramento e rastreamento

    *   **Grafana**: Ferramenta de visualização e análise de métricas para monitoramento de aplicativos.
    *   **Prometheus**: Sistema de monitoramento e alerta que coleta métricas de serviços e armazena em um banco de dados.
    *   **Zipkin**: Sistema de rastreamento distribuído que ajuda a coletar informações sobre latência e problemas de desempenho.
    *   **Actuator**: Permite monitorar e gerenciar aplicativos Spring Boot através de endpoints, fornecido pelo módulo `spring-boot-starter-actuator`.
    *   **Micrometer**: Biblioteca de medição de desempenho para aplicações Java que se integra com sistemas de monitoramento como Prometheus.
3.  Armazenamento de dados

    *   **MongoDB**: Banco de dados NoSQL orientado a documentos, utilizado para armazenar informações em formato JSON.
    *   **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional open-source.
4.  Segurança e autenticação

    *   **Keycloak**: Solução de gerenciamento de identidade e acesso, que fornece autenticação e autorização para aplicações.
    *   **WebFlux Security**: Módulo do Spring Boot que fornece segurança para aplicações web reativas, fornecido pelo módulo `spring-boot-starter-webflux`.
    *   **OAuth 2.0**: Protocolo de autorização e autenticação, implementado no projeto através do módulo `spring-boot-starter-oauth2-resource-server`.
5.  Comunicação entre serviços

    *   **Kafka**: Plataforma de streaming distribuído que permite publicar, armazenar e processar fluxos de registros em tempo real.
    *   **Zookeeper**: Serviço de coordenação distribuída que ajuda a gerenciar serviços como Kafka.
    *   **Eureka (Discovery Server)**: Serviço de descoberta e registro de instâncias de microsserviços que permite a comunicação entre eles.
    *   **API Gateway**: Componente que gerencia e roteia solicitações entre os serviços, proporcionando segurança, monitoramento e resiliência.
6.  Resiliência e tolerância a falhas

    *   **Resilience4j**: Biblioteca de tolerância a falhas para aplicações Java que fornece implementações de padrões de resiliência como Circuit Breaker, Rate Limiter e Retry. No projeto, é utilizado através do módulo `spring-cloud-starter-circuitbreaker-resilience4j`.
7.  Testes e desenvolvimento

    *   **JUnit5**: Framework de testes para aplicações Java que facilita a criação e execução de testes unitários e de integração.
    *   **TestContainers**: Biblioteca que permite criar e gerenciar contêineres Docker para testes de integração em aplicações Java.
    *   **Postman**: Ferramenta que permite criar, executar e testar solicitações HTTP, facilitando o desenvolvimento e teste de APIs.
    *   **Microsserviços**: Neste projeto, são utilizados quatro microsserviços: inventory-service, notification-service, order-service e product-service. Cada um desses microsserviços possui uma responsabilidade específica dentro da aplicação, permitindo que o sistema seja escalável e fácil de manter.

Em resumo, este projeto de microsserviços Spring Boot utiliza uma combinação de tecnologias e ferramentas que fornecem uma solução completa e robusta para o desenvolvimento, gerenciamento e monitoramento de aplicações distribuídas. Ao utilizar essas ferramentas em conjunto, é possível criar um sistema eficiente, escalável e tolerante a falhas, atendendo aos requisitos modernos de aplicações empresariais. 

Proximas implementações
-----------------------

Guia sobre a criação um e-commerce usando o projeto de microsserviços Spring Boot e adicionar frontends em React e Flutter:

*   **Crie o frontend web com React:** a. Inicialize um novo projeto React usando `create-react-app` ou outro gerador de projeto de sua preferência. b. Instale as bibliotecas necessárias, como Axios ou Fetch para fazer requisições HTTP e um pacote para trabalhar com o Keycloak. c. Desenvolva os componentes React para exibir produtos, gerenciar o carrinho de compras, processar pedidos e lidar com a autenticação e autorização dos usuários.

*   **Crie o frontend mobile com Flutter:** a. Inicialize um novo projeto Flutter usando `flutter create` ou outro gerador de projeto de sua preferência. b. Instale os pacotes necessários, como um cliente HTTP e um pacote para trabalhar com o Keycloak. c. Desenvolva os widgets do Flutter para exibir produtos, gerenciar o carrinho de compras, processar pedidos e lidar com a autenticação e autorização dos usuários.

*   **Adapte e expanda os microsserviços existentes:** Além dos serviços de inventário, notificação, pedidos e produtos, você pode precisar de serviços adicionais para atender aos requisitos do seu e-commerce. Alguns possíveis serviços adicionais incluem:

    a. **Carrinho de compras:** Crie um microsserviço para gerenciar carrinhos de compras dos usuários, armazenando itens selecionados e suas quantidades. b. **Pagamento:** Implemente um microsserviço para lidar com o processamento de pagamentos. Integre-o com provedores de pagamento, como Stripe ou PayPal. c. **Logística e envio:** Desenvolva um microsserviço para gerenciar questões relacionadas ao envio de produtos, como cálculo de taxas de envio e rastreamento de pacotes. d. **Gerenciamento de usuários:** Crie um microsserviço para gerenciar informações de usuários, como endereços e detalhes de contato.

*   **Configure a autenticação e autorização com o Keycloak:** a. No frontend React e Flutter, utilize bibliotecas e pacotes específicos para trabalhar com o Keycloak e gerenciar o acesso dos usuários aos recursos do sistema. b. Configure as políticas e permissões no Keycloak para controlar o acesso dos usuários aos diferentes microsserviços e recursos.

*   **Monitore e escale os microsserviços:** a. Utilize as ferramentas de monitoramento como Grafana, Prometheus, Zipkin e Elasticsearch para rastrear o desempenho e a saúde dos microsserviços. b. Implemente estratégias de escalabilidade, como balanceamento de carga e escalonamento horizontal, para garantir que o sistema possa lidar com o aumento da carga de trabalho.

*   **Teste e implante o sistema:** a. Realize testes abrangentes em todos os componentes do sistema, incluindo os microsserviços, frontend web e aplicativo mobile. b. Faça a implantação dos microsserviços e das aplicações frontend no ambiente de produ


Algumas sugestões gerais podem ser úteis, dependendo do contexto e necessidades do projeto:



1.  **Tracing distribuído**: Além do Zipkin, você também pode considerar o uso de Jaeger, outra ferramenta de tracing distribuído popular que fornece recursos adicionais, como uma UI mais avançada e suporte para diferentes backends de armazenamento.

2.  **Monitoramento de logs**: Para uma melhor gestão e análise de logs, você pode incluir o uso de ferramentas como o Elasticsearch, Logstash e Kibana (ELK Stack) ou Graylog. Essas ferramentas auxiliam na centralização, análise e visualização de logs gerados pelos serviços, facilitando a detecção de problemas e a compreensão do comportamento do sistema.

3.  **Orquestração de contêineres**: Se você planeja implantar a aplicação em um ambiente de produção e escalar horizontalmente, considere o uso de um orquestrador de contêineres como o Kubernetes ou o Docker Swarm. Essas ferramentas facilitam o gerenciamento, escalabilidade e implantação de aplicações baseadas em contêineres.

4.  **Service Mesh**: Para uma gestão mais avançada de tráfego, segurança e observabilidade entre os serviços, você pode explorar o uso de uma service mesh como Istio ou Linkerd. Uma service mesh pode fornecer recursos adicionais, como controle de tráfego granular, segurança aprimorada e observabilidade detalhada para aplicações de microsserviços.


Essas são apenas algumas sugestões que podem ser consideradas ao avaliar as ferramentas e tecnologias utilizadas no projeto.



Login no Docker Hub
-------------------

```terminal
docker logout 
docker login registry-1.docker.io
```

Clonar aplicação
----------------

```terminal
https://github.com/nauam/spring-boot-microservices.git
```

Executando a aplicação sem Docker
---------------------------------

### Inicialização dos bancos de dados

Os bancos de dados são executados usando o Docker. A aplicação utiliza três bancos de dados diferentes:

*   `data-mongo-product`: banco de dados MongoDB para o serviço de produto;
*   `data-postgres-order`: banco de dados PostgreSQL para o serviço de pedidos;
*   `data-postgres-inventory`: banco de dados PostgreSQL para o serviço de inventário.

Para inicializá-los, execute o seguinte comando:

```terminal
docker-compose up -d data-mongo-product data-postgres-order data-postgres-inventory
```

### Inicialização do Keycloak

Keycloak é um servidor de autenticação e autorização de código aberto que oferece suporte a protocolos como OpenID Connect e SAML. Neste projeto, ele é utilizado para gerenciar a autenticação e autorização dos microsserviços. Para inicializar o Keycloak e seu banco de dados MySQL, execute o seguinte comando:

```terminal
docker-compose up -d data-mysql-keycloak keycloak
```

### Inicialização do Zipkin

Zipkin é um sistema de rastreamento distribuído que permite coletar informações sobre o desempenho e latência das chamadas entre os microsserviços. Ele é utilizado neste projeto para monitorar e melhorar o desempenho dos microsserviços. Para inicializar o Zipkin, execute o seguinte comando:

```terminal
docker-compose up -d zipkin
```

### Inicialização do Kafka e Zookeeper

Kafka é uma plataforma distribuída de streaming que permite publicar e assinar eventos em tempo real. Neste projeto, é utilizado como um mecanismo de comunicação assíncrona entre os microsserviços. Zookeeper é um serviço de coordenação distribuída que auxilia na gerência do Kafka. Para inicializar o Kafka e o Zookeeper, execute o seguinte comando:

```terminal
docker-compose up -d broker zookeeper
```

### Inicialização do Discovery Server com Netflix Eureka

Netflix Eureka é um serviço de descoberta que permite registrar e localizar microsserviços na arquitetura. Ele é utilizado neste projeto para facilitar a comunicação entre os microsserviços e o balanceamento de carga. Para inicializar o Eureka, execute os seguintes comandos:

```terminal
cd .\discovery-server\ 
mvn clean verify 
mvn spring-boot:run
cd ..
```

### Executando os microsserviços com Maven

Antes de executar os microsserviços, é necessário compilar e verificar o projeto com o seguinte comando:

Em seguida, navegue até cada diretório dos microsserviços e execute o comando `mvn spring-boot:run` para iniciá-los:

*   api-gateway
*   inventory-service
*   notification-service
*   order-service
*   product-service

Executando a aplicação com Docker
---------------------------------

1.  Execute `mvn clean compile jib:build` para compilar as aplicações e criar as imagens Docker no Docker Hub.
2.  Execute `docker-compose up -d` para iniciar as aplicações.

É necessário incluir o Keycloak no arquivo `C:\Windows\System32\drivers\etc\hosts`:

Requisição HTTP
----------------

### Obtendo credenciais no Keycloak

1.  Acesse o painel do Keycloak em (sem Docker) [http://localhost:8080](http://localhost:8080/) ou (com Docker) [http://keycloak:8080](http://keycloak:8080/).
2.  Faça login com usuário: `admin` e senha: `admin`.
3.  Navegue até Clients > spring-cloud-client > Credentials > Regenerate Secret.

### Autenticação

1.  No Postman, vá em Authorization > Type `OAuth 2.0` > Configure New Token.
2.  Preencha os campos conforme abaixo:
    *   Token Name: `token`
    *   Grant Type: `Client Credentials`
    *   Access Token URL (sem Docker): `http://localhost:8080/realms/spring-boot-microservices-realm/protocol/openid-connect/token`
    *   Access Token URL (com Docker): `http://keycloak:8080/realms/spring-boot-microservices-realm/protocol/openid-connect/token`
    *   Client ID: `spring-cloud-client`
    *   Client Secret: `{Regenerate Secret}`
    *   Scope: `openid offline_access`
    *   Client Authentication: `Send as basic auth header`
3.  Clique em `Get New Access Token`.

### Testando os microsserviços

1.  GET `http://localhost:8181/api/product`
    *   Clique em Send.

2.  POST `http://localhost:8181/api/order`
    *   Inclua o payload:
      ```
      {
        "orderLineItemsDtoList": [
          {
            "skuCode": "iphone_13",
            "price": 1000.00,
            "quantity": 1
          }
        ]
      }
      ```
    *   Clique em Send.
