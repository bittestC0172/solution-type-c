package problem03;

public class MyStack {
	
	private String[] buffer;
	private int bufferSize = 0;
	private int index = 0;

	public MyStack( int size ) {
		buffer = new String[size];
		bufferSize = size;
	}
	
	public void push(String item) {
		if(bufferSize == index) {
			bufferSize++;
			String[] tmp = new String[bufferSize];
			for(int i = 0; i < bufferSize - 1; i++) {
				tmp[i] = buffer[i];
			}
			buffer = tmp;
			buffer[index] = item;
			index++;
		}
		else {		
			buffer[index] = item;
			index++;
		}
	}

	public String pop() {
		if(index == 0)
			return null;
		else {
			String str = buffer[index - 1];
			index--;
			return str;
		}
	}

	public boolean isEmpty() {
		if (index == 0)
			return true;
		else
			return false;
	}
	
	public int size() {
		return bufferSize;
	}
}