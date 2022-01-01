package bumblebeeapp.parser.services;

import bumblebeeapp.common.WordParseNorm;

import java.util.List;

public interface IParserService {

    List<WordParseNorm> getPosList(String sentence);

}
