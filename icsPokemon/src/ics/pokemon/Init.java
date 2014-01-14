/**
 * 
 */
package ics.pokemon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author KobeThuy
 *
 */
public class Init {
	
	private String fileName, buf, bufOne;
	private FileReader fd;
	private BufferedReader read;
	private String[] arg;
	
	public Init(String fileName) {
		setFileName(fileName);
	}
	
	public boolean openFile (String fileName) {
		
		try {
			fd = new FileReader(new File(getClass().getResource("pokemonListResorted.txt").getFile()));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean readFile(FileReader fd) {
		read = new BufferedReader(fd);
		
		try {
			while ((buf = read.readLine()) != null) {
				setArg(buf.split("\\|"));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public String getBuf() {
		return this.buf;
	}

	public FileReader getFd() {
		return this.fd;
	}

	public BufferedReader getRead() {
		return this.read;
	}

	public String[] getArg() {
		return this.arg;
	}

	public String getBufOne() {
		return bufOne;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setBuf(String buf) {
		this.buf = buf;
	}

	public void setFd(FileReader fd) {
		this.fd = fd;
	}

	public void setRead(BufferedReader read) {
		this.read = read;
	}

	public void setArg(String[] arg) {
		this.arg = arg;
	}

	public void setBufOne(String bufOne) {
		this.bufOne = bufOne;
	}

}
