public class Spiralka {
	// simple program, prints a spiral table like:
	// 1 2 3
	// 8 9 4
	// 7 6 5
	// for different table sizes
	// Copyright by vile.gnus
	// last edit 11 sep 2015
	
	public static void main(String[] args) {
		ConsoleScanner scanner = new ConsoleScanner();
		int arraySize = scanner.getNumberFromConsole();

		PrintableSquareArray newArray = new PrintableSquareArray(arraySize);
		
		for (int i = 1; i <= newArray.totalElements(); i++) {

			if (newArray.cantMoveForwardInArray()) {
				newArray.position.turnRight();
			}
			newArray.setValueForCurrentPosition(i);

			newArray.move();
		}
		newArray.print();
	}

}
