package corejava_basic.initial;

public class RAM {
	
	
	String companyname;
	
    int storage;
    
	public RAM(String companyname, int storage) {
		this.companyname=companyname;
	   
    	this. storage= storage;
	}
 @Override
    public String toString() {
    	return"Display [companyname="+companyname+", storage = " +storage+"]";

 }
 

}
