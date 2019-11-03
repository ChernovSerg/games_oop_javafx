package ru.job4j.chess.firuges.black;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    BishopBlack bishopBlack;

    @Before
    public void init() {
        bishopBlack = new BishopBlack(Cell.C8);
    }

    @Test
    public void position() {
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void way1() {
        Cell[] actual = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(actual, is(expected));
    }

    @Test
    public void way2() {
        Cell[] actual2 = bishopBlack.way(Cell.C3, Cell.E1);
        Cell[] expected2 = new Cell[]{Cell.D2, Cell.E1};
        assertThat(actual2, is(expected2));
    }

    @Test
    public void way3() {
        Cell[] actual3 = bishopBlack.way(Cell.C3, Cell.A1);
        Cell[] expected3 = new Cell[]{Cell.B2, Cell.A1};
        assertThat(actual3, is(expected3));
    }
    @Test
    public void way4() {
        Cell[] actual4 = bishopBlack.way(Cell.C3, Cell.A5);
        Cell[] expected4 = new Cell[] {Cell.B4, Cell.A5};
        assertThat(actual4, is(expected4));
    }

    @Test
    public void isDiagonalTrue() {
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.G5), is(true));
    }

    @Test
    public void isDiagonalFalse() {
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.D1), is(false));
    }

    @Test
    public void copy() {
        Figure figure = bishopBlack.copy(Cell.E6);
        assertThat(figure.position(), is(Cell.E6));
    }
}