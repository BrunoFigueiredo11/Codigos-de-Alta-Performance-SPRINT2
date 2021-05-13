# Codigos de Alta Performance
 Os clientes são cadastrados no seu sistema fazendo com que as informações (nome e id) de cada cliente sejam armazenadas em um vetor de clientes.
 Quando um cliente quiser enviar uma mensagem, ele deve usar a sua identificação (id) para que seja permitido o envio. A mensagem com o id e nome do cliente deve então ser inserida na fila de mensagens a serem respondidas.
 
 Caso o id do cliente não exista, este deve se cadastrar no sistema (inserindo no vetor de clientes).
 
 A simulação do atendimento das mensagens consiste em apenas retirar da fila a mensagem e escrever na tela de saída o conteúdo da mensagem empilhada e as informações do usuário que a enviou. 
 
 Para essa 2ª entrega da challenge, a tarefa dessa disciplina é:
 
 • Implementar a classe Cliente: nome e id devem ser os atributos; 
 
 • Implemente a classe Mensagem: lembrando que junto com o texto da mensagem em si devem ser incluídos id e nome do cliente que enviou a mensagem; 
 
 • Implementar a classe FilaMensagens: que armazena mensagens para serem lidas e respondidas.
