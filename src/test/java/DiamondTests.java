import kata.Diamond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTests {

    @Test
    void printsLetterAtTheWidestPoint() {
        assertEquals("A", Diamond.forLetter("A"));
        assertEquals(" A \nB B\n A ", Diamond.forLetter("B"));
        assertEquals("  A  \n B B \nC   C\n B B \n  A  ", Diamond.forLetter("C"));
        assertEquals("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   ", Diamond.forLetter("D"));
    }
}
