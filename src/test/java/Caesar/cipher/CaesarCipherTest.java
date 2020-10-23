package Caesar.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
	private CaesarCipher caesarCipher = new CaesarCipher();

	@Test
	void testCipheredmessagewithoffset12() {
		assertEquals("sk `S_W [e g`geZS",caesarCipher.cipher("My name is Anusha", 12));
	}
	@Test
	void testEmptyString()
	{
		assertEquals("",caesarCipher.cipher("", 12));
	}
//	@Test
//	void testCipheredmessagewithoffsetof11()
//	{
//		assertEquals("Zai SdW kag Va[`Y faVSk",caesarCipher.cipher("how are you doing today", 11));
//	}
}
