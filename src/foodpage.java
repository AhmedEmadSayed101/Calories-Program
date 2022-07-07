import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.ScrollPane;
import java.awt.Point;
import javax.swing.JMenuItem;
import java.awt.List;
import java.awt.TextArea;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class foodpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					foodpage frame = new foodpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public foodpage() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				loginpage l = new loginpage ();
				String x = l.usernamein.getText();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Fats");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Castellar", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(61, 11, 129, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Protein");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Castellar", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(367, 11, 177, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Carbohydrates");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Castellar", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(671, 13, 298, 48);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(foodpage.class.getResource("/image/PicsArt_12-23-09.18.17.png")));
		lblNewLabel_5.setBounds(142, 57, 72, 58);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(foodpage.class.getResource("/image/PicsArt_12-23-09.19.05.png")));
		lblNewLabel.setBounds(61, 57, 58, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(foodpage.class.getResource("/image/PicsArt_12-23-09.18.34.png")));
		lblNewLabel_2.setBounds(745, 57, 65, 58);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(foodpage.class.getResource("/image/PicsArt_12-23-09.18.50.png")));
		lblNewLabel_3.setBounds(855, 57, 83, 58);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(foodpage.class.getResource("/image/PicsArt_12-23-09.27.09.png")));
		lblNewLabel_4.setBounds(475, 57, 65, 58);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(foodpage.class.getResource("/image/PicsArt_12-23-09.18.17.png")));
		lblNewLabel_6.setBounds(377, 57, 72, 58);
		contentPane.add(lblNewLabel_6);
		
		TextArea fattext = new TextArea();
		fattext.setEditable(false);
		fattext.setBackground(SystemColor.activeCaption);
		fattext.setFont(new Font("Dialog", Font.BOLD, 18));
		fattext.setText("\r\nFastFood and Candy\r\n-----------------------------------\r\n\r\nArby\u2019s Grand Turkey Club\t1 sandwich (233 g)\t489 cal\r\nArby\u2019s Reuben\t1 sandwich (308 g)\t641 cal\r\nArby\u2019s Roast Beef Classic\t1 burger (154 g)\t360 cal\r\nArby\u2019s Roast Beef Max\t1 burger (154 g)\t360 cal\r\nBBQ Rib\t1 rib (67 g)\t142 cal\r\nBean Burrito\t1 burrito (190 g)\t380 cal\r\nBig N\u2019 Tasty\t1 sandwich (232 g)\t517 cal\r\nBratwurst\t1 piece (85 g)\t283 cal\r\nBurger King Angry Whopper\t1 burger (290 g)\t740 cal\r\nBurger King Double Whopper\t1 burger (374 g)\t894 cal\r\nBurger King Double Whopper with Cheese\t1 sandwich (399 g)\t994 cal\r\nBurger King Original Chicken Sandwich\t1 sandwich (219 g)\t659 cal\r\nBurger King Premium Alaskan Fish Sandwich\t1 burger (228 g)\t591 cal\r\nBurger King Triple Whopper\t1 burger (547 g)\t1471 cal\r\nBurger King Whopper\t1 burger (291 g)\t672 cal\r\nBurger King Whopper Jr.\t1 burger (148 g)\t346 cal\r\nBurger King Whopper with Cheese\t1 burger (315 g)\t759 cal\r\nCheeseburger\t1 burger (156 g)\t410 cal\r\nChicken Breast\t1 piece (71 g)\t116 cal\r\nChicken Fajita\t1 sandwich (222 g)\t326 cal\r\nChicken McNuggets\t1 nugget (16 g)\t48 cal\r\nChicken Nuggets\t1 piece (20 g)\t59 cal\r\nChicken Pizziola\t1 sandwich (320 g)\t451 cal\r\nChicken Sandwich\t1 sandwich (170 g)\t410 cal\r\nChicken Teriyaki Sandwich\t1 sandwich (266 g)\t367 cal\r\nChicken Wings\t1 piece (29 g)\t94 cal\r\nChop Suey\t1 serving (340 g)\t585 cal\r\nCurly Fries\t1 serving (128 g)\t398 cal\r\nDouble Cheeseburger\t1 burger (155 g)\t414 cal\r\nEgg Roll\t1 roll (80 g)\t200 cal\r\nFalafel\t1 patty (17 g)\t57 cal\r\nFilet-o-Fish\t1 sandwich (142 g)\t400 cal\r\nFish and Chips\t1 serving (300 g)\t585 cal\r\nFish Sandwich\t1 sandwich (158 g)\t431 cal\r\nFrench Fries\t1 serving (71 g)\t222 cal\r\nGrilled Chicken Salad\t1 salad (305 g)\t268 cal\r\nHam Sandwich\t1 sandwich (146 g)\t352 cal\r\nHamburger\t1 sandwich (110 g)\t279 cal\r\nHot Dog\t1 hot dog (116 g)\t312 cal\r\nItalian BMT\t1 sandwich (224 g)\t410 cal\r\nLasagna\t1 piece (130 g)\t172 cal\r\nMcDonald\u2019s Big Mac\t1 burger (219 g)\t561 cal\r\nMcDonald\u2019s Cheeseburger\t1 sandwich (114 g)\t300 cal\r\nMcDonald\u2019s Chicken Nuggets\t1 nugget (16 g)\t48 cal\r\nMcDonald\u2019s Double Cheeseburger\t1 burger (155 g)\t437 cal\r\nMcDonald\u2019s Filet-o-Fish\t1 sandwich (142 g)\t391 cal\r\nMcDonald\u2019s McChicken\t1 burger (143 g)\t359 cal\r\nMcDonald\u2019s McDouble\t1 burger (160 g)\t403 cal\r\nMcDonald\u2019s McMuffi Egg\t1 burger (129 g)\t290 cal\r\nMcDonald\u2019s McRib\t1 sandwich (170 g)\t451 cal\r\nMcDonald\u2019s Mighty Wings\t1 wing (31 g)\t95 cal\r\nMcRib\t1 sandwich (170 g)\t451 cal\r\nMeatball Sandwich\t1 sandwich (299 g)\t481 cal\r\nNachos with Cheese\t10 nachos (188 g)\t575 cal\r\nOnion Rings\t1 ring (6.5 g)\t25 cal\r\nPoutine\t1 serving (225 g)\t511 cal\r\nPizza                 ( 100g )         266 cal\r\nPasta                 ( 100g )         131cal\r\nSmoked Salmon\t1 oz. (28.35 g)\t44 cal\r\nSpicy Italian\t1 sandwich (219 g)\t480 cal\r\nSubway Club Sandwich\t1 sandwich (238 g)\t312 cal\r\nTortilla Wrap\t1 wrap (63 g)\t171 cal\r\nTuna\t1 oz. (28.35 g)\t24 cal\r\nTurkey\t1 oz. (28.35 g)\t29 cal\r\nVeggie Burger\t1 burger (215 g)\t389 cal\r\nVeggie Delight\t1 sandwich (166 g)\t229 cal\r\nVeggie Patty\t1 sandwich (247 g)\t963 cal\r\nWendy\u2019s Baconator\t1 burger (276 g)\t839 cal\r\nWendy\u2019s Jr. Bacon Cheeseburger\t1 burger (161 g)\t420 cal\r\nWendy\u2019s Jr. Cheeseburger\t1 burger (129 g)\t290 cal\r\nWendy\u2019s Son of Baconator\t1 burger (218 g)\t700 cal\r\nWhopper\t1 burger (291 g)\t672 cal\r\nZinger\t1 sandwich (202 g)\t517 cal\r\nZinger Burger\t1 sandwich (202 g)\t517 cal\r\n\r\n\r\nIce Cream            ( 100g )                     207 cal\r\nStrawberry Sundae\t1 sundae (178 g)\t281 cal\r\nSundae\t1 scoop (72 g)\t155 cal\r\nTurkey Hill\t1 sandwich (70 g)\t190 cal\r\nVanilla Cone\t1 cone (142 g)\t230 cal\r\nVanilla Ice Cream\t1 scoop (72 g)\t145 cal\r\nChocolate Cake           ( 100g )           537 cal\r\nApple Pie                 ( 100g )                296 cal\r\nSponge Cake             ( 100g )                 10 cal\r\nCheesecake              ( 100g )               257 cal\r\nWaffles                      ( 100g )               103 cal");
		fattext.setBounds(10, 121, 295, 326);
		contentPane.add(fattext);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBackground(SystemColor.activeCaption);
		textArea.setFont(new Font("Dialog", Font.BOLD, 18));
		textArea.setText("\r\nFruits and Vegetables\r\n-----------------------------------\r\n\r\nAcai\t1 oz. (28.35 g)\t20 cal\r\nApple\t1 apple (182 g)\t95 cal\r\nApplesauce\t1 cup (246 g)\t167 cal\r\nApricot\t1 apricot (35 g)\t17 cal\r\nAvocado\t1 avocado (200 g)\t320 cal\r\nBanana\t1 banana (125 g)\t111 cal\r\nBlackberries\t1 cup (144 g)\t62 cal\r\nBlood Oranges\t1 serving (140 g)\t70 cal\r\nBlueberries\t1 cup (148 g)\t84 cal\r\nCantaloupe\t1 wedge (69 g)\t23 cal\r\nCherries\t1 cherry (8 g)\t4 cal\r\nClementine\t1 clementine (74 g)\t35 cal\r\nCranberries\t1 cup (100 g)\t46 cal\r\nCurrants\t1 cup (112 g)\t63 cal\r\nCustard Apple\t1 custard apple (135 g)\t136 cal\r\nDates\t1 date (7.1 g)\t20 cal\r\nFigs\t1 fig (50 g)\t37 cal\r\nFruit salad\t1 cup (249 g)\t125 cal\r\nGrapes\t1 cup (151 g)\t104 cal\r\nGreengage\t1 fruit (5 g)\t2 cal\r\nGuava\t1 guava (55 g)\t37 cal\r\nJackfruit\t1 cup (151 g)\t143 cal\r\nJujube\t1 oz. (28.35 g)\t22 cal\r\nKiwi\t1 liwi (183 g)\t112 cal\r\nLemon\t1 lemon (58 g)\t17 cal\r\nLime\t1 lime (67 g)\t20 cal\r\nLychees\t1 lychee (10 g)\t7 cal\r\nMandarin Oranges\t1 mandarin orange (88 g)\t47 cal\r\nMango\t1 mango (336 g)\t202 cal\r\nMinneola\t1 minneola (109 g)\t70 cal\r\nMulberries\t1 cup (140 g)\t60 cal\r\nNectarine\t1 nectarine (150 g)\t66 cal\r\nOlives\t1 olive (2.7 g)\t2 cal\r\nOrange\t1 orange (131 g)\t62 cal\r\nPapaya\t1 fruit (500 g)\t215 cal\r\nPassion Fruit\t1 passoin fruit (18 g)\t17 cal\r\nPeach\t1 peach (150 g)\t59 cal\r\nPear\t1 pear (178 g)\t101 cal\r\nPersimmon\t1 fruit (25 g)\t32 cal\r\nPhysalis\t1 berry (5 g)\t2 cal\r\nPineapple\t1 pineapple (905 g)\t453 cal\r\nPlantains\t1 plantain (179 g)\t218 cal\r\nPlum\t1 plum (66 g)\t30 cal\r\nPomegranate\t1 pomegranate (282 g)\t234 cal\r\nQuince\t1 quince (92 g)\t52 cal\r\nRaisins\t1 cup (145 g)\t434 cal\r\nRambutan\t1 rambutan (9 g)\t7 cal\r\nRaspberries\t1 cup (123 g)\t64 cal\r\nRhubarb\t1 stalk (51 g)\t11 cal\r\nStarfruit\t1 star fruit (91 g)\t28 cal\r\nStrawberries\t1 cup (152 g)\t49 cal\r\nTamarind\t1 tamarind (2 g)\t5 cal\r\nTangerine\t1 tangerine (88 g)\t47 cal\r\nWatermelon\t1 wedge (286 g)\t86 cal\r\n\r\n\r\nArtichoke\t1 artichoke (128 g)\t60 cal\r\nArugula\t1 leaf (2 g)\t1 cal\r\nAsparagus\t1 spear (12 g)\t2 cal\r\nAubergine\t1 aubergine (458 g)\t115 cal\r\nBeetroot\t1 beet (82 g)\t35 cal\r\nBell Pepper\t1 pepper (73 g)\t15 cal\r\nBlack Olives\t1 olive (2.7 g)\t2 cal\r\nBroccoli\t1 bunch (608 g)\t207 cal\r\nBrussels Sprouts\t1 sprout (19 g)\t8 cal\r\nCabbage\t1 head (908 g)\t227 cal\r\nCapsicum\t1 pepper (45 g)\t12 cal\r\nCarrot\t1 carrot (61 g)\t25 cal\r\nCauliflower\t1 floweret (13 g)\t3 cal\r\nCelery\t1 stalk (40 g)\t6 cal\r\nChard\t1 leaf (48 g)\t9 cal\r\nCherry Tomato\t1 cherry tomato (20 g)\t20 cal\r\nChicory\t1 head (53 g)\t38 cal\r\nChinese Cabbage\t1 head (840 g)\t134 cal\r\nChives\t1 tbsp, chopped (3 g)\t1 cal\r\nCollard Greens\t1 cup, raw (36 g)\t12 cal\r\nCorn\t1 cup (154 g)\t562 cal\r\nCourgette\t1 courgette (196 g)\t33 cal\r\nCreamed Spinach\t1 cup (200 g)\t148 cal\r\nCucumber\t1 cucumber (410 g)\t66 cal\r\nEggplant\t1 eggplant (458 g)\t115 cal\r\nEndive\t1 head (513 g)\t87 cal\r\nFennel\t1 bulb (234 g)\t73 cal\r\nGarlic\t1 clove (3 g)\t4 cal\r\nGherkin\t1 gherkin (65 g)\t9 cal\r\nGourd\t1 gourd (771 g)\t108 cal\r\nGreen Beans\t1 cup (110 g)\t34 cal\r\nGreen Olives\t1 olive (2.7 g)\t2 cal\r\nGreen Onion\t1 green onion (15 g)\t5 cal\r\nHorseradish\t1 tbsp (15 g)\t7 cal\r\nKale\t1 cup, chopped (67 g)\t33 cal\r\nKohlrabi\t1 kohlrabi (400 g)\t108 cal\r\nKumara\t1 kumara (130 g)\t112 cal\r\nLeek\t1 leek (89 g)\t54 cal\r\nLettuce\t1 head (600 g)\t90 cal\r\nMushrooms\t1 mushroom (5.4 g)\t1 cal\r\nMustard Greens\t1 cup, chopped (56 g)\t15 cal\r\nNori\t1 sheet (2.6 g)\t1 cal\r\nOkra\t1 pod (12 g)\t4 cal\r\nOlives\t1 olive (2.7 g)\t2 cal\r\nOnion\t1 onion (85 g)\t34 cal\r\nParsnips\t1 parsnip (170 g)\t128 cal\r\nPeas\t1 cup (98 g)\t79 cal\r\nPepper\t1 pepper (75 g)\t20 cal\r\nPotato\t1 potato (213 g)\t164 cal\r\nPumpkin\t1 pumpkin (196 g)\t51 cal\r\nRadishes\t1 radish (4.5 g)\t1 cal\r\nRed Cabbage\t1 leaf (22 g)\t7 cal\r\nRutabaga\t1 rutabaga (386 g)\t147 cal\r\nShallots\t1 shallot (25 g)\t18 cal\r\nSpinach\t1 bunch (340 g)\t78 cal\r\nSquash\t1 squash (196 g)\t88 cal\r\nSweet Potato\t1 potato (130 g)\t112 cal\r\nTomato\t1 tomato (111 g)\t20 cal\r\nTurnip Greens\t1 turnip green (170 g)\t34 cal\r\nTurnips\t1 turnip (122 g)\t34 cal\r\nWasabi\t1 root (169 g)\t184 cal\r\nWinter Squash\t1 squash (431 g)\t147 cal\r\nZucchini\t1 zucchini (196 g)\t33 cal\r\n");
		textArea.setBounds(341, 121, 305, 326);
		contentPane.add(textArea);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setEditable(false);
		textArea_1.setBackground(SystemColor.activeCaption);
		textArea_1.setFont(new Font("Dialog", Font.BOLD, 18));
		textArea_1.setText("\r\nSome Drinks\r\n--------------------\r\n\r\nDiet Pepsi\t(100ml)\t0 cal\r\nPepsi\t(100ml)\t44 cal\r\nCoke\t(100ml)\t42 cal\r\nCoke Zero\t(100ml)\t0 cal\r\nDiet Coke\t(100ml)\t1 cal\r\nIce Tea\t(100ml)\t27 cal\r\nTea  unsweetened (12 ounces) 4 cal\r\nOrange juice, unsweetened (12 ounces) 157-168 cal\r\nApple juice, unsweetened (12 ounces) 169-175 cal\r\nWhole milk (12 ounces)  220 cal\r\n2% low-fat milk (12 ounces) 183 cal\r\n1% low-fat milk (12 ounces) 157 cal\r\nNonfat (skim) milk (12 ounces)  125 cal\r\nSoy milk (12 ounces)  147-191 cal\r\nCoffee, black (12 ounces)  0-4 cal\r\nCoffee with cream (12 ounces)  39-43 cal\r\nEnergy drink1 can (8.3 ounces) 105-112 cal\r\n\r\n1 ounce = 30 ml\r\n\r\nNo  Alcoholic Drinks Allah see you \uD83D\uDE4F\uD83D\uDCFF\uD83E\uDD32");
		textArea_1.setBounds(683, 121, 295, 326);
		contentPane.add(textArea_1);
		
		JLabel Welcome = new JLabel(" Welcome, in this page you will know more about your Food and Drinks. we will \r\n" );
		Welcome.setForeground(Color.WHITE);
		Welcome.setFont(new Font("Tahoma", Font.BOLD, 18));
		Welcome.setBounds(99, 443, 787, 48);
		contentPane.add(Welcome);
		
		JLabel lblNewLabel_7 = new JLabel("help you choose what you eat\r\n and make a program to achieve your goal.");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(156, 478, 702, 36);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\PicsArt_12-29-11.05.06.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main m = new main ();
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(882, 491, 118, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Eat Healthy ... live Healthy ^_^");
		lblNewLabel_8.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(367, 514, 258, 36);
		contentPane.add(lblNewLabel_8);
		
		JPanel back = new JPanel();
		back.setBackground(new Color(0, 0, 0, 130));
		back.setBounds(77, 449, 781, 90);
		contentPane.add(back);
		
		
		JLabel wallpaper = 
				new JLabel("");
		wallpaper.setBackground(SystemColor.inactiveCaption);
		wallpaper.setForeground(Color.WHITE);
		wallpaper.setFont(new Font("Castellar", Font.PLAIN, 11));
		wallpaper.setIcon(new ImageIcon(foodpage.class.getResource("/image/food2.jpg")));
		wallpaper.setBounds(0, -12, 1000, 551);
		contentPane.add(wallpaper);
	}
}
