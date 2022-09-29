package corejava_basic.initial;

public class Display {
	String companyname;
	String typeofdisplay;
    double size;
    
    public Display(String companyname,String typeofdisplay,double size)
    {
    	this.companyname=companyname;
    	this.typeofdisplay=typeofdisplay;
    	this.size=size;
    }
 @Override
    public String toString() {
   return"Display [companyname="+companyname+", typeofdisplay = "+  typeofdisplay +", size = " + size+"]";

 }
 

}


