package bordgame;

public class Board {
    private int rows;
    private int columns;
    //Matriz de Classe Pecas
    //protecao Classe[][] nomeVariavel
    private Piece[][] pieces;

    //A Piece (peça ) vai ser criada a partir da quantidade de linhas e colunas
    public Board(int rows, int columns) {
        if(rows<1 || columns<1){
            throw new BoardException("Erro: Criando tabuleiro: É necessário pelo menos 1 linha e 1 coluna ");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

  //Nao pode ter SET de linha e colunas

    public int getColumns() {
        return columns;
    }


    //metodo pra mostrar qual Piece se encontra na matriz pieces
    public Piece piece(int row, int column) {
        if(!positionExists(row,column)){
            throw new BoardException("Positiion not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    private boolean positionExists(int row, int column) {
        //se a posicao existe se tiver dentro da dimensao do tabuleiro(board)

        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    //testar se tem uma peça nessa posicao
    public boolean thereIsAPiece(Position position) {
         return piece(position) != null;
    }

}
