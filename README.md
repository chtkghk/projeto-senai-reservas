
# Read Me: RAMBO!

Obrigado por escolher RAMBO como seu aplicativo de Reserva de Ambientes, leia com atenção todos os passos necessários para que a sua aplicação funcione corretamente.

## Pré-requisitos

- Possuir Maven v3.0 ou superior instalado em sua máquina.
 (http://maven.apache.org/download.cgi);

- Possuir algum software de controle de versões que se comunique com o Git (Git Bash, GitKraken, Git GUI, SmartGit etc.). Recomenda-se que você instale o Git diretamente no seu CMD (no caso do Windows) para que os passos sejam corretamente seguidos.
 (https://git-scm.com/download)

## Instalação e configuração

- Clone este repositório em uma pasta com o comando:
	``` 
	git clone "https://github.com/chtkghk/projeto-senai-reservas" 
	```
------------
- Vá até o diretório *Projeto SENAI/src/main/resources/* e abra o arquivo *application.properties*
	- As três primeiras linhas do arquivo são directionadas à conexão com o seu banco de dados, configure a *url*, *usuário* e *senha* de acordo com seus dados.
	
	```
	## Configurações default (MySQL — rambo):
	spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/rambo?serverTimezone=UTC
	spring.datasource.username=root
	spring.datasource.password=master123
	```
	- Caso você altere o dialeto ou o banco (não utilize MySQL), altere também, as informações contidas após o comentário "*Dialeto/DB JPA*", que são representadas abaixo.
	
	```
	## Dialeto/DB JPA (default)
	spring.jpa.database=mysql
	spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
	```
	Caso você não utilize mysql, procure pelas informações que devem ser inseridas nestes campos de acordo com o banco de sua preferência para que o JPA funcione corretamente.
------------
- Inicialize o Spring Boot através do Maven com o seguinte comando:
	```
	mvn spring-boot:run
	```

Com isso, o servidor iniciará no endereço de IP especificado no arquivo *application.properties* , conforme mensionado nos passos acima. 
Se por exemplo você configurou para que o servidor atendesse ao endereço de IP *localhost* e porta *9090*, para conectar-se ao seu aplicativo basta utilizar seu browser de preferência e entrar na url *localhost:9090*.

# História do projeto

O RAMBO, trabalho de conclusão de curso criado pela SQUAD reconhecida na época como *Variable*, se trata de um aplicativo (site) de **R**eserva de **Amb**ientes **O**nline (**RAmbO**).

### Escopo de funções da Variable

Apesar da equipe ter, no fim, se deteriorado devido as regras impostas no curso (redução de integrantes de equipe para 3), a equipe original foi a seguinte:

| Nome do integrante  | Função na equipe  |
| ------------ | ------------ |
| [Felipe Luan Cipriani][LinkedIn-Felipe] | Full-stack e Product Manager |
| [Maria Gabriele Soares Leite][LinkedIn-Maria]  | Front-end e Designer (UX)  |
| [Chrystian Ferreira da Silva][LinkedIn-Chrystian]  | DBA e Back-end |
| [Yuri Rodrigues de Souza][LinkedIn-Yuri]  | Full-stack  |
| [Matheus dos Santos][LinkedIn-Matheus]  | Front-end  |

Quem escreve este arquivo e recria o sistema inteiro do zero com ciência dos integrantes sou eu, Felipe Luan Cipriani.

**Todos foram alunos do SENAI e se formaram com o grau de técnico em análise e 		desenvolvimento de sistemas. 
Turma Codificando o Futuro 2018/2.
**

*Para contato, basta clicar no nome do integrante e você será redirecionado para seu LinkedIn.*
*Você também pode me contatar através do e-mail: felipe.cipriani@softplan.com.br*

[LinkedIn-Felipe]: https://www.linkedin.com/in/felipe-luan-cipriani/
[LinkedIn-Maria]: https://https://www.linkedin.com/in/maria-leite-494474181/
[LinkedIn-Chrystian]: https://www.linkedin.com/in/chrystian-ferreira-da-silva-4a86a01a0/
[LinkedIn-Yuri]: https://www.linkedin.com/in/yuri-de-souza-7a6b90168/
[LinkedIn-Matheus]: https://www.linkedin.com/in/matheus-dos-santos-3a872218b/