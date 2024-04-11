package ua.skillup.part1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AtbashCypherTests {
    @Test
    public void testEncode() {
        String input = "abc";
        String expected = "zyx";
        Assert.assertEquals(AtbashCypher.encode(input), expected);
    }

    @Test
    public void testDecode() {
        String input = "zyx";
        String expected = "abc";
        assertEquals(AtbashCypher.decode(input), expected);
    }

    @Test
    public void testEncodeDecode() {
        String input = "hello world!";
        String encoded = AtbashCypher.encode(input);
        String decoded = AtbashCypher.decode(encoded);
        assertEquals(decoded, input);
    }

    @Test
    public void testDecodeEncode() {
        String input = "svool dliow!";
        String decoded = AtbashCypher.decode(input);
        String encoded = AtbashCypher.encode(decoded);
        assertEquals(encoded, input);
    }

    @Test
    public void testEncodeDecodeEmptyString() {
        String input = "";
        String decoded = AtbashCypher.decode(input);
        String encoded = AtbashCypher.encode(decoded);
        assertEquals(encoded, input);
        assertEquals(decoded, input);
    }
}
