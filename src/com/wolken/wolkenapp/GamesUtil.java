package com.wolken.wolkenapp;

public class GamesUtil {
	public static void main(String[] args) {
		Games games=new Games("counterstrike",6);
		games.setName("roadrash");
		games.setNoOfPlayers(6);
		games.setType("offline");
		System.out.println(games.getName()+" "+games.getNoOfPlayers()+" "+games);
		
		
		
		
		
	}

}
