package sample.model;

public class PlayDohCircle {


	//Declaration section
	//Data member section
	private int size;
	//NEED TO BE PRIVATE
		public PlayDohCircle() {
			this.size = 5;
		}
		public PlayDohCircle(int size) {
			this.size = size;
		}
		public void setSize(int updateSize) {
			this.size = updateSize;
		}
		
		public String toString()
		{
			String description = "I am a PlayDohCircle and my size is " + size;
			return description;
					
		}
}
