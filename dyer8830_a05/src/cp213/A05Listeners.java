package cp213;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//If you need to implement/use a listener in your program then it must be an instance of this class.
//You can add suitable Interfaces to the header/definition of this class using implements.

public class A05Listeners     /*add your required Listener Interfaces here*/ {
	double givenmoney = 0.0;
	double money;
	double foo;
	double moneyreturn;
	//int nickelCount = 0;
	int nickelAmount = 20;
	int dimeAmount = 10;
	int quarterAmount = 12;
	int loonieAmount = 0;
	int toonieAmount = 0;
	int fiveBillAmount = 0;
	int tenBillAmount = 0 ;
	
	
	
	final A05Buttons A = new A05Buttons("A");;
	final A05Buttons B = new A05Buttons("B");
	final A05Buttons C = new A05Buttons("C");
	final A05Buttons D = new A05Buttons("D");
	final A05Buttons one = new A05Buttons("1");
	final A05Buttons two = new A05Buttons("2");
	final A05Buttons three = new A05Buttons("3");
	final A05Buttons four = new A05Buttons("4");
	final A05Buttons five = new A05Buttons("5");
	final A05Buttons six = new A05Buttons("6");
	final A05Buttons sev = new A05Buttons("7");
	final A05Buttons eigh = new A05Buttons("8");
	final A05Buttons nine = new A05Buttons("9");
	final A05Buttons zero = new A05Buttons("0");
	final A05Buttons cash = new A05Buttons("CASH");
	final A05Buttons credit = new A05Buttons("CREDIT");
	final A05Buttons enter = new A05Buttons("ENTER");
	final A05Buttons cancel = new A05Buttons("RESET");
	//final A05Buttons penny = new A05Buttons("1¢");
	final A05Buttons nickel = new A05Buttons("5¢");
	final A05Buttons dime = new A05Buttons("10¢");
	final A05Buttons quarter = new A05Buttons("25¢");
	final A05Buttons loonie = new A05Buttons("$1");
	final A05Buttons toonie = new A05Buttons("$2");
	final A05Buttons fivebill = new A05Buttons("$5");
	final A05Buttons tenbill = new A05Buttons("$10");
	final A05Buttons done = new A05Buttons("BACK");
	//final A05Buttons exit = new A05Buttons("EXIT");
	final A05Buttons done2 = new A05Buttons("BACK");
	
	
	
	
	
	
	//final A05Lable message = new A05Lable("Make A selection");
	final A05Lable A0 = new A05Lable("A0");
	final A05Lable A1 = new A05Lable("A1");
	final A05Lable A2 = new A05Lable("A2");
	final A05Lable A3 = new A05Lable("A3");
	final A05Lable B0 = new A05Lable("B0");
	final A05Lable B1 = new A05Lable("B1");
	final A05Lable B2 = new A05Lable("B2");
	final A05Lable B3 = new A05Lable("B3");
	final A05Lable C0 = new A05Lable("C0");
	final A05Lable C1 = new A05Lable("C1");
	final A05Lable C2 = new A05Lable("C2");
	final A05Lable C3 = new A05Lable("C3");
	final A05Lable D0 = new A05Lable("D0");
	final A05Lable D1 = new A05Lable("D1");
	final A05Lable D2 = new A05Lable("D2");
	final A05Lable D3 = new A05Lable("D3");
	final A05Lable food1 = new A05Lable("Skittles");
	final A05Lable food2 = new A05Lable("M&M's");
	final A05Lable food3 = new A05Lable("Coffee Crisp");
	final A05Lable food4 = new A05Lable("Lays");
	final A05Lable food5 = new A05Lable("Popcorn");
	final A05Lable food6 = new A05Lable("Ruffles");
	final A05Lable food7 = new A05Lable("Gummie Bears");
	final A05Lable food8 = new A05Lable("Gummie Worms");
	final A05Lable food9 = new A05Lable("Treats");
	final A05Lable food10 = new A05Lable("Snickers");
	final A05Lable food11 = new A05Lable("Lollipop");
	final A05Lable food12 = new A05Lable("Munchies");
	final A05Lable food13 = new A05Lable("Backwoods");
	final A05Lable food14 = new A05Lable("Spliff");
	final A05Lable food15 = new A05Lable("Blunt");
	final A05Lable food16 = new A05Lable("Goods");

	final A05Lable messsage11 = new A05Lable("5¢: ");
	final A05Lable messsage2 = new A05Lable("10¢: ");
	final A05Lable messsage3 = new A05Lable("25¢: ");
	final A05Lable messsage4 = new A05Lable("$1: ");
	final A05Lable messsage5 = new A05Lable("$2: ");
	final A05Lable messsage6 = new A05Lable("$5: ");
	final A05Lable messsage7 = new A05Lable("$10: ");
	
	
//  A05Buttons cancel = new A05Buttons("CANCEL");
//	A05Buttons cancel = new A05Buttons("CANCEL");
//	A05Buttons cancel = new A05Buttons("CANCEL");
//	A05Buttons cancel = new A05Buttons("CANCEL");
//	A05Buttons cancel = new A05Buttons("CANCEL");
	


	final A05Lable message = new A05Lable("Make A selection");
	
	
	
	private String[] inventory = {"A0","A1","A2","A3","B0","B1","B2","B3","C0","C1","C2","C3","D0","D1","D2","D3"};
	private int[] count = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
	private double[] price = {1.25,2.25,1.50,1.25,1.00,1.25,1.00,2.25,1.25,3.00,2.75,1.25,2.50,1.25,3.00};
	
	public int retrive(String arg) {
		int index= -1;
		for(int i = 0; i< inventory.length;i++) {
			if(inventory[i].equals(arg)) {
				index = i;
			}
			
		}
		return index;
		
	}
	public void subtractCount(int index) {
		count[index]= count[index]-1;
		
	}
	
	public double getPrice(int index) {
		
		return price[index];
		
	}
	public int getCount(int index) {
		
		return count[index];
		
	}
	
	public double getMoney(int index) {
		
		final int valid = retrive(componentID);
		double p = getPrice(valid);
		double m = p;
		return m;
	}

	public void setMoney(double num) {
		this.money = num;
	}

	private String componentID;//your own unique way of identifying components that will be attached
	//to the A05Listener objects. This way you will be able to distinguish that which component has
	//invoked the action handler.
	
		
	//private String button ="";
	
	
    
	
	public A05Listeners(String arg) {//DO NOT modify this line
		componentID = arg;//DO NOT modify this line
		//you can perform additional actions here.
		this.registerListeners();
		A05Listeners.this.messsage11.setVisible(false);
		A05Listeners.this.messsage2.setVisible(false);
		A05Listeners.this.messsage3.setVisible(false);
		A05Listeners.this.messsage4.setVisible(false);
		A05Listeners.this.messsage5.setVisible(false);
		A05Listeners.this.messsage6.setVisible(false);
		A05Listeners.this.messsage7.setVisible(false);
		
	}
	
	private class ButtonListern implements ActionListener{
		
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		A05Listeners.this.done.setVisible(false);
		A05Listeners.this.done2.setVisible(false);
		
		if(e.getSource()==A05Listeners.this.A) {
			componentID = "A";
			message.setText(componentID);
		}
		else if(e.getSource()== A05Listeners.this.B) {
			componentID = "B";
			message.setText(componentID);

		}
		else if(e.getSource()== A05Listeners.this.C) {
			componentID = "C";
			message.setText(componentID);

		}
		else if(e.getSource()== A05Listeners.this.D) {
			componentID = "D";
			message.setText(componentID);

		}
		else if(e.getSource()== A05Listeners.this.zero) {
			if(componentID.length()< 2) {
				componentID += "0";
				message.setText(componentID);
			}
		}
		else if(e.getSource()== A05Listeners.this.nine) {
			if(componentID.length()< 2) {
				componentID += "9";
				message.setText(componentID);


				}
		}
		
		else if(e.getSource()== A05Listeners.this.one) {
			if(componentID.length()< 2) {
				componentID += "1";
				message.setText(componentID);


			}
		}
		else if(e.getSource()== A05Listeners.this.two) {
			if(componentID.length()< 2) {
				componentID += "2";
				message.setText(componentID);


			}
		}else if(e.getSource()== A05Listeners.this.three) {
			if(componentID.length()< 2) {
				componentID += "3";
				message.setText(componentID);


			}
		}else if(e.getSource()== A05Listeners.this.four) {
			if(componentID.length()< 2) {
				componentID += "4";
				message.setText(componentID);


			}
		}else if(e.getSource()== A05Listeners.this.five) {
			if(componentID.length()< 2) {
				componentID += "5";
				message.setText(componentID);


			}
		}else if(e.getSource()== A05Listeners.this.six) {
			if(componentID.length()< 2) {
				componentID += "6";
				message.setText(componentID);


			}
		}else if(e.getSource()== A05Listeners.this.sev) {
			if(componentID.length()< 2) {
				componentID += "7";
				message.setText(componentID);


			}
		}else if(e.getSource()== A05Listeners.this.eigh) {
			if(componentID.length()< 2) {
				componentID += "8";
				message.setText(componentID);

		}
			
		}
		
		
		else if(e.getSource()== A05Listeners.this.enter) {
			int valid = retrive(componentID);
			//int c= getCount(valid);
			if(valid == -1) {
				message.setText("Please Enter a Vaild Selection");
				
			}
			else if(A05Listeners.this.getCount(valid)==0){
				message.setText("Out of Stock");
				foo = 0;
			}
			else {
				foo = getPrice(valid);
				message.setText("$"+ foo);
				A05Listeners.this.money = foo;
				A05Listeners.this.setMoney(foo);
				A05Listeners.this.cash.setVisible(true);
				A05Listeners.this.credit.setVisible(true);
				
			}
			
		}
	}
	
	
		
	}
	private class CashListener implements ActionListener{
		
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		A05Listeners.this.messsage11.setVisible(true);
		A05Listeners.this.messsage2.setVisible(true);
		A05Listeners.this.messsage3.setVisible(true);
		A05Listeners.this.messsage4.setVisible(true);
		A05Listeners.this.messsage5.setVisible(true);
		A05Listeners.this.messsage6.setVisible(true);
		A05Listeners.this.messsage7.setVisible(true);
		/*
		A05Listeners.this.A.setVisible(false);
		A05Listeners.this.B.setVisible(false);
		A05Listeners.this.C.setVisible(false);
		A05Listeners.this.D.setVisible(false);
		A05Listeners.this.one.setVisible(false);
		A05Listeners.this.two.setVisible(false);
		A05Listeners.this.three.setVisible(false);
		A05Listeners.this.four.setVisible(false);
		A05Listeners.this.five.setVisible(false);
		A05Listeners.this.six.setVisible(false);
		A05Listeners.this.sev.setVisible(false);
		A05Listeners.this.eigh.setVisible(false);
		A05Listeners.this.nine.setVisible(false);
		*/
		A05Listeners.this.done.setEnabled(false);
		//A05Listeners.this.exit.setVisible(false);
		A05Listeners.this.done2.setVisible(false);
		if(A05Listeners.this.componentID.equals("") || A05Listeners.this.componentID.length()== 1) {
			message.setText("Please make a selection");
			
		}
		else if(A05Listeners.this.foo == 0) {
			message.setText("Please enter a selection");
		}
		else {
		A05Listeners.this.enter.setVisible(false);
		A05Listeners.this.cash.setVisible(false);
		A05Listeners.this.credit.setVisible(false);
		A05Listeners.this.cancel.setVisible(false);
		A05Listeners.this.nickel.setVisible(true);
		A05Listeners.this.dime.setVisible(true);
		A05Listeners.this.quarter.setVisible(true);
		A05Listeners.this.loonie.setVisible(true);
		A05Listeners.this.toonie.setVisible(true);
		A05Listeners.this.fivebill.setVisible(true);
		A05Listeners.this.tenbill.setVisible(true);
		A05Listeners.this.done.setVisible(true);
		A05Listeners.this.A.setEnabled(false);
		A05Listeners.this.B.setEnabled(false);
		A05Listeners.this.C.setEnabled(false);
		A05Listeners.this.D.setEnabled(false);
		A05Listeners.this.one.setEnabled(false);
		A05Listeners.this.two.setEnabled(false);
		A05Listeners.this.three.setEnabled(false);
		A05Listeners.this.four.setEnabled(false);
		A05Listeners.this.five.setEnabled(false);
		A05Listeners.this.six.setEnabled(false);
		A05Listeners.this.sev.setEnabled(false);
		A05Listeners.this.eigh.setEnabled(false);
		A05Listeners.this.nine.setEnabled(false);
		A05Listeners.this.zero.setEnabled(false);
		
		
		
		
		
		
		int valid = retrive(componentID);
		double value ;
		
		
		
		
		
		
		
		
		
		if (e.getSource() == A05Listeners.this.nickel) {
			A05Listeners.this.nickelAmount += 1;
			money -=0.05;
			message.setText("$" + money);	
		}
		else if (e.getSource() == A05Listeners.this.dime) {
			A05Listeners.this.dimeAmount += 1;
			money -=0.10;
			message.setText("$" + money);
			
		}
		else if (e.getSource() == A05Listeners.this.quarter) {
			A05Listeners.this.quarterAmount += 1;
			money -= 0.25;
			message.setText("$" + money);
			
		}
		else if (e.getSource() == A05Listeners.this.loonie) {
			A05Listeners.this.loonieAmount += 1;
			money -= 1.00;
			message.setText("$" + money);
			
		}
		else if (e.getSource() == A05Listeners.this.toonie) {
			A05Listeners.this.toonieAmount += 1;
			money -= 2.00;
			message.setText("$" + money);
			
		}
		else if (e.getSource() == A05Listeners.this.fivebill) {
			A05Listeners.this.fiveBillAmount += 1;
			money -= 5.00;
			message.setText("$" + money);	
		}
		else if (e.getSource() == A05Listeners.this.tenbill) {
			A05Listeners.this.tenBillAmount += 1;
			money -= 10.00;
			message.setText("$" + money);
			
		}
		
		if(money<=0) {
			if (nickelAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (nickelAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (dimeAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (quarterAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (loonieAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (toonieAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (fiveBillAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			if (tenBillAmount == 0) {
				message.setText("System out of change");
				A05Listeners.this.nickel.setEnabled(false);
				A05Listeners.this.dime.setEnabled(false);
				A05Listeners.this.quarter.setEnabled(false);
				A05Listeners.this.loonie.setEnabled(false);
				A05Listeners.this.toonie.setEnabled(false);
				A05Listeners.this.fivebill.setEnabled(false);
				A05Listeners.this.tenbill.setEnabled(false);
				A05Listeners.this.done.setEnabled(true);
				
			}
			
			
			
			else {
			int nickelCount = 0;
			int dimeCount = 0;
			int quarterCount = 0;
			int loonieCount = 0;
			int toonieCount = 0;
			int fiveBillCount = 0;
			int tenBillCount = 0;
			
			A05Listeners.this.moneyreturn = Math.abs(A05Listeners.this.money);
			
			while (A05Listeners.this.moneyreturn >= 0){
				
				
				if (A05Listeners.this.moneyreturn % 10.00 == 0 ) {
					A05Listeners.this.moneyreturn -= 10.00;
					A05Listeners.this.tenBillAmount -= 1;
					tenBillCount += 0;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
				}
				else if (A05Listeners.this.moneyreturn % 5.00 == 0 ) {
				
					A05Listeners.this.moneyreturn -= 5.00;
					A05Listeners.this.fiveBillAmount -= 1;
					fiveBillCount += 1;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
					
				}
				else if (A05Listeners.this.moneyreturn % 2.00 == 0 ) {
					
					A05Listeners.this.moneyreturn -= 2.00;
					A05Listeners.this.toonieAmount -= 1;
					toonieCount += 1;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
					
				}
				else if (A05Listeners.this.moneyreturn % 1.00 == 0 ) {
					
					A05Listeners.this.moneyreturn -= 1.00;
					A05Listeners.this.loonieAmount -= 1;
					loonieCount += 1;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
					
				}
				else if (A05Listeners.this.moneyreturn % 0.25 == 0 ) {
					
					A05Listeners.this.moneyreturn -= 0.25;
					A05Listeners.this.quarterAmount -= 1;
					quarterCount += 1;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
					
				}
				else if (A05Listeners.this.moneyreturn % 0.10 == 0) {
					
					A05Listeners.this.moneyreturn -= 0.10;
					A05Listeners.this.dimeAmount -= 1;
					dimeCount += 1;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
					
				}
				else if (A05Listeners.this.moneyreturn % 0.05 == 0 ) {
					
					A05Listeners.this.moneyreturn -= 0.05;
					A05Listeners.this.nickelAmount -= 1;
					nickelCount += 1;	
					//moneyreturn = Math.abs(A05Listeners.this.moneyreturn);
					
				}
			
				
				
			}
			messsage11.setText("5¢ " + nickelCount);
			messsage2.setText("10¢ " + dimeCount);
			messsage3.setText("25¢ " + quarterCount);
			messsage4.setText("$1 " + loonieCount);
			messsage5.setText("$2 " + toonieCount);
			messsage6.setText("$5 " + fiveBillCount);
			messsage7.setText("$10 " + tenBillCount);
			
			//JOptionPane.showMessageDialog(null, A05Listeners.this.moneyreturn);
			int val = A05Listeners.this.retrive(componentID);
			A05Listeners.this.subtractCount(val);
			
			message.setText("The amount of change is $" + Math.abs(money) );
			A05Listeners.this.done.setEnabled(true);
			A05Listeners.this.nickel.setEnabled(false);
			A05Listeners.this.dime.setEnabled(false);
			A05Listeners.this.quarter.setEnabled(false);
			A05Listeners.this.loonie.setEnabled(false);
			A05Listeners.this.toonie.setEnabled(false);
			A05Listeners.this.fivebill.setEnabled(false);
			A05Listeners.this.tenbill.setEnabled(false);
			A05Listeners.this.messsage11.setEnabled(true);
			A05Listeners.this.messsage2.setEnabled(true);
			A05Listeners.this.messsage3.setEnabled(true);
			A05Listeners.this.messsage4.setEnabled(true);
			A05Listeners.this.messsage5.setEnabled(true);
			A05Listeners.this.messsage6.setEnabled(true);
			
			A05Listeners.this.messsage7.setEnabled(false);
			
			//A05Listeners.this.exit.setVisible(false);
		}
		}
		
		
		
		
		
				
	}	}	
		
	}
	private class CreditListener implements ActionListener{
		
	@Override
	public void actionPerformed(ActionEvent e) {
		A05Listeners.this.done2.setVisible(true);
		A05Listeners.this.enter.setEnabled(false);
		A05Listeners.this.cancel.setEnabled(false);
		A05Listeners.this.cash.setEnabled(false);
		A05Listeners.this.credit.setEnabled(false);
		A05Listeners.this.A.setEnabled(false);
		A05Listeners.this.B.setEnabled(false);
		A05Listeners.this.C.setEnabled(false);
		A05Listeners.this.D.setEnabled(false);
		A05Listeners.this.one.setEnabled(false);
		A05Listeners.this.two.setEnabled(false);
		A05Listeners.this.three.setEnabled(false);
		A05Listeners.this.four.setEnabled(false);
		A05Listeners.this.five.setEnabled(false);
		A05Listeners.this.six.setEnabled(false);
		A05Listeners.this.sev.setEnabled(false);
		A05Listeners.this.eigh.setEnabled(false);
		A05Listeners.this.nine.setEnabled(false);
		A05Listeners.this.zero.setEnabled(false);
		
		
		message.setText("Processing...");
		//A05Listeners.this.
		
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(10));
		}
		catch(InterruptedException e1) {
			
			e1.printStackTrace();
		}
		Random r = new Random();
		int game = r.nextInt();
		if (game < 90) {
			message.setText("Payment Accepted");
			int val = A05Listeners.this.retrive(componentID);
			//System.exit(0);
		}
		else {
			message.setText("Payment Declined");
			//System.exit(0);
		}
		
	}
	
	}
	 private void registerListeners() {
		 A05Listeners.this.A.addActionListener(new ButtonListern());
		 A05Listeners.this.B.addActionListener(new ButtonListern());
		 A05Listeners.this.C.addActionListener(new ButtonListern());
		 A05Listeners.this.D.addActionListener(new ButtonListern());
		 A05Listeners.this.one.addActionListener(new ButtonListern());
		 A05Listeners.this.two.addActionListener(new ButtonListern());
		 A05Listeners.this.three.addActionListener(new ButtonListern());
		 A05Listeners.this.four.addActionListener(new ButtonListern());
		 A05Listeners.this.five.addActionListener(new ButtonListern());
		 A05Listeners.this.six.addActionListener(new ButtonListern());
		 A05Listeners.this.sev.addActionListener(new ButtonListern());
		 A05Listeners.this.eigh.addActionListener(new ButtonListern());
		 A05Listeners.this.nine.addActionListener(new ButtonListern());
		 A05Listeners.this.zero.addActionListener(new ButtonListern());
		 A05Listeners.this.enter.addActionListener(new ButtonListern());
		 A05Listeners.this.cancel.addActionListener(new ButtonListern());
		 //A05Listeners.this.penny.addActionListener(new ButtonListern());
		 A05Listeners.this.cash.addActionListener(new CashListener());
		 A05Listeners.this.nickel.addActionListener(new CashListener());
		 A05Listeners.this.dime.addActionListener(new CashListener());
		 A05Listeners.this.quarter.addActionListener(new CashListener());
		 A05Listeners.this.loonie.addActionListener(new CashListener());
		 A05Listeners.this.toonie.addActionListener(new CashListener());
		 A05Listeners.this.fivebill.addActionListener(new CashListener());
		 A05Listeners.this.tenbill.addActionListener(new CashListener());
		 A05Listeners.this.done.addActionListener(new ReturnListener());
		 A05Listeners.this.done2.addActionListener(new ReturnListener2());
		 //A05Listeners.this.A.addActionListener(new ButtonListern());
		 //A05Listeners.this.A.addActionListener(new ButtonListern());
		 A05Listeners.this.credit.addActionListener(new CreditListener());


			
		    }
	 
	 
	 private class ReturnListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				A05Listeners.this.nickel.setEnabled(true);
				A05Listeners.this.dime.setEnabled(true);
				A05Listeners.this.quarter.setEnabled(true);
				A05Listeners.this.loonie.setEnabled(true);
				A05Listeners.this.toonie.setEnabled(true);
				A05Listeners.this.fivebill.setEnabled(true);
				A05Listeners.this.tenbill.setEnabled(true);
				A05Listeners.this.done.setVisible(true);
				
				
				message.setText("Make a selection");
				componentID = "";
				foo = 0;
				
				
				A05Listeners.this.enter.setVisible(true);
				A05Listeners.this.cash.setVisible(true);
				A05Listeners.this.credit.setVisible(true);
				
				
				A05Listeners.this.nickel.setVisible(false);
				A05Listeners.this.dime.setVisible(false);
				A05Listeners.this.quarter.setVisible(false);
				A05Listeners.this.loonie.setVisible(false);
				A05Listeners.this.toonie.setVisible(false);
				A05Listeners.this.fivebill.setVisible(false);
				A05Listeners.this.tenbill.setVisible(false);
				A05Listeners.this.done.setVisible(false);
				
				A05Listeners.this.enter.setEnabled(true);
				A05Listeners.this.cash.setEnabled(true);
				A05Listeners.this.credit.setEnabled(true);
				A05Listeners.this.cancel.setEnabled(true);
				A05Listeners.this.A.setEnabled(true);
				A05Listeners.this.B.setEnabled(true);
				A05Listeners.this.C.setEnabled(true);
				A05Listeners.this.D.setEnabled(true);
				A05Listeners.this.one.setEnabled(true);
				A05Listeners.this.two.setEnabled(true);
				A05Listeners.this.three.setEnabled(true);
				A05Listeners.this.four.setEnabled(true);
				A05Listeners.this.five.setEnabled(true);
				A05Listeners.this.six.setEnabled(true);
				A05Listeners.this.sev.setEnabled(true);
				A05Listeners.this.eigh.setEnabled(true);
				A05Listeners.this.nine.setEnabled(true);
				A05Listeners.this.zero.setEnabled(true);
				
				
				A05Listeners.this.messsage11.setVisible(false);
				A05Listeners.this.messsage2.setVisible(false);
				A05Listeners.this.messsage3.setVisible(false);
				A05Listeners.this.messsage4.setVisible(false);
				A05Listeners.this.messsage5.setVisible(false);
				A05Listeners.this.messsage6.setVisible(false);
				A05Listeners.this.messsage7.setVisible(false);
				
			}
	 }		
	 private class ReturnListener2 implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				A05Listeners.this.nickel.setEnabled(true);
				A05Listeners.this.dime.setEnabled(true);
				A05Listeners.this.quarter.setEnabled(true);
				A05Listeners.this.loonie.setEnabled(true);
				A05Listeners.this.toonie.setEnabled(true);
				A05Listeners.this.fivebill.setEnabled(true);
				A05Listeners.this.tenbill.setEnabled(true);
				A05Listeners.this.done.setVisible(true);
				*/
				
				A05Listeners.this.enter.setEnabled(true);
				A05Listeners.this.cancel.setEnabled(true);
				A05Listeners.this.cash.setEnabled(true);
				A05Listeners.this.credit.setEnabled(true);
				
				message.setText("Make a selection");
				componentID = "";
				foo = 0;
				
				
				
				A05Listeners.this.enter.setVisible(false);
				A05Listeners.this.cash.setVisible(false);
				A05Listeners.this.credit.setVisible(false);
				A05Listeners.this.cancel.setVisible(false);
				A05Listeners.this.A.setEnabled(false);
				A05Listeners.this.B.setEnabled(false);
				A05Listeners.this.C.setEnabled(false);
				A05Listeners.this.D.setEnabled(false);
				A05Listeners.this.one.setEnabled(false);
				A05Listeners.this.two.setEnabled(false);
				A05Listeners.this.three.setEnabled(false);
				A05Listeners.this.four.setEnabled(false);
				A05Listeners.this.five.setEnabled(false);
				A05Listeners.this.six.setEnabled(false);
				A05Listeners.this.sev.setEnabled(false);
				A05Listeners.this.eigh.setEnabled(false);
				A05Listeners.this.nine.setEnabled(false);
				A05Listeners.this.zero.setEnabled(false);
				A05Listeners.this.nickel.setVisible(false);
				A05Listeners.this.dime.setVisible(false);
				A05Listeners.this.quarter.setVisible(false);
				A05Listeners.this.loonie.setVisible(false);
				A05Listeners.this.toonie.setVisible(false);
				A05Listeners.this.fivebill.setVisible(false);
				A05Listeners.this.tenbill.setVisible(false);
				A05Listeners.this.done.setVisible(false);
				A05Listeners.this.done2.setVisible(true);
				
				
			
				
				
				
				
				
				A05Listeners.this.enter.setVisible(true);
				A05Listeners.this.cash.setVisible(true);
				A05Listeners.this.credit.setVisible(true);
				A05Listeners.this.cancel.setVisible(true);
				A05Listeners.this.A.setEnabled(true);
				A05Listeners.this.B.setEnabled(true);
				A05Listeners.this.C.setEnabled(true);
				A05Listeners.this.D.setEnabled(true);
				A05Listeners.this.one.setEnabled(true);
				A05Listeners.this.two.setEnabled(true);
				A05Listeners.this.three.setEnabled(true);
				A05Listeners.this.four.setEnabled(true);
				A05Listeners.this.five.setEnabled(true);
				A05Listeners.this.six.setEnabled(true);
				A05Listeners.this.sev.setEnabled(true);
				A05Listeners.this.eigh.setEnabled(true);
				A05Listeners.this.nine.setEnabled(true);
				A05Listeners.this.zero.setEnabled(true);
				A05Listeners.this.nickel.setVisible(false);
				A05Listeners.this.dime.setVisible(false);
				A05Listeners.this.quarter.setVisible(false);
				A05Listeners.this.loonie.setVisible(false);
				A05Listeners.this.toonie.setVisible(false);
				A05Listeners.this.fivebill.setVisible(false);
				A05Listeners.this.tenbill.setVisible(false);
				A05Listeners.this.done.setVisible(false);
				A05Listeners.this.done2.setVisible(false);
				//A05Listeners.this.exit.setVisible(true);
				
				
				
				
			}
	 }		
	
	
}