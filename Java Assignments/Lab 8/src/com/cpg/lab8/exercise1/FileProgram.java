package com.cpg.lab8.exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram{
		
	public static void main(String[] args){
		File sf=new File("source.txt");
		File tf=new File("target.txt");
		
			BufferedReader bufferreader = null ;
			FileWriter filewriter = null ;
			try {
				bufferreader = new BufferedReader(new FileReader(sf));
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				filewriter = new FileWriter(tf, true);
			} catch (IOException e) {
				e.printStackTrace();
			}
			CopyDataThread cdt=new CopyDataThread (bufferreader,filewriter);
			cdt.start();
			
		}
	}
