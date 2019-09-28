package com.talelife.edu.word.web.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtils {
	private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);
	private FileUtils(){}

	public static void downloadFile(String saveFolder, String url) {
		try {
		    ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(url).openStream());
		    FileOutputStream fileOutputStream = new FileOutputStream(new File(saveFolder+File.separator+url.substring(url.lastIndexOf('/')+1)));
		    fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
		    fileOutputStream.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
	
}
