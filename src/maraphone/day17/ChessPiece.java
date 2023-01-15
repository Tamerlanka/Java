package maraphone.day17;

public enum ChessPiece {
    KING_WHITE("U+2654", 100),KING_BLACK("U+265A", 100),
    QUEEN_WHITE("U+2655", 9),QUEEN_BLACK("U+265B", 9),
    ROOK_WHITE("U+2656", 5),ROOK_BLACK("U+265C", 5),
    BISHOP_WHITE("U+2657", 3.5),BISHOP_BLACK("U+265D", 3.5),
    KNIGHT_WHITE("U+2658", 3),KNIGHT_BLACK("U+265E", 3),
    PAWN_WHITE("U+2659", 1),PAWN_BLACK("U+265F", 1);

    private double value;

    private String representation;

    ChessPiece(String representation, double value) {
        this.representation = representation;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getRepresentation() {
        return representation;
    }
}
