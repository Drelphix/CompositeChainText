package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Text implements TextComponent {
    private List<TextComponent> paragraphs = new ArrayList<>();

    @Override
    public boolean addTextComponent(TextComponent textComponent) {
       return this.paragraphs.add(textComponent);
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        return this.paragraphs.remove(textComponent);
    }

    @Override
    public void CountSameWords() throws OperationNotSupportedException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        return paragraphs != null ? paragraphs.equals(text.paragraphs) : text.paragraphs == null;
    }

    @Override
    public int hashCode() {
        return paragraphs != null ? paragraphs.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CurrentText: \\n" + paragraphs;
    }
}
