package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Lexeme;
import by.demeshko.composite.parser.TextComponentParser;

public class SentenceParser implements TextComponentParser {
    private TextComponentParser nextParser;
    private final String SENTENCE_SPLIT_REGEX = "";

    public SentenceParser(TextComponentParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        this.nextParser = textComponentParser;
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        String[] lexemes = data.split(SENTENCE_SPLIT_REGEX);
        for (String lexeme : lexemes){
            TextComponent lexemeComponent = new Lexeme();
            lexemeComponent.addTextComponent(lexemeComponent);
            nextParser.parse(lexemeComponent, lexeme);
        }
    }
}
