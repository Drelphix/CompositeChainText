package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;



public class Lexeme implements TextComponent {
    private static final Logger LOGGER = LogManager.getLogger();

    private List<TextComponent> textComponents = new ArrayList<>();
    @Override
    public boolean addTextComponent(TextComponent textComponent) {
        return this.textComponents.add(textComponent);
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        return this.textComponents.remove(textComponent);
    }

    @Override
    public void CountSameWords()  {
        throw new UnsupportedOperationException();
    }
}
