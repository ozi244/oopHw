
public class main {
	public static void main(String[] args) {
		instuctor instuctor1 = new instuctor("Ali Pilli",12);
		instuctor instuctor2 = new instuctor("Ozan Özer",48);
		instuctor instuctor3 = new instuctor("Serdar Erciyas",23);
		instuctor[] instructors = {instuctor1,instuctor2,instuctor3};
	for(instuctor intructor:instructors) {
	System.out.println("eðitmenlerimiz "+intructor.name);
	
	
	}
	instuctorManager insM = new instuctorManager();
	insM.addinstuctor(instuctor2);
            insM.addinstuctor(instuctor1);
	insM.deleteinstuctor(instuctor1);
	}

}
