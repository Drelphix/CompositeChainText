package by.demeshko.composite.reader.impl;

import by.demeshko.composite.exception.CompositeChainException;
import by.demeshko.composite.reader.TextReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class TextReaderImpl implements TextReader {
    @Override
    public String read(String file) throws CompositeChainException {
        try{
            URI fileResource = ClassLoader.getSystemResource(file).toURI();
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileResource));
            return bufferedReader.lines().collect(Collectors.joining());
        } catch (IOException | URISyntaxException e) {
            throw new CompositeChainException(e);
        }
    }
}
