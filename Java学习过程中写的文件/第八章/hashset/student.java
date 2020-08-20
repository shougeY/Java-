package 第八章.hashset;

public class student {

		   private String name;
		   private int age;
		   public student() {
		   }
		   public student(String name, int age)    
		   {
			super();
			this.name = name;
			this.age = age;
		   }
		   public int getAge() {
			return age;
		  }
		   public void setAge(int age) {
				this.age = age;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}	

		@Override
		public boolean equals(Object obj){
		      if(obj==null)	return false;
		      if(this==obj)	return true;
		      if(obj instanceof student){
			student stu = (student)obj; //对象相等的依据是id和name都相同
			return this.name.equals(stu.name) && this.age==stu.age;
		       }	
		       return false;
		}
			
		@Override
		public int hashCode(){
			return  name.hashCode()^age^0x5f2ab673;  } 
		//散列方法:原始散列码与大数值异或运算
	}
