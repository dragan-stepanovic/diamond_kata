import kata.Diamond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTests {

    @Test
    void printsLetterAtTheWidestPoint() {
        assertEquals("A", Diamond.print(String.valueOf('A')));
        assertEquals(" A \nB B\n A ", Diamond.print(String.valueOf('B')));
        assertEquals("  A  \n B B \nC   C\n B B \n  A  ", Diamond.print(String.valueOf('C')));
        assertEquals("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   ", Diamond.print(String.valueOf('D')));
    }
}
