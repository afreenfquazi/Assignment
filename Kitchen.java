package house;

public class Kitchen {
public static void main(String[] args) {
	String appliances[] = {"TV","Fridge","Microwave","Oven","Washer"};
	String copyApp[] = null;
	for(String app:appliances) {
		System.out.println(app);
	}
	
		
		copyApp= appliances;
		for(String app:copyApp) {
			System.out.println(app);
		}
		System.gc();
		
	}

}
