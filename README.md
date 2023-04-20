
# Spring Boot Microservices
This repository contains the latest source code of the spring-boot-microservices tutorial

You can watch the tutorial on Youtube here - https://www.youtube.com/watch?v=mPPhcU7oWDU&t=20634s


## JIB
JIB é um conjunto de plugins de construção de imagens para os sistemas de construção de projetos Java, como Maven e Gradle. Ele foi desenvolvido pelo Google e permite a criação de imagens Docker e OCI (Open Container Initiative) sem a necessidade de um Dockerfile ou mesmo da instalação do Docker no ambiente de desenvolvimento.

Com o JIB, os desenvolvedores podem criar imagens de contêineres otimizadas para aplicações Java, melhorando a velocidade de construção e simplificando o processo de empacotamento e implantação de aplicações Java em ambientes de contêiner.

Principais características do JIB:

* Facilidade de uso: Integra-se facilmente aos sistemas de construção Maven e Gradle, permitindo que você crie imagens de contêiner sem a necessidade de um Dockerfile.
* Otimização: JIB cria imagens otimizadas para aplicações Java, separando as dependências do projeto das classes e recursos do próprio projeto, o que melhora a velocidade de construção e implantação.
* Sem necessidade de instalar o Docker: JIB cria imagens de contêiner diretamente no sistema de construção, sem a necessidade de instalar o Docker no ambiente de desenvolvimento.
* Flexibilidade: Com JIB, é possível personalizar a imagem resultante do contêiner, incluindo a adição de arquivos, definição de variáveis de ambiente, entre outras configurações.


## Login no Docker Hub
```terminal
docker logout
docker login registry-1.docker.io
```

Se você quiser construir todos os modulos, você pode executar o seguinte comando:
```terminal
mvn clean compile jib:build
```

Para compilar os módulos "modulo1" e "modulo3", você pode executar o seguinte comando:
```terminal
mvn clean compile jib:build -pl modulo1,modulo3
```

## Docker Compose

O Docker Compose é uma ferramenta para definir e gerenciar aplicações multi-contêineres com o Docker. Ele utiliza arquivos YAML para configurar todos os serviços, redes e volumes necessários para uma aplicação e fornece um conjunto de comandos para gerenciar o ciclo de vida da aplicação.

O arquivo de configuração do Docker Compose, geralmente chamado de docker-compose.yml, descreve todos os serviços (contêineres) que compõem a aplicação e as respectivas configurações. Isso facilita o gerenciamento de aplicações complexas compostas por vários serviços interconectados.

Aqui estão algumas das características do Docker Compose:

* Configuração simples: Utiliza arquivos YAML para descrever a infraestrutura da aplicação, tornando-a fácil de entender e modificar.
* Gerenciamento de aplicações multi-contêineres: Ajuda a gerenciar e organizar aplicações compostas por vários contêineres e suas dependências.
* Automação de implantação: Permite implantar todos os serviços de uma aplicação de uma só vez com um único comando.
* Portabilidade: Os arquivos de configuração do Docker Compose podem ser facilmente compartilhados e reutilizados em diferentes ambientes e projetos.

Para trabalhar com o Docker Compose, você precisa ter o Docker e o Docker Compose instalados em sua máquina. Depois de criar um arquivo docker-compose.yml, você pode usar os seguintes comandos básicos para gerenciar sua aplicação:

* Inicia e executa a aplicação, criando e iniciando todos os serviços definidos no arquivo de configuração.
```terminal
docker-compose up
```

* Para e remove os serviços e recursos (como redes e volumes) definidos no arquivo de configuração.
```terminal
docker-compose down
```
* Lista todos os serviços e seu estado atual (em execução, parado, etc.).
```terminal
docker-compose ps
```
* Exibe os logs de todos os serviços ou de serviços específicos.
```terminal
docker-compose logs
```

## How to run the application using Docker

1. Run `mvn clean package -DskipTests` to build the applications and create the docker image locally.
2. Run `docker-compose up -d` to start the applications.

## How to run the application without Docker

1. Run `mvn clean verify -DskipTests` by going inside each folder to build the applications.
2. After that run `mvn spring-boot:run` by going inside each folder to start the applications.

## Requisições HTTP para endpoints de API

Usaremos a ferramenta Postman
* O Postman é uma popular ferramenta de desenvolvimento usada para testar e desenvolver APIs (Application Programming Interfaces). Ele oferece uma interface gráfica fácil de usar para enviar requisições HTTP para endpoints de API e analisar as respostas.

Temos que incluir o keycloak no `C:\Windows\System32\drivers\etc\hosts`
```C:\Windows\System32\drivers\etc\hosts
127.0.0.1 keycloak
```

Configuração do postman
* GET `http://localhost:8181/api/product`
* Authorization > Type `OAuth 2.0` > Configure New Token
    * Token Name `token`
    * Grant Type `Client Credentials`
    * Access Token URL `http://keycloak:8080/realms/spring-boot-microservices-realm/protocol/openid-connect/token`
    * Client ID `spring-cloud-client`
    * Client Secret `{Gera no Keycloak}`
    * Scope `openid offline_access`
    * Client Authentication `Send as basic auth header`
    * Click em `Get New Access Token`
* Send

## Ferramentas

* Kubernets
* Docker
* JIB
* Grafana
* Prometheus
* Kafka
* Keycloak
* zipkin
* zookeeper
* mongoDB
* Postgres
* Eureka
* WebFluxSecurity
* API Gateway
* Discovery Server
* JUnit5
* TestConteiners

## Inventory Service

Requisições HTTP

* GET `http://localhost:8181/api/product`

* POST `http://localhost:8181/api/order`

  * Payload:
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

