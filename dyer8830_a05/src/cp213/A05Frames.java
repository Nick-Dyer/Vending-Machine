package cp213;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class A05Frames  {
	
		static A05Listeners lst = new A05Listeners("");
		private JFrame f = new JFrame();
		public A05Frames() {
			oneview view = new oneview(lst);
			f.setSize(900, 650);
			
			A05Listeners lst = new A05Listeners("");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setContentPane(view);
			f.setVisible(true);
			
			
		}
		
		}


	class keypad extends JPanel {
		public keypad(A05Listeners lst) {
			layout1(lst);
		}
		

	public void layout1(A05Listeners lst) {
		
		this.setLayout(null);
		this.setSize(250, 480);
		
		//A05Listeners lst = new A05Listeners("");	
		lst.message.setHorizontalAlignment(SwingConstants.CENTER);
		lst.message.setFont(new Font("Monospaced", Font.BOLD, 12));

		this.add(lst.message).setBounds(7, 28, 226, 26);
		lst.cash.setForeground(Color.RED);
		lst.credit.setForeground(Color.BLUE);
		this.add(lst.A).setBounds(27, 53, 49, 29);
		this.add(lst.B).setBounds(69, 53, 49, 29);
		this.add(lst.C).setBounds(110, 53, 49, 29);
		this.add(lst.D).setBounds(153, 53, 49, 29);
		this.add(lst.one).setBounds(27, 82, 49, 29);
		this.add(lst.two).setBounds(69, 82, 49, 29);
		this.add(lst.three).setBounds(110, 82, 49, 29);
		this.add(lst.four).setBounds(153, 82, 49, 29);
		this.add(lst.five).setBounds(27, 111, 49, 29);
		this.add(lst.six).setBounds(69, 111, 49, 29);
		this.add(lst.sev).setBounds(110, 111, 49, 29);
		this.add(lst.eigh).setBounds(153, 111, 49, 29);
		this.add(lst.nine).setBounds(110, 139, 49, 29);
		this.add(lst.zero).setBounds(69, 139, 49, 29);
		//this.add(lst.cancel).setBounds(27, 180, 60, 63);
		this.add(lst.enter).setBounds(61, 180, 109, 63);
		this.add(lst.cash).setBounds(6, 252, 117, 29);
		this.add(lst.credit).setBounds(115, 252, 117, 29);
		lst.done.setVisible(false);
		lst.done2.setVisible(false);
		this.add(lst.done).setBounds(174, 267, 58, 36);
		this.add(lst.done2).setBounds(174, 267, 58, 36);

		lst.quarter.setVisible(false);
		lst.dime.setVisible(false);
		lst.nickel.setVisible(false);
		lst.toonie.setVisible(false);
		lst.loonie.setVisible(false);
		lst.fivebill.setVisible(false);
		lst.tenbill.setVisible(false);
		lst.cash.setVisible(false);
		lst.credit.setVisible(false);
		this.add(lst.quarter).setBounds(32, 180, 86, 29);
		this.add(lst.dime).setBounds(116, 180, 86, 29);
		this.add(lst.nickel).setBounds(32, 210, 86, 29);
		this.add(lst.loonie).setBounds(116, 210, 86, 29);
		this.add(lst.toonie).setBounds(32, 239, 86, 29);
		this.add(lst.fivebill).setBounds(116, 239, 86, 29);
		this.add(lst.tenbill).setBounds(73, 266, 86, 29);
		
		//this.add(lst.message).setBounds(6,28,61,16);
		this.add(lst.messsage11).setBounds(6,28,61,16);
		this.add(lst.messsage2).setBounds(6,346,61,16);
		this.add(lst.messsage3).setBounds(6,364,61,16);
		this.add(lst.messsage4).setBounds(6,380,61,16);
		this.add(lst.messsage5).setBounds(6,397,61,16);
		this.add(lst.messsage6).setBounds(6,416,61,16);
		
		this.add(lst.messsage7).setBounds(7,28,226,26);
		
		this.setVisible(true);
			}
		
	}
	class VendingM extends JPanel{
		public VendingM(A05Listeners lst) {
			layout(lst);
		}
		
		public void layout(A05Listeners lst) {
		this.setLayout(null);

		this.setBackground(Color.GRAY);
		this.setBounds(100, 100, 563, 550);
		
		lst.A0.setForeground(Color.YELLOW);
		lst.A0.setBounds(40, 91, 61, 16);
		this.add(lst.A0);
		lst.food1.setForeground(Color.RED);
		lst.food1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lst.food2.setForeground(Color.RED);
		lst.food2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lst.food3.setForeground(Color.RED);
		lst.food3.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food4.setForeground(Color.RED);
		lst.food4.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food5.setForeground(Color.RED);
		lst.food5.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food6.setForeground(Color.RED);
		lst.food6.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food7.setForeground(Color.RED);
		lst.food7.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food8.setForeground(Color.RED);
		lst.food8.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food9.setForeground(Color.RED);
		lst.food9.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food10.setForeground(Color.RED);
		lst.food10.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food11.setForeground(Color.RED);
		lst.food11.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food12.setForeground(Color.RED);
		lst.food12.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food13.setForeground(Color.RED);
		lst.food13.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food14.setForeground(Color.RED);
		lst.food14.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food15.setForeground(Color.RED);
		lst.food15.setHorizontalAlignment(SwingConstants.CENTER);
		lst.food16.setForeground(Color.RED);
		lst.food16.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(lst.food1).setBounds(23, 63, 61, 16);
		this.add(lst.food2).setBounds(160, 63, 61, 16);
		this.add(lst.food3).setBounds(301, 63, 61, 16);
		this.add(lst.food4).setBounds(443, 63, 61, 16);
		this.add(lst.food5).setBounds(23, 188, 61, 16);
		this.add(lst.food6).setBounds(161, 188, 61, 16);
		this.add(lst.food7).setBounds(301, 188, 61, 16);
		this.add(lst.food8).setBounds(443, 188, 61, 16);
		this.add(lst.food9).setBounds(23, 316, 61, 16);
		this.add(lst.food10).setBounds(23, 433, 61, 16);
		this.add(lst.food11).setBounds(161, 316, 61, 16);
		this.add(lst.food12).setBounds(161, 433, 61, 16);
		this.add(lst.food13).setBounds(301, 316, 61, 16);
		this.add(lst.food14).setBounds(301, 433, 61, 16);
		this.add(lst.food15).setBounds(443, 316, 61, 16);
		this.add(lst.food16).setBounds(443, 433, 61, 16);

		
		
	
		lst.A1.setForeground(Color.YELLOW);
		lst.A1.setBounds(180, 91, 61, 16);
		this.add(lst.A1);
		
		lst.A2.setForeground(Color.YELLOW);
		lst.A2.setBounds(322, 91, 61, 16);
		this.add(lst.A2);
		
		lst.A3.setForeground(Color.YELLOW);
		lst.A3.setBounds(464, 91, 61, 16);
		this.add(lst.A3);
		
		lst.B0.setForeground(Color.YELLOW);
		lst.B0.setBounds(40, 216, 61, 16);
		this.add(lst.B0);
		
		lst.B1.setForeground(Color.YELLOW);
		lst.B1.setBounds(179, 216, 61, 16);
		this.add(lst.B1);
		
		lst.B2.setForeground(Color.YELLOW);
		lst.B2.setBounds(322, 216, 61, 16);
		this.add(lst.B2);
		
		lst.B3.setForeground(Color.YELLOW);
		lst.B3.setBounds(464, 216, 61, 16);
		this.add(lst.B3);
		
		lst.C0.setForeground(Color.YELLOW);
		lst.C0.setBounds(40, 341, 61, 16);
		this.add(lst.C0);
		
		lst.C1.setForeground(Color.YELLOW);
		lst.C1.setBounds(179, 341, 61, 16);
		this.add(lst.C1);
		
		lst.C2.setForeground(Color.YELLOW);
		lst.C2.setBounds(322, 341, 61, 16);
		this.add(lst.C2);
		
		lst.C3.setForeground(Color.YELLOW);
		lst.C3.setBounds(464, 341, 61, 16);
		this.add(lst.C3);
		
		lst.D0.setForeground(Color.YELLOW);
		lst.D0.setBounds(40, 461, 61, 16);
		this.add(lst.D0);
		
		lst.D1.setForeground(Color.YELLOW);
		lst.D1.setBounds(179, 461, 61, 16);
		this.add(lst.D1);
		
		lst.D2.setForeground(Color.YELLOW);
		lst.D2.setBounds(322, 461, 61, 16);
		this.add(lst.D2);
		
		lst.D3.setForeground(Color.YELLOW);
		lst.D3.setBounds(464, 461, 61, 16);
		this.add(lst.D3);
		
		
		
		this.setVisible(true);
	}
		
	}
	class oneview extends JPanel{
		public keypad kView= null;
		public VendingM vView= null;
		public oneview(final A05Listeners model) {
			this.kView = new keypad(model);
			this.vView = new VendingM(model);
			this.layoutView();
			
			
		}
		private void layoutView() {
			this.setLayout(null);
			this.add(this.vView);
			this.add(this.kView);
			vView.setSize(0,100);
			vView.setBounds(250,50,600,550);
			kView.setBounds(00,50,250,700);
			//this.add(this.kView,BorderLayout.WEST);
			//this.add(this.vView, BorderLayout.EAST);
			

			
		}

		
	}