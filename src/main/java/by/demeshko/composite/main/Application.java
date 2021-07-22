package by.demeshko.composite.main;

import by.demeshko.composite.entity.impl.Text;
import by.demeshko.composite.exception.CompositeChainException;
import by.demeshko.composite.parser.TextComponentParser;
import by.demeshko.composite.parser.factory.TextComponentParserFactory;
import by.demeshko.composite.reader.impl.TextReaderImpl;

public class Application {
    public static void main(String[] args) throws CompositeChainException {
        String text = new TextReaderImpl().read("text.txt");
        TextComponentParser textComponentParser = TextComponentParserFactory.create();
        Text textComponent = new Text();
        textComponentParser.parse(textComponent,text);
        System.out.println(textComponent);
    }
}
