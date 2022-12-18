package com.abstractPratice.incubationAbstract;

public class Office {
    public static void main(String[] args) {
		TeamMembers team=new Kartick(new Kadhar());
		TeamMembers team1=new Kadhar(new Kartick());
	}
}
abstract class TeamMembers{
	
}
abstract class Developer extends TeamMembers{
	
}
abstract class Tester extends TeamMembers{
	
}
class Kadhar extends Tester{
	TeamMembers team;
	public Kadhar() {
		
	}
    public Kadhar(TeamMembers team) {
		this.team=team;
	}
}
class Kartick extends Developer{
	TeamMembers team;
	public Kartick() {
	}
	public Kartick(TeamMembers team) {
	    this.team=team;
	}
}
