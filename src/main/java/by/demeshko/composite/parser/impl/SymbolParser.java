package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Symbol;
import by.demeshko.composite.parser.TextComponentParser;

public class SymbolParser implements TextComponentParser {
    @Override
    public void setFirstParser(TextComponentParser textComponentParser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        char[] symbols = data.toCharArray();
        for (char symbol : symbols) {
            textComponent.addTextComponent(new Symbol(symbol));
        }
    }
}
