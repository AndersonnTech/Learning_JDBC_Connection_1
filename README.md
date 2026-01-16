# :link: Conexão com o banco de dados

## Parte 1: Configuração do arquivo de configuração :memo:  
  
O arquivo de configuração é do tipo *'.properties'*, nele poderão estar contidas 
as informações que serão utilizadas para estabelecer a conexão com o banco de dados, 
como por exemplo:  
* :bust_in_silhouette: Nome de Usuario (User Name),
* :key: Senha (Password),
* :link: URL: caminho para acessar o banco de dados
* :closed_lock_with_key: SSL: podendo ser *TRUE ou FALSE*, definindo se a conexão
  usará uma camada de segurança

## Parte 2: Definindo classes para abrir e fechar conexão com o banco de dados :on: :end: 

Foram criadas as classe 'DB' e 'DbException' para que através delas a aplicação possa
estabelecer conexão com o banco de dados sem se preocupar com a lógica utilizada para isso. 
Até o momento dentro da classe 'DB', foram criados três métodos:  

* *getConnection()* :left_right_arrow: Inicia a conexão apenas se ela ainda não foi iniciada,
  possui uma estrutura condicional que testa se a variável de conexão é nula, caso verdadeiro
  a conexão é devidamente aberta com um bloco try/catch, para capturar possíveis excessões *SQLException*,
  caso ocorra algum erro ou problema.
  
* *closeConnection()* :negative_squared_cross_mark: Fecha a conexão apenas se a variável de conexão estiver sendo usada,
   usando um bloco condicional verifica-se a essa variável é diferente de nula, caso verdadeiro,
  é executado um bloco try/catch para executar o comando de encerramento da conexão e capturar possiveis excessões *SQLException*.
  
* *loadProperties()* :arrows_counterclockwise: Este é um método privado da classe DB, ele é usado pelo método *getConnection()*,
  pois é responsável de carregar as informações arquivo de configuração *.properties* para estabelecer conexão no banco de dados,
  possui um bloco try/catch para capturar exceções do tipo *IOException*, caso ocorram erros ao abrir o arquivo *.properties*.



# Tecnologias usadas:

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) **JAVA**
* ![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)**ECLIPSE**
* ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) **MySQL** 
* ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) **GitHub**
* ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) **Git**


