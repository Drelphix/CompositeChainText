package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.PunctuationMark;
import by.demeshko.composite.entity.impl.Word;
import by.demeshko.composite.parser.TextComponentParser;

public class LexemeParser implements TextComponentParser {
    private TextComponentParser firstNextParser;
    private TextComponentParser secondNextParser;
    private final String WORD_SPLIT_REGEX = "";
    private final String PUNCTUATION_SPLIT_REGEX = "";

    public LexemeParser(TextComponentParser firstNextParser, TextComponentParser secondNextParser) {
        this.firstNextParser = firstNextParser;
        this.secondNextParser = secondNextParser;
    }

    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        String[] words = data.split(WORD_SPLIT_REGEX);
        String[] punctuationMarks = data.split(PUNCTUATION_SPLIT_REGEX);

        for (String word : words){
            TextComponent wordComponent = new Word();
            textComponent.addTextComponent(wordComponent);
            this.firstNextParser.parse(wordComponent, word);
        }

        for (String mark : punctuationMarks){
            TextComponent punctuationMark = new PunctuationMark(mark);
            textComponent.addTextComponent(punctuationMark);
        }
    }
}
