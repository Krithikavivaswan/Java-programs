package org.univ;

public class College extends University{
@Override
public void pg() {
System.out.println("UG degrees are B.sc, BBA, B.Ed ");
}

@Override
public void ug() {
System.out.println("PG degrees are M.Sc, M.Com ");	
}
public static void main(String[] args) {
	College c=new College();
			c.pg();
	c.ug();
	
}
	}

	



