//Aufgabe3

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	Project project;	
	int max = 0;
	int time = 0;
	String name;
	int timer = 0;
	//Linked lists that contains the directly previous/following tasks
	//private List<Task> directPrev = new ArrayList<Task>();
	private List<Task> directFlw= new ArrayList<Task>();
	
	
	public Task(int time, String name) {
		this.time = time;
		this.name = name;
	}
	

	
	public void addFlw(Task flwTask) {
		directFlw.add(flwTask);
	}
	
	public int getTime() {
		return this.time;
	}
	
	public void calcTimeSeries(int timer) {

		timer += this.getTime();
		if(timer > this.project.getMinTime()) {
			project.setMinTime(timer);
		}
		for(Task task : directFlw) {
			
			task.calcTimeSeries(timer);
			
		}
//		System.out.println(timer);
		return;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	

}
