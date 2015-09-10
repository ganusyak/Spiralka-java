public class PositionInArray {
	int x;
	int y;
	int direction;
	int arraySize;

	
	PositionInArray ()
	{
		this.x = 0;
		this.y = 0;
		this.direction = 0;

	}
	
	int nextDirectionAfterRightTurnForDirection(int direction)
	{
		return ((direction + 1) % 4);
	}
	
	int[] incrementsForDirection(int direction) {
		int result[][] = {
							{1,0},  // right
							{0,1},  // down
							{-1,0}, // left 
							{0,-1}  // up
		};
		
		return result[direction];
	}
	
	boolean isInBounds() // of array
	{
		boolean result = true;
		
		if ((this.x < 0 ) || (this.x >= arraySize) || (this.y < 0) || ((this.y >= arraySize))) {
			result = false;
		}
		return result;
	}
	
	PositionInArray nextPosition()
	{
		PositionInArray nextPosition = new PositionInArray();
		nextPosition.arraySize = this.arraySize;
		nextPosition.x = this.x + incrementsForDirection(this.direction)[0];
		nextPosition.y = this.y + incrementsForDirection(this.direction)[1];
		
		return nextPosition;
	}	
	
	void turnRight() {
		this.direction = nextDirectionAfterRightTurnForDirection(this.direction);
	}
	
	void move() {
		this.x += incrementsForDirection(this.direction)[0];
		this.y += incrementsForDirection(this.direction)[1];
		
	}
}