package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후";
	}
	
	public void service(String str) {
		String result = "서비스시작";
		String tmp;
		if(str.equals("낮")) {
			tmp = super.day();
			result = tmp + result;
			System.out.println(result);
		}
		else if(str.equals("밤")) {
			tmp = super.night();
			result =tmp + result;
			System.out.println(result);
		}
		else {
			result = str + result;
			System.out.println(result);
		}
	}
}
