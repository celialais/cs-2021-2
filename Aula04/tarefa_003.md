<p style="text-align: center;"><font size="5"><b>Git Exercícios</b></font></p1></p>
<DIV align="justify">

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?  
git --version  

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help   
  São apresentados comandos comuns para diversas ações.
  b. git help checkout  
  Abriu uma página html com detalhes sobre o comando checkout.
  c. git help merge  
  Abriu uma página html com detalhes sobre o comando merge.  
  d. git init  
  Foi criado um repositório vazio .git na pasta que estou.  
  e. git add --all  
  Arquivo é considerado para o próximo commit.  
  f. git add -u  
  Adiciona arquivos monitorados pelo Git.  
  g. git config -l  
  Lista as configurações realizadas.  
  h. git mv a.txt b.txt  
  No exemplo o comando renomeia arquivos.  
  i. git reset --hard  
  Reseta o último commit.  
  j. git log -27  
  Exibe os últimos 27 commits.    
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?  
git add -> git rm -> git mv -> git commit  
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?  
git show  
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?  
git status  
6. Qual o comando para efetuar um _commit_?  
git commit -m "título do commit"  
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?  
git checkout --nomearquivo  
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.  
Deve ser criado um arquivo .gitignore.  
9. O que acontece se o seu repositório local for acidentalmente removido?  
O repositório local é perdido.  
10. Como clonar um repositório remoto?  
git clone  
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?  
git log --pretty=oneline  
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?  
.git\config  
13. Qual o comando para criar um repositório local?  
Crie a nova pasta e execute git init.  
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?  
Nome é o mesmo do repositório onde está sendo executado.  
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)  
git add --all  
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?  
Git tem mecanismo de checksum, portanto mudanças sempre são reconhecidas por ele. O mecanismo que ele utiliza para validar as mudanças é o SHA1, utilizado para calcular o conteúdo ou estrutura de um arquivo.  
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?  
-abbrev-commit.  
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?  
Não, os arquivos são adicionados pelo comando.  
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**  
Volta o último commit e mantém os últimos arquivos. Exibe o último commit.  
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?  
git clean -f  
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?  
arquivo .gitignore  
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?  
Coloque *.class  
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?  
Nome e email são apresentados.  
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?  
São exibidas URLs.  
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?  
Comando git tag.  
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?  
Comando git tag -a.  
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?  
É criada uma tag com a mensagem minha versão ouro  
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?  
Vai exibir dados da tag junto do commit.  
30. O que o comando **git push origin 3.4-gold** teria como efeito?  
Mostra informações do usuário que criou a tag, a data do commit com a tag e a mensagem da tag.  
31. Após executar um commit, qual o efeito de **git commit --amend**?  
Usado para editar a mensagem do commit.  
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?  
O comando git reset HEAD retira o arquivo em questão da área de alterações.  
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?  
Descarta as mudanças ocorridas no arquivo.  
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?  
O primeiro retira o arquivo da área de alterações. O último descarta as mudanças realizadas no arquivo.  
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.