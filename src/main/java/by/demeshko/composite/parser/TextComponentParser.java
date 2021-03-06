package by.demeshko.composite.parser;

import by.demeshko.composite.entity.TextComponent;

public interface TextComponentParser {

    public void setNextParser(TextComponentParser textComponentParser);

    public void parse(TextComponent textComponent, String data);
}
