package com.example.bumblebeeapp.parser;

import com.example.bumblebeeapp.common.WordParseNorm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ParserServiceTest {

    @Autowired
    IParserService parserService;

    @Test
    void testGetPosList() {
        List<WordParseNorm> result = parserService.getPosList("She lives in London.");

        assertEquals("[She-PRP, lives-VBZ, in-IN, London-NNP, .-POINT]", result.toString());
    }
}
