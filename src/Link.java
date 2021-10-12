
public class Link {
	private int data;
	private int dData;
	public Link next;
	public Link previous;
	
	
	/**
	 * Class constructor
	 * @param data
	 * @param dData
	 */
	public Link(int data, int dData) {
		this.data = data;
		this.dData = dData;
	}
	
	
	/**
	 * Displaying link values
	 */
	public void displayLink() {
		System.out.println("Key: "+this.data+" Data: "+this.dData);
	}
	
	/**
	 * Return link key
	 * @return
	 */
	public int getKey() {
		return this.data;
	}
	
	
	/**
	 * Get link value
	 * @return
	 */
	public int getValue() {
		return this.dData;
	}
}	
