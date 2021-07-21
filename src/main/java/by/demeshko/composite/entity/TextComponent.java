package by.demeshko.composite.entity;


import javax.naming.OperationNotSupportedException;

public interface TextComponent {

    boolean addTextComponent(TextComponent textComponent);

    boolean removeTextComponent(TextComponent textComponent);

    void CountSameWords() throws OperationNotSupportedException;
}
