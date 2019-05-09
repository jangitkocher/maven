package de.hfu;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest
{
  @Test
  public void testIstErstesHalbjahr() 
  {
	  
		  assertTrue( "message", Util.istErstesHalbjahr(1));
		  assertTrue( "message", Util.istErstesHalbjahr(6));
		  
  } 
  
  @Test
  public void testIstZweitesHalbjahr() 
  {
	  
		  assertFalse( "Ist nicht innerhalb des zweiten Halbjahres!", Util.istErstesHalbjahr(7));
		  assertFalse( "message", Util.istErstesHalbjahr(12));
		  
  } 
  
}
  