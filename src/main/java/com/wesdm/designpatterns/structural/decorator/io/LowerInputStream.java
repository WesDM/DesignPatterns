package com.wesdm.designpatterns.structural.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * New input stream decorator to allow for all lower case
 * @author Wesley
 *
 */
public class LowerInputStream extends FilterInputStream {

	public LowerInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException{
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset+result; i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
