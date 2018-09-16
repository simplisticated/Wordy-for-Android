package com.visuality.wordy;

import com.visuality.wordy.tools.TransliterationManager;
import com.visuality.wordy.types.Language;

import org.junit.Assert;
import org.junit.Test;

public class TransliterationManagerTest {

    @Test
    public void transliterationManager_fromEnglishToRussian_isCorrect() {
        String sourceText = "This is a test";
        String assertion = "Тхис ис э тэст";
        String result = new TransliterationManager(Language.ENGLISH, Language.RUSSIAN)
                .getText(sourceText);
        Assert.assertTrue(
                result.equals(assertion)
        );
    }
}