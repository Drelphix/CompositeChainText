package by.demeshko.composite.parser.factory;

import by.demeshko.composite.parser.TextComponentParser;
import by.demeshko.composite.parser.impl.*;

public class TextComponentParserFactory {

    private TextComponentParserFactory(){}

    public static TextComponentParser create(){
        SymbolParser symbolParser = new SymbolParser();
        WordParser wordParser = new WordParser(symbolParser);
        PunctuationMarkParser punctuationMarkParser = new PunctuationMarkParser();
        LexemeParser lexemeParser = new LexemeParser(wordParser, punctuationMarkParser);
        SentenceParser sentenceParser = new SentenceParser(lexemeParser);
        ParagraphParser paragraphParser = new ParagraphParser(sentenceParser);
        return paragraphParser;
    }
}
