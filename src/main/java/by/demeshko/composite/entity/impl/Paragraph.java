package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements TextComponent {
    private final List<TextComponent> sentences = new ArrayList<>();

    @Override
    public boolean addTextComponent(TextComponent textComponent) {
        return this.sentences.add(textComponent);
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        return this.sentences.remove(textComponent);
    }

    @Override
    public void CountSameWords(){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paragraph paragraph = (Paragraph) o;

        return sentences != null ? sentences.equals(paragraph.sentences) : paragraph.sentences == null;
    }

    @Override
    public int hashCode() {
        return sentences != null ? sentences.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(TextComponent sentence : sentences){
            stringBuilder.append(sentence).append(" ");
        }
        return stringBuilder.toString();
    }
}
