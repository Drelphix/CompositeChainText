package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class Word implements TextComponent {

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
    public void CountSameWords() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
