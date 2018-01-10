package com.myx.maven.pojo.po;

import org.junit.Test;

public class StudentTest {
	@Test
	public void test1() {
		Student s=new Student();
		s.setId("123");
		s.setName("myx");
		System.out.println(s);
	}
}
