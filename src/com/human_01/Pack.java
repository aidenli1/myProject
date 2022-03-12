package com.human_01;//3.11

import java.util.Objects;

public class Pack { // 클래스 정의. 상속의 장점 : 부모가 가진 성질 사용가

		public String name = "홍길동"; //필드
		public int age = 20;
		public double height = 160.1;
		
		public Pack() {} //이걸 생성해줘야 기존 코드들이 에러가 안남.
		
		public Pack(String name, int age, double height) {
			super();
			this.name = name;
			this.age = age;
			this.height = height;
		}
		
		

		

		@Override
		public int hashCode() { //hash의 key값 많이 사용된다 공
			return Objects.hash(age, height, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pack other = (Pack) obj;
			return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
					&& Objects.equals(name, other.name);
		}

		
		
		@Override // 부모의 의미가 마음에 안들어 다시 생성한 경우.
		public String toString() { //메소드
//			int age = 5 이게 있으면 그냥 age. 없으면 위에 age값을 쓴다. 이때 this.age를 사용한다.
			
			return "Pack [name=" + name + ", age=" + age + ", height=" + height + "]";
		}
		//name 이나 this.name이나 같은 의미. 있으면 지역에서 찾고 없으면 클래스 필드에서 찾는다.
		
		
		

	}
