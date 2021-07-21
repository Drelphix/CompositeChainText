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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return textComponents != null ? textComponents.equals(word.textComponents) : word.textComponents == null;
    }

    @Override
    public int hashCode() {
        return textComponents != null ? textComponents.hashCode() : 0;
    }

    @Override
    public String toString() {
        return textComponents + "\\s";
    }
}
