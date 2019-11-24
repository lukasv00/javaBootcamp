package com.kodilla.patterns.builder.checkers;

public final class FigureFactory {
    public final static String PAWN = "PAWN";
    public final static String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType, String color) {
        if (figureType.equals(PAWN)) {
            return new Pawn(color);
        } else if (figureType.equals(QUEEN)) {
            return new Queen(color);
        } else {
            throw new IllegalStateException("PAWN or QUEEN and that's it");
        }
    }
}
