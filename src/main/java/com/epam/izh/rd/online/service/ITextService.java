package com.epam.izh.rd.online.service;

public interface ITextService {

    String removeString(String base, String remove);

    boolean isQuestionString(String text);

    String concatenate(String... elements);

    String toJumpCase(String text);
}
