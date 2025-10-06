package activity.java;

public class Students {
	 private int regnum;
	    private String name;
	    private String dept;
	    public int getRegnum() {
			return regnum;
		}
		public void setRegnum(int regnum) {
			this.regnum = regnum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		@Override
		public String toString() {
			return "Students details regnum= "+regnum+", name="+name+", dept="+dept+" ";
		}

}
