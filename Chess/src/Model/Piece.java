package Model;

public class Piece {
    private static final int none = 0;
    private static final int king = 1;
    private static final int pawn = 2;
    private static final int knight = 3;
    private static final int bishop = 5;
    private static final int rook = 6;
    private static final int queen = 7;

    private final int white = 8;
    private final int black = 16;

    static final int typeMask = 0b00111;
    static final int blackMask = 0b10000;
    static final int whiteMask = 0b01000;
    static final int colorMask = whiteMask | blackMask;

    public static boolean IsColor (int piece, int color) {
        return (piece & colorMask) == color;
    }

    public static int Color (int piece) {
        return piece & colorMask;
    }

    public static int PieceType (int piece) {
        return piece & typeMask;
    }

    public static boolean IsRookOrQueen (int piece) {
        return (piece & 0b110) == 0b110;
    }

    public static boolean IsBishopOrQueen (int piece) {
        return (piece & 0b101) == 0b101;
    }

    public static boolean IsSlidingPiece (int piece) {
        return (piece & 0b100) != 0;
    }
}
