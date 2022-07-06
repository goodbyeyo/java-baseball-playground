package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] input = "1,2".split(",");
        assertThat(input).contains("1", "2");
        input = "1".split(",");
        assertThat(input).containsExactly("1");
    }

    @Test
    void subString() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("StringINdexOutOfBoundsException Test")
    void charat() {
        // given
        String input = "abc";
        try {
            input.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        assertThatThrownBy(() -> {
            throw new StringIndexOutOfBoundsException();
        });
    }



}
