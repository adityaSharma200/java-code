package medicien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Medicines {

	public void display()
	{
	
	ArrayList a = new ArrayList();
	
	
		
	LinkedList<String> li = new LinkedList<>();
	
	
	
	li.add("2 Baconil Tts 20 14 MG Patch 7");
	li.add("2 Baconil Tts 30 21 MG Patch 7");
	li.add("2 Can 150 MG Tablet 1");
	li.add("2 Dep 20 MG Tablet 10");
	li.add("2 Dep 30 MG Tablet 10");
	li.add("2 Flora Capsule 10");
	li.add("2 Hicort 6 MG Tablet 10");
	li.add("2 Pace 100/325 MG Tablet 10");
	li.add("2 Pen 125/125 MG Injection 1");
	li.add("2 Pen 250/250 MG Injection 1");
	li.add("2 Pen Dry Syrup 30 ML");
	li.add("2 Pen Lb Capsule 10");
	li.add("2 Pen Lb Capsule 10");
	li.add("2 Pin 250 MG Tablet 10");
	li.add("2 Sitol Chewable Tablet 10");
	li.add("20 G Needle 1");
	li.add("24 Karat Tablet 10");
	li.add("25 D Infusion 100 ML");
	li.add("25oxy Oral Spray 6 ML");
	li.add("2azole Cream 20 GM");
	li.add("2b12 Tablet 15");
	li.add("2cv 500/125 MG Tablet 10");
	li.add("2some 200/500 MG Tablet 10");
	li.add("2some 50/125 MG Suspension 30 ML");
	li.add("3 C Plus Tablet 10");
	li.add("3 Cef 500 MG Tablet 10");
	li.add("3 Cef Novo 1000/500 MG Injection 1");
	li.add("3 Cef Novo 250/125 MG Injection 1");
	li.add("3 Cef Novo 500/250 MG Injection 1");
	li.add("3 D Skin 0.025/2/0.5 % Cream 10 GM");
	li.add("3 Efa Capsule 10");
	li.add("3 Kat 60 MG Tablet 10");
	li.add("3 Metic 10/10 MG Tablet 10");
	li.add("3 Mix Cream 10 GM");
	li.add("3 Mix Cream 7.5 GM");
	
	
	
	
	
	
	
	ListIterator lt = li.listIterator();
	
	System.out.println("All Medicine List");
	System.out.println("Find your medicines here");
	
	
	
	while(lt.hasNext())
	{
		System.out.println(lt.next());
	}
	
	//System.out.println();
	
	
	
	
	
	}
}
