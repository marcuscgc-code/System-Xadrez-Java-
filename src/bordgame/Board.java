package bordgame;

public class Board {
    private  int rows;
    private  int columns;
    //Matriz de Classe Pecas
    //protecao Classe[][] nomeVariavel
    private Piece[][] pieces;

    //A Piece (peça ) vai ser criada a partir da quantidade de linhas e colunas
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    //metodo pra mostrar qual Piece se encontra na matriz pieces
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
}
