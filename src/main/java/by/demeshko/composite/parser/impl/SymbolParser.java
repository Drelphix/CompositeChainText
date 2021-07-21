package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.parser.TextComponentParser;

public class SymbolParser implements TextComponentParser {
    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        throw new UnsupportedOperationException();
    }
}
