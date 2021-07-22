package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Lexeme;
import by.demeshko.composite.entity.impl.Word;
import by.demeshko.composite.parser.TextComponentParser;

public class LexemeParser implements TextComponentParser {
    private TextComponentParser firstParser;
    private TextComponentParser secondParser;
    private final String WORD_REGEX = "^\\w+$";
    private final String PUNCTUATION_MARK_REGEX = "\\W";
    private final String LEXEME_SPLIT_REGEX = "\\s";

    public LexemeParser(TextComponentParser firstParser, TextComponentParser secondParser) {
        this.firstParser = firstParser;
        this.secondParser = secondParser;
    }

    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void parse(TextComponent textComponent, String data) { //TODO 22.07.2021 20:08 :
        String[] lexemes = data.split(LEXEME_SPLIT_REGEX);
        for (String lexeme : lexemes){
                TextComponent lexemeComponent = new Lexeme();
                textComponent.addTextComponent(lexemeComponent);

        }
    }

}

