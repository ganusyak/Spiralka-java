public class PrintableSquareArray {
	int arraySize;
	int[][] array;
	PositionInArray position;
	
	PrintableSquareArray (int size) {
		arraySize = size;
		this.position = new PositionInArray();
		this.position.arraySize = size;
		this.array = new int[size][size];
	}
	
	void print()
	{
		// simple ugly table print in console
		for (int j = 0; j < this.arraySize; j++) {
			for (int i = 0; i < this.arraySize; i++) {
				// please pretend you did not see  this )))
				if (array[i][j] > 9) {
					System.out.print(" " + array[i][j]);
				} else {
					System.out.print("  " + array[i][j]);
				}
			}
			System.out.println("");
		}
	}
	
	void setValueForPosition(int value, PositionInArray position)
	{
		if (position.isInBounds()) {
			this.array[position.x][position.y] = value;
		} 
	}
	
	void setValueForCurrentPosition(int value) {
		setValueForPosition(value, this.position);
	}
	
	void move () {
		this.position.move();
	}
	
	boolean haveZeroAtPosition(PositionInArray position) {
		boolean result = false;
		
		if (this.array[position.x][position.y] == 0) { 
			result = true;
		}
		
		return result;
	}
	
	int totalElements() {
		return this.arraySize*this.arraySize;
	}
	
	PositionInArray nextStepPosition ()
	{
		return this.position.nextPosition();
	}
	
	boolean cantMoveForwardInArray()
	{
		// reached a table border or non zero element
		boolean result = true;
		
		if (this.position.nextPosition().isInBounds() && (this.haveZeroAtPosition(this.nextStepPosition()))) {
			result = false;
		}
		return result;
	}
}