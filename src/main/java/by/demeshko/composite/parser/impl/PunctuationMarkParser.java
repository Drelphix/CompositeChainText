package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.PunctuationMark;
import by.demeshko.composite.parser.TextComponentParser;

public class PunctuationMarkParser implements TextComponentParser {
    private final String PUNCTUATION_MARK_REGEX = "^(\\W)+$";

    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        if(data.matches(PUNCTUATION_MARK_REGEX)){
            textComponent.addTextComponent(new PunctuationMark(data));
        }
    }
}
