package com.example.bumblebeeapp.parser.services;

import com.example.bumblebeeapp.common.PosTag;
import com.example.bumblebeeapp.common.WordParseNorm;
import com.example.bumblebeeapp.parser.services.IParserService;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class ParserService implements IParserService {

    private StanfordCoreNLP pipeline;

    @PostConstruct
    void init() {
        Properties props = new Properties();

        props.setProperty("annotators", "tokenize,ssplit,pos"); // lemma,ner,parse,depparse
        props.setProperty("coref.algorithm", "neural");

        pipeline = new StanfordCoreNLP(props);
    }

    @Override
    public List<WordParseNorm> getPosList(String sentence) {
        CoreDocument document = new CoreDocument(sentence);

        pipeline.annotate(document);


        List<CoreLabel> tokens = document.tokens();

        List<WordParseNorm> result = new ArrayList<>(tokens.size());


        tokens.forEach(coreLabel -> result.add(new WordParseNorm(
                coreLabel.word(),
                PosTag.fromString(coreLabel.tag())
        )));

        return result;
    }
}
