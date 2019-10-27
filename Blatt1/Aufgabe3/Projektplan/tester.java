//Aufgabe3


public class tester {

	public static void main(String[] args) {
		
		Project project = new Project("Tester");
		
		Task v1 = new Task(10, "v1");
		Task v2 = new Task(25, "v2");
		Task v3 = new Task(15, "v3");
		Task v4 = new Task(15, "v4");
		Task v5 = new Task(24, "v5");
		Task v6 = new Task(42, "v6");
		Task v7 = new Task(89, "v7");
		Task v8 = new Task(1337, "v8");
		Task v9 = new Task(1, "v9");
		
		
		project.addTask(project.getRootTask(), v1);
		project.addTask(v1, v2);
		project.addTask(v1, v3);
		project.addTask(v2, v5);
		project.addTask(v2, v6);
		project.addTask(v3, v4);
		project.addTask(v4, v8);
		project.addTask(v5, v8);
		project.addTask(v6, v7);
		project.addTask(v7, v9);
		project.addTask(v8, v9);
		
		project.calcMinTime();
		
		System.out.println(project.getMinTime());

	
		
		
	}

}
