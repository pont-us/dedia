package net.talvi.dedia;

import java.io.File;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;

public class Dedia {

	Charset ascii;
	CharsetEncoder asciiEnc;
	CharsetDecoder asciiDec;
	
	public Dedia() {
		ascii = Charset.forName("US-ASCII");
		asciiEnc = ascii.newEncoder();
		asciiDec = ascii.newDecoder();
		asciiEnc.onUnmappableCharacter(CodingErrorAction.IGNORE);
	}
	
	private String fix(String in) {
		
		String normal = Normalizer.normalize(in, Normalizer.Form.NFKD);
		String out = null;
		try {
			out = asciiDec.decode(asciiEnc.encode(CharBuffer.wrap(normal))).toString();
		} catch (CharacterCodingException e) {
			e.printStackTrace();
		}

        out = out.replace("&","+");
		out = out.replaceAll("['\"#()?:]", "");
        return out;
	}
	
	public static void main(String[] args) {

		Dedia d = new Dedia();
		for (String filename: args) {
			File file = new File(filename);
			String newName = d.fix(filename);
			file.renameTo(new File(newName));
		}
	}
}
