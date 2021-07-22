package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;



public class Lexeme implements TextComponent {
    private static final Logger LOGGER = LogManager.getLogger();

    private List<TextComponent> words = new ArrayList<>();

    @Override
    public boolean addTextComponent(TextComponent textComponent) {
        return this.words.add(textComponent);
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        return this.words.remove(textComponent);
    }

    @Override
    public void CountSameWords() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lexeme lexeme = (Lexeme) o;

        return words != null ? words.equals(lexeme.words) : lexeme.words == null;
    }

    @Override
    public int hashCode() {
        return words != null ? words.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder lexeme = new StringBuilder();
        for (TextComponent textComponent : words){
            lexeme.append(textComponent);
        }
        return lexeme.toString();
    }
}
