package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class Symbol implements TextComponent {
    private char symbol;

    public Symbol(char symbol){
        this.symbol = symbol;
    }
    @Override
    public boolean addTextComponent(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void CountSameWords() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
