package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Lexeme;
import by.demeshko.composite.parser.TextComponentParser;

public class LexemeParser implements TextComponentParser {
    private TextComponentParser firstParser;
    private TextComponentParser secondParser;
    private final String WORD_REGEX = "\\w+";
    private final String LEXEME_SPLIT_REGEX = "\\s";

    public LexemeParser(TextComponentParser firstParser, TextComponentParser secondParser) {
        this.firstParser = firstParser;
        this.secondParser = secondParser;
    }

    @Override
    public void setFirstParser(TextComponentParser textComponentParser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        String[] lexemes = data.split(LEXEME_SPLIT_REGEX);
        for (String lexeme : lexemes){
                TextComponent lexemeComponent = new Lexeme();
                textComponent.addTextComponent(lexemeComponent);
                String punctuationMark = "";
                if (!lexeme.matches(WORD_REGEX)) {//TODO regex like this: (five)
                    String[] punctuationMarks = lexeme.split(WORD_REGEX);
                    secondParser.parse(lexemeComponent, punctuationMark);
                }
                String word = lexeme.substring(punctuationMark.length());
                if(!word.isEmpty()) {
                    firstParser.parse(lexemeComponent, word);
                }
        }
    }
}
