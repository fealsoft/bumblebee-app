package com.example.bumblebeeapp.parser;

import com.example.bumblebeeapp.common.WordParseNorm;

import java.util.List;

public interface IParserService {

    List<WordParseNorm> getPosList(String sentence);

}
