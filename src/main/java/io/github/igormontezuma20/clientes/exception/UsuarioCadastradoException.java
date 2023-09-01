package io.github.igormontezuma20.clientes.exception;

public class UsuarioCadastradoException extends RuntimeException{

    public UsuarioCadastradoException(String login){
        super("Este usuário já existe!" + login);
    }
}
