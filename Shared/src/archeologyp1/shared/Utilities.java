package archeologyp1.shared;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utilities {
	public Coordinate[][] load(String path){
		File myFile = new File(path);
		Scanner scan;
		try {`
			scan = new Scanner(myFile);
			String line = scan.nextLine();
			String array[] = line.split(",");
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[1]);
			Coordinate[][] map = new Coordinate[x][y];
			while(true){
				line = scan.nextLine();
				array = line.split(",");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void save(File fileName, Coordinate map[][]){
		
	}
}