package by.demeshko.composite.reader;

import by.demeshko.composite.exception.CompositeChainException;

public interface TextReader {

    String read(String file) throws CompositeChainException;
}
