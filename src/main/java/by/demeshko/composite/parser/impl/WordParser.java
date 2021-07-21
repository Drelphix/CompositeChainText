package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Symbol;
import by.demeshko.composite.parser.TextComponentParser;

public class WordParser implements TextComponentParser {
    private TextComponentParser nextParser;

    public WordParser(TextComponentParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        this.nextParser = textComponentParser;
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        char[] symbols = data.toCharArray();
        for (char symbol : symbols){
            textComponent.addTextComponent(new Symbol(symbol));
        }
    }
}
