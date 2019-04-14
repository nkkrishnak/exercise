package com.exercise.fuctionalprogramming;


public class MessagePrint {
	
	public static void main(String[] args){
		
		
					
		/*  Exercise-1 [ Anonymous Class ]
		 *  Here MessageBoard interface is being
		 *  instantiated as anonymous class.
	     */
		MessageBoard message = new MessageBoard() {
			
			@Override
			public void displayBoard() {
				System.out.println("Hello");
			}
		};
		
		message.displayBoard();
		
		
		/* Exercise-2 [ Lambda Expressions ]
		 * Now without using anonymous class 
		 * With lamdba Expressions
		*/
	    MessageBoard lambdaMessage = ()->{
		System.out.println("Message from Lambda ! ");
		};
		
		lambdaMessage.displayBoard();
		
		
		/* Exercise-3 [ Lambda with arguments ]
		 * Note: Braces (inputMessage) is optional 
		 * for one argument functional interfaces
		*/
		CustomMessageBoard customMessage = inputMessage -> {
			System.out.println(inputMessage);
		};
		
		customMessage.displayBoard("My Dashboard Title");
	}

	
}
