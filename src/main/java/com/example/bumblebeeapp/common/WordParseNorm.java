package com.example.bumblebeeapp.common;

public record WordParseNorm(String word, PosTag pos) {
    @Override
    public String toString() {
        return word + "-" + pos;
    }
}
