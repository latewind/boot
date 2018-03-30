package com.latewind.boot.utils;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageGenerator {
	protected static Logger logger = LoggerFactory.getLogger(PackageGenerator.class);
	static String [] subModules ={"controller","service","dao","entity"};
	/**
	 * 根据module生成包结构
	 * @param moduleName
	 */
	public static void makeModuleDir(String moduleName){
		String basePath = System.getProperty("user.dir");
		String modulePath = "\\src\\main\\java\\com\\latewind\\boot\\module";
		File moduleFile = new File(basePath+modulePath+"\\"+moduleName);
		moduleFile.mkdirs();
		String baseModulePath = moduleFile.getPath();
		for(String name : subModules){
			File sub = new File(baseModulePath+"\\"+name);
			sub.mkdir();
			logger.info("{}",sub.getPath());
		}

		
	}

	public static void main(String[] args) {
		PackageGenerator.makeModuleDir("system");
	}
}
