package archeologyp1.shared;

import java.util.ArrayList;

public class Coordinate {
	private ViewingOption option;
	private boolean excavated;
	private char currentViewableSymbol = 'g';
	private ArrayList<Pot> potFind = new ArrayList<Pot>();
	private ArrayList<MetalObject> metalFind = new ArrayList<MetalObject>();
	private ArrayList<Charcoal> charcoalFind = new ArrayList<Charcoal>();
	
	public void setcurrentViewableSymbol(char symbol){
		currentViewableSymbol = symbol;
	}
	
	public void setExcavated(boolean value){
		excavated = value;
	}
	
	public void setViewingOption(ViewingOption option){
		this.option = option;
	}
}
