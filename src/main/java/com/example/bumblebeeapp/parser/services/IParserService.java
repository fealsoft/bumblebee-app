package com.example.bumblebeeapp.parser.services;

import com.example.bumblebeeapp.common.WordParseNorm;

import java.util.List;

public interface IParserService {

    List<WordParseNorm> getPosList(String sentence);

}
