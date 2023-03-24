package de.application.translators;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lower")
public class ToLowerTranslator implements Translator{
    @Override
    public String translate(String textToTranslate) {
        return textToTranslate.toLowerCase();
    }
}
