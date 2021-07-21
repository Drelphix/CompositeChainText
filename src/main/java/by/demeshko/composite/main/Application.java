package by.demeshko.composite.main;

import by.demeshko.composite.entity.impl.Text;
import by.demeshko.composite.parser.TextComponentParser;
import by.demeshko.composite.parser.factory.TextComponentParserFactory;

public class Application {
    public static void main(String[] args) {
        String text = "    What a nice day! yeah." +
                "    Oh, yeees!";
        TextComponentParser textComponentParser = TextComponentParserFactory.create();
        Text textComponent = new Text();
        textComponentParser.parse(textComponent,text);
        System.out.println(textComponent);
    }
}
