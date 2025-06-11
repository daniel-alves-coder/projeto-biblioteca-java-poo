# Sistema de Gerenciamento de Biblioteca


## Descrição do Projeto

Neste sistema, a biblioteca pode gerenciar dois tipos de materiais: `livros` e `revistas`. Vamos utilizar uma classe base chamada Material para representar um material da biblioteca e criar subclasses Livro e Revista que herdam de Material. A biblioteca deve ser capaz de `adicionar`, `pesquisar`, `excluir` e `listar ambos os tipos de materiais`.


## Menu do Sistema



### O sistema deve apresentar um menu com 4 opções:

* Adicionar Novo Livro ou Revista
* Pesquisar Livro ou Revista por Título 
* Excluir Livro ou Revista pelo Título
* Listar Todos os Livros e Revistas
* Sair do Sistema
    

## Detalhes das Operações


>### Classe Material:
>>* Classe base para livros e revistas.
>>* Classe abstrata que contém os atributos comuns a todos os materiais da biblioteca, como titulo e autor. Os métodos toString e os getters/setters são definidos aqui.

> ### Classe Livro: 
>>* Subclasse de Material que representa um livro.
>>* Herda de Material e adiciona um atributo específico para livros, que é genero. O método toString é sobrescrito para incluir o gênero.

> ### Classe Revista:
>>* Subclasse de Material que representa uma revista.
>>* Também herda de Material e adiciona um atributo específico para revistas, que é numero. O método toString é sobrescrito para incluir o número da revista.

> ### Classe Biblioteca: 
>>* Gerencia a coleção de materiais e fornece métodos para adicionar, pesquisar, excluir e listar materiais.
>>* Usa uma ArrayList para gerenciar uma lista de objetos Material, permitindo adicionar, pesquisar, excluir e listar materiais. As operações agora podem lidar com ambos os tipos de materiais (livros e revistas) de forma polimórfica.

> ### Enum Genero: 
>>* Representa os gêneros dos materiais (aplicável a livros).

> ### Classe Main: 
>>* Contém o menu e a lógica principal do sistema.
>>* Atualizada para permitir a adição de livros e revistas. Adiciona materiais à biblioteca e realiza operações de pesquisa, exclusão e listagem.


## Feedback nas Operações:

Em todas as operações, fornecer feedback ao usuário. Por exemplo, ao concluir o cadastro de um novo livro, exibir a mensagem `"Novo livro cadastrado com sucesso!"`.

Ao excluir um livro, confirmar a exclusão com a mensagem "Livro excluído com sucesso!".

Se uma operação não puder ser concluída (por exemplo, ao tentar excluir um livro - inexistente), informar ao usuário com a mensagem `"Operação falhou: livro não encontrado."`.

## Validação de Dados:

Verificar se todos os campos obrigatórios foram preenchidos antes de realizar o cadastro ou agendamento.

Informar o usuário em caso de campos obrigatórios ausentes, por exemplo, `"Por favor, preencha todos os campos obrigatórios."`
