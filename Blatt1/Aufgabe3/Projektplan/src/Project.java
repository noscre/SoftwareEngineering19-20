//Aufgabe3
public class Project {
	
	private String projectName;
	private Task rootTask = new Task(0, "root");
	private int minTime = 0;
	
	public Project(String projectName) {
		this.projectName = projectName;
	}
	
	public String getProjectName() {
		return this.projectName;
	}
	
	public void addTask(Task prev, Task flw) {
		prev.addFlw(flw);
		flw.setProject(this);
		prev.setProject(this);
	}
	
	public void calcMinTime() {
		rootTask.calcTimeSeries(rootTask.getTime());
	}
	
	public int getMinTime() {
		return this.minTime;
	}
	
	public void setMinTime(int t) {
		this.minTime = t;
	}
	
	public Task getRootTask() {
		return this.rootTask;
	}
	
	
	
	
}
