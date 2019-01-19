import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _834_RemoveDuplicateLetters_Test {
    static _834_RemoveDuplicateLetters tstObj;

    @BeforeAll
    static void initAll(){
        tstObj = new _834_RemoveDuplicateLetters();
    }

    @Test
    void shouldBeAForA() {
        assertEquals("a", tstObj.removeDuplicateLetters("a"));
    }

    @Test
    void shouldBeAForAA(){
        assertEquals("a", tstObj.removeDuplicateLetters("aa"));
    }

    @Test
    void shouldBeAbForAb(){
        assertEquals("ab", tstObj.removeDuplicateLetters("ab"));
    }

    @Test
    void shouldBeAbForAba(){
        assertEquals("ab", tstObj.removeDuplicateLetters("aba"));
    }

    @Test
    void shouldBeAbcForAbac(){
        assertEquals("abc", tstObj.removeDuplicateLetters("abac"));
    }

    @Test
    void shouldBeBacForBbac(){
        assertEquals("bac", tstObj.removeDuplicateLetters("bbac"));
    }

    @Test
    void shouldBeAbcForBabc(){
        assertEquals("abc", tstObj.removeDuplicateLetters("babc"));
    }

    @Test
    void shouldBeBcaForBcab(){
        assertEquals("bca", tstObj.removeDuplicateLetters("bcab"));
    }

    @Test
    void shouldBeAbcForBcabc(){
        assertEquals("abc", tstObj.removeDuplicateLetters("bcabc"));
    }

    @Test
    void shouldBeAcdbForCbacdcbc(){
        assertEquals("acdb", tstObj.removeDuplicateLetters("cbacdcbc"));
    }
}