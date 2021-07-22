package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Lexeme;
import by.demeshko.composite.entity.impl.Sentence;
import by.demeshko.composite.parser.TextComponentParser;

public class SentenceParser implements TextComponentParser {
    private TextComponentParser nextParser;
    private final String SENTENCE_SPLIT_REGEX = "(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?)\\s";

    public SentenceParser(TextComponentParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public void setNextParser(TextComponentParser textComponentParser) {
        this.nextParser = textComponentParser;
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        String[] sentences = data.split(SENTENCE_SPLIT_REGEX);
        for (String sentence : sentences){
            TextComponent sentenceComponent = new Sentence();
            textComponent.addTextComponent(sentenceComponent);
            nextParser.parse(sentenceComponent, sentence);
        }
    }
}
