package bordgame;
//RunTimeException pra ser uma exceçao opcional de ser tratada
public class BoardException extends RuntimeException {
    //numero da versao, default é numero 1L
    private static final long serialVersionUID = 1L;
//CONSTRUTOR QUE RECEBE A MENSAGEM, QUE VAI REPASSAR ESSA MENSAGEM PARA UM CONSTRUTOR DA SUPER CLASSE QUE É RUNTIMEXCEPTION
    public BoardException(String message) {
        super(message);
    }
}
