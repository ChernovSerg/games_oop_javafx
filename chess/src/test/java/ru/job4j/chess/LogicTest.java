package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void moveGood() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        boolean actual = logic.move(Cell.C8, Cell.E6);
        assertThat(actual, is(true));
    }

    @Test
    public void moveBad() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new PawnBlack(Cell.D7));
        boolean actual = logic.move(Cell.C8, Cell.E6);
        assertThat(actual, is(false));
    }
}