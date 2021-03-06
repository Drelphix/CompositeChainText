package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class PunctuationMark implements TextComponent {
    private String punctuationMark;

    public PunctuationMark(String punctuationMark){
        this.punctuationMark = punctuationMark;
    }
    @Override
    public boolean addTextComponent(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void CountSameWords() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PunctuationMark that = (PunctuationMark) o;

        return punctuationMark != null ? punctuationMark.equals(that.punctuationMark) : that.punctuationMark == null;
    }

    @Override
    public int hashCode() {
        return punctuationMark != null ? punctuationMark.hashCode() : 0;
    }

    @Override
    public String toString() {
        return punctuationMark;
    }
}
