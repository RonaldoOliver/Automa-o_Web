#language:pt

  @login
  Funcionalidade: Validar Login
  Como usuário devo acessar o sistema
  eu quero poder validar o login da aplicacao
  para que eu possa acessar o sitema
  

    Esquema do Cenário: Validar login com sucesso.
    Dado que tenha acessado a tela de login
    Quando preencher realizar login com os dados <email> e <senha>
    Entao deve ser validado login com sucesso
   
    Exemplos:
    |email                |senha   |
    |"ronald@hotmail.com" |"102030"|
