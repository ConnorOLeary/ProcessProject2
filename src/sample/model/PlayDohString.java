package sample.model;

public class PlayDohString {
	//Declaration section
		//Data member section
		private int length;
		//NEED TO BE PRIVATE
			public PlayDohString() {
				this.length = 5;
			}
			public PlayDohString(int size) {
				this.length = size;
			}
			public String toString()
			{
				String description = "I am a PlayDohString I am this long: " + length;
				return description;
						
			}
}
