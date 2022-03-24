package testngpractise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class t1 {
	
	@Test
	public void HheyDude()
	{
		System.out.println("1");
	}
	
	@Test(groups= {"Smoke"})
	public void BheyDude()
	{
		System.out.println("2");
	}
	
	@Test
	public void AheyDude()
	{
		System.out.println("3");
	}
	
	@Test(groups= {"Smoke"})
	public void NheyDude()
	{
		System.out.println("7");
	}
	
	@AfterTest
	public void heyDude1()
	{
		System.out.println("bft");
	}

}
