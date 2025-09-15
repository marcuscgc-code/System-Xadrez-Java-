package chess;

import bordgame.Board;
import bordgame.Piece;

public class ChessPiece extends Piece {
    private Color color;
    public ChessPiece(Board board, Color color) {
        //O board passa a chama pro construtor da super classe(Piece)
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    //Nao queremos que a cor da peça seja alterado, por isso, sem SETCOLOR
}
