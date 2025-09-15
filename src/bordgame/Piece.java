package bordgame;

public class Piece {
    protected Position position;
    private Board board;
//pra cria uma peça tem que informar o board
    public Piece(Board board) {
        this.board = board;
        position= null;
    }
//somente classes dentro do mesmo pacote e subclasses podem acessar
    protected Board getBoard() {
        return board;
    }
}
