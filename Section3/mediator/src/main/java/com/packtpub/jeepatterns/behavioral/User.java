package com.packtpub.jeepatterns.behavioral;

public abstract class User {
	protected final ChatMediator mediator;
	protected final String name;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}