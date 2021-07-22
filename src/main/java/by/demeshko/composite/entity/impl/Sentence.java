package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements TextComponent {

    private final List<TextComponent> lexemes = new ArrayList<>();

    @Override
    public boolean addTextComponent(TextComponent textComponent) {
        return lexemes.add(textComponent);
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        return lexemes.remove(textComponent);
    }

    @Override
    public void CountSameWords() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        return lexemes != null ? lexemes.equals(sentence.lexemes) : sentence.lexemes == null;
    }

    @Override
    public int hashCode() {
        return lexemes != null ? lexemes.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(TextComponent textComponent : lexemes){
            stringBuilder.append(textComponent).append(" ");
        }
        return stringBuilder.toString();
    }
}
