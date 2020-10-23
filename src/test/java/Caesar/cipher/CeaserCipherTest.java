package Caesar.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeaserCipherTest {
	private CaesarCipher caesarCipher=new CaesarCipher();

	@Test
	void testCipheredMessageWithTheOffsetOf12() {
		assertEquals("Zai SdW kag", caesarCipher.cipher("how are you",12));
	}
	
	@Test
	void testemptystring() {
		assertEquals("",caesarCipher.cipher("",12));
	}
	@Test
	void testCaesarCipherwithoffset11() {
		assertEquals("Y`h RcV j`f", caesarCipher.cipher("how are you",11));
	}
}
