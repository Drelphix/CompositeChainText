package by.demeshko.composite.parser.impl;

import by.demeshko.composite.entity.TextComponent;
import by.demeshko.composite.entity.impl.Paragraph;
import by.demeshko.composite.entity.impl.Sentence;
import by.demeshko.composite.parser.TextComponentParser;

public class ParagraphParser implements TextComponentParser {
    private TextComponentParser nextParser;
    private final String PARAGRAPH_SPLIT_REGEX = "^\\s{4}|\\t|\\n";

    public ParagraphParser(TextComponentParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public void setFirstParser(TextComponentParser textComponentParser) {
        this.nextParser = textComponentParser;
    }

    @Override
    public void parse(TextComponent textComponent, String data) {
        String[] paragraphList = data.split(PARAGRAPH_SPLIT_REGEX);
        for (String paragraph : paragraphList){
            if(!paragraph.isEmpty()) {
                TextComponent paragraphComponent = new Paragraph();
                textComponent.addTextComponent(paragraphComponent);
                nextParser.parse(paragraphComponent, paragraph);
            }
        }
    }
}
