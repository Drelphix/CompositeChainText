package by.demeshko.composite.entity.impl;

import by.demeshko.composite.entity.TextComponent;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class Text implements TextComponent {
    private List<TextComponent> textComponent;

    @Override
    public boolean addTextComponent(TextComponent textComponent) {
       return this.textComponent.add(textComponent);
    }

    @Override
    public boolean removeTextComponent(TextComponent textComponent) {
        return this.textComponent.remove(textComponent);
    }

    @Override
    public void CountSameWords() throws OperationNotSupportedException {
        throw new UnsupportedOperationException();
    }
}
