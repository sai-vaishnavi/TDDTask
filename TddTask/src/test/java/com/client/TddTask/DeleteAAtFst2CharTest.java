package com.client.TddTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteAAtFst2CharTest {
	DeleteAAtFst2Char deleteAAtFst2Char;
	@BeforeEach
	void setup() {
		deleteAAtFst2Char =new DeleteAAtFst2Char();
	}
	
	@Test
	void NoDeleteIfEmpty() {
	assertEquals("",		deleteAAtFst2Char.DeleteChar(""));
	}

	@Test
	void DeleteId1A(){
		assertEquals("",		deleteAAtFst2Char.DeleteChar("A"));
	
	}
	@Test
	void DeleteIf2A() {
		assertEquals("",		deleteAAtFst2Char.DeleteChar("AA"));
	}
	@Test
	void DeleteAAtFstChar () {
		assertEquals("BCD",		deleteAAtFst2Char.DeleteChar("ABCD"));
	}
	@Test
	void DeleteAAtsecChar()  {
		assertEquals("BCD",		deleteAAtFst2Char.DeleteChar("BACD"));
	}
	@Test
	void DeleteAAtFstnsecChar (){
		assertEquals("CD",		deleteAAtFst2Char.DeleteChar("AACD"));
	}
	@Test
	void NoDeleteAAChar () {
		assertEquals("BC",		deleteAAtFst2Char.DeleteChar("BC"));
	}
	@Test
	void NoDeleteAAtFstChar () {
		assertEquals("B",		deleteAAtFst2Char.DeleteChar("B"));
	}
	@Test
	void DeleteAAtOnlyFstChar()  {
		assertEquals("B",		deleteAAtFst2Char.DeleteChar("AB"));
	}
	@Test
	void DeleteAAtOnlySecChar () {
		assertEquals("B",		deleteAAtFst2Char.DeleteChar("BA"));
	}
	@Test
	void NoDeleteAAtLastChar (){
		assertEquals("BCAA",		deleteAAtFst2Char.DeleteChar("BCAA"));
	}
	



}
