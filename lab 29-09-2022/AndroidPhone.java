package corejava_basic.initial;

public class AndroidPhone {

	
	String modelnum;
	Display display;
    RAM ram;
    COLOR color;
	
	
	public AndroidPhone(String  modelnum, Display display, RAM ram,COLOR color )
	{
		this.modelnum=modelnum;
		this.display=display;
		this.ram=ram;
		this.color=color;
	}
	
	
		void display()
		{
			System.out.println( modelnum="+modelnum+");
			System.out.println(display);
			System.out.println( ram);
			System.out.println( color);
		}
	}
	

