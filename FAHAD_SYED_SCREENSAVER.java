// The "FAHAD_SYED_SCREENSAVER" class.1
import java.awt.*;
import hsa.Console;

public class FAHAD_SYED_SCREENSAVER
{
    static Console c;           // The output console

    final static int coin1Xpos = 200;
    final static int coin1Ypos = 70;
    final static int coin2Xpos = 300;
    final static int coin2Ypos = 70;
    final static int star1Xpos = 400;
    final static int star1Ypos = 70;
    final static int turn1Xpos = 500;
    final static int turn1Ypos = 70;
    //Vertical Coins
    final static int coin4Xpos = 525;
    final static int coin4Ypos = 120;
    final static int coin5Xpos = 525;
    final static int coin5Ypos = 220;
    final static int star2Xpos = 525;
    final static int star2Ypos = 320;
    final static int turn2Xpos = 525;
    final static int turn2Ypos = 420;
    //Horizontal left
    final static int coin7Xpos = 400;
    final static int coin7Ypos = 430;
    final static int coin8Xpos = 300;
    final static int coin8Ypos = 430;
    final static int coin9Xpos = 220;
    final static int coin9Ypos = 350;
    final static int coin10Xpos = 220;
    final static int coin10Ypos = 250;
    final static int coin11Xpos = 220;
    final static int coin11Ypos = 150;
    final static int NUMBER_OF_COLORS = 255;

    public static void main (String[] args) throws Exception //throws Exception is used to allow Thread.sleep /=123***************************************
    {
	c = new Console ();
	int maxxval = c.getWidth ();
	int maxyval = c.getHeight ();
	int firstangleMove = 0; //This is the variable that causes the first angle in Pacmans arc to increase/decrease.
	int secondangleMove = 0; //This is the variable that causes the second angle in Pacmans arc to increase/decrease.
	int xpacmanMove = 0; //The variable that alters to change Pacmans position during Motion 1.
	int ypacmanMove = 0; //The variable that alters to change Pacmans position during Motion 2.
	int xpacmanMove2 = 0; //The variable that alters to change Pacmans position during Motion 3.
	int ypacmanMove2 = 0; //The variable that alters to change Pacmans position during Motion 4.
	int coinRotate = 0; //Varaible that causes the coin to increase/decrease width.
	int coinSwitchCounter = 0; //This is the counter that alters the if statements for the coin/object spinning.
	int mouthSwitchCounter = 0; //The variable that causes Pacmans mouth to open/close. (For if statements).
	int ghostswitchCounter = 0; //The counter that causes the first ghost to move side to side.
	int ghostswitchCounter2 = 0; //The counter that causes the second ghost to move side to side.
	int ghostyswitchCounter = 0; //The counter that causes the first ghost to move up and down.
	int ghostyswitchCounter2 = 0; //The counter that causes the second ghost to move up and down.
	int ghostx = 0; //This is the initial x movement for the first ghost.
	int ghosty = 0; //This is the initial y movement for the first ghost.
	int ghost2x = 0; //This is the initial x movement for the second ghost.
	int ghost2y = 0; //This is the initial y movement for the second ghost.
	int ghostspeed = 5; //This determines how fast the ghosts move, this is the interval as which their shape moves.
	int lifeTaken = 0;
	int lifeTakenChange = 1;
	//==============Overview=======
	//This screensaver shows Pacman moving through a preset path, in which he eats coins and stars which give him addiiton points. At the end,
	//the blue ghost touches Pacman at which point he dies and the screensaver loops, and one life is taken off. Once three lives have been taken off,
	//three lives are added.
	//====================Contents=====================
	//1...........................Overview for Movement
	//2..............................First Motion Right
	//2......................Overview for Coin movement
	//3..............................Second Motion Down
	//4...............................Third Motion Left
	//5................................Fourth Motion Up
	//6...................................Coins/Objects
	//7.............Blue ghost intersection with Pacman
	//8................................Screensaver loop
	//9..................................Ghost Movement
	//9...................................If statements
	//10................................Lives Indicator
	//10..................................If statements


	while (true)
	{
	    //=============================================================Overview for Movement=====================================================================
	    //I will make pacmans position change by using xpacmanMove, which increases.
	    //For the opening and closing of the mouth I will have the values of the angle of the arc decrease until Pacman is a full oval, then have it decrease
	    //to what it was previously.
	    if (mouthSwitchCounter == 0) //Since mouthSwitchCounter is 0, it will run this first, this is the if statement that causes his mouth to close.
	    {
		firstangleMove = firstangleMove + 5; //now the 45 will decrease by a value of 5 more every time.
		secondangleMove = secondangleMove + 10; //now secondfirstangleMove will increase by a value of 10 every time. Double the increment of firstangleMove for aesthetic reasons.
		if (firstangleMove == 45 && secondangleMove == 90) //When firstangleMove and secondfirstangleMove reach a certain value, it makes mouthSwitchCounter equal to 1.
		{
		    mouthSwitchCounter = 1;
		}
	    }

	    if (mouthSwitchCounter == 1) //Since the first if statement switched the value of mouthSwitchCounter to 1, it will run this if statement now, and not the first one.
	    {

		firstangleMove = firstangleMove - 5; //the values decrease because subtracting a negative number makes it add that same number.
		secondangleMove = secondangleMove - 10;
		if (firstangleMove == 0 && secondangleMove == 0)
		{
		    mouthSwitchCounter = 0; //Now that mouthSwitchCounter is 0, it will play the other if statement and not this one.
		}
	    }
	    //System.out.println (firstangleMove);

	    //=============================================================Motion 1 Horizontal Right=====================================================================
	    if (xpacmanMove <= turn1Xpos) //As long as pacman does not reach the first star.
	    {
		xpacmanMove = xpacmanMove + 10; //Variable increases by 10 every time.
		//Design and Esthetics.
		//I am keeping all of the design codes inside of the motion if statements because otherwise it looks choppy.
		c.setColor (Color.black);
		c.fillRect (0, 0, maxxval, maxyval);
		c.setColor (Color.red);
		int[] xPoints = {200, 200, 210, 210, 220, 220};
		int[] yPoints = {10, 50, 50, 30, 30, 10};
		c.fillPolygon (xPoints, yPoints, 6);
		c.setColor (Color.blue);
		c.fillRect (205, 15, 10, 10);
		c.setColor (Color.red);
		int[] xPoints1 = {225, 225, 245, 245, 240, 240};
		int[] yPoints1 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints1, yPoints1, 6);
		c.setColor (Color.blue);
		c.fillRect (230, 40, 5, 5);
		c.fillArc (250, 30, 20, 20, 45, 270);
		c.setColor (Color.red);
		c.fillRect (275, 30, 5, 20);
		c.fillRect (300, 30, 5, 20);
		int[] xPoints2 = {275, 290, 305};
		int[] yPoints2 = {30, 40, 30};
		c.fillPolygon (xPoints2, yPoints2, 3);
		c.setColor (Color.red);
		int[] xPoints3 = {315, 315, 335, 335, 330, 330};
		int[] yPoints3 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints3, yPoints3, 6);
		c.setColor (Color.blue);
		c.fillRect (320, 40, 5, 5);

		//Motion
		c.setColor (Color.yellow); //Pacman
		c.fillArc (xpacmanMove, 55, 60, 60, 45 - firstangleMove, 270 + secondangleMove);
		c.setColor (Color.black); //His eye
		c.fillOval (30 + xpacmanMove, 60, 10, 10);
		//If statements that cause Pacmans movement.

		//=============================================================Overview for Coin spinning=====================================================================
		//I will have the width of the coin decrease until it reaches 0, then have it increase back up to what it was previously.
		//If statements that cause objects to rotate.
		if (coinSwitchCounter == 0)
		{
		    coinRotate++; //values icnrease by 1 every time.
		    if (coinRotate == 20) //Once the width of the Oval reaches 0, it switches coinSwitchCounter to 1.
		    {
			coinSwitchCounter = 1;
		    }
		}
		if (coinSwitchCounter == 1) //Now that coinSwitchCounter is 1, it follows out this if statement.
		{
		    coinRotate--; //The value of coinRotate decreases from 20 by a value of 1 every time, so the width subtracts one less each time, making it appear to open.
		    if (coinRotate == 0) //When coinRotate is 0, it means the width is back to 20.
		    {
			coinSwitchCounter = 0; //Now that the width is back to 20, it will follow out the other If statement, causing the mouth to close.
		    }
		}

	    } //If statement end for xpacmanMove <=turn1Xpos

	    //At this point, Pacman is done reaching the first star, so this if statement ends and another one is used.
	    //=============================================================Motion 2 Vertical Down=====================================================================

	    if (xpacmanMove >= turn1Xpos && ypacmanMove + 55 <= turn2Ypos) //After he reaches the first star, and before he reaches the second.
	    {
		ypacmanMove = ypacmanMove + 10; //Moves slower, but eats faster once he reaches the first star.
		ghostspeed = 5; //Once he reaches the first star, it causes everything to move slower.
		//Design and Esthethics.
		c.setColor (Color.black);
		c.fillRect (0, 0, maxxval, maxyval);
		c.setColor (Color.orange);
		int[] xPoints4 = {200, 200, 210, 210, 220, 220};
		int[] yPoints4 = {10, 50, 50, 30, 30, 10};
		c.fillPolygon (xPoints4, yPoints4, 6);
		c.setColor (Color.red);
		c.fillRect (205, 15, 10, 10);
		c.setColor (Color.orange);
		int[] xPoints5 = {225, 225, 245, 245, 240, 240};
		int[] yPoints5 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints5, yPoints5, 6);
		c.setColor (Color.red);
		c.fillRect (230, 40, 5, 5);
		c.fillArc (250, 30, 20, 20, 45, 270);
		c.setColor (Color.orange);
		c.fillRect (275, 30, 5, 20);
		c.fillRect (300, 30, 5, 20);
		int[] xPoints6 = {275, 290, 305};
		int[] yPoints6 = {30, 40, 30};
		c.fillPolygon (xPoints6, yPoints6, 3);
		c.setColor (Color.orange);
		int[] xPoints7 = {315, 315, 335, 335, 330, 330};
		int[] yPoints7 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints7, yPoints7, 6);
		c.setColor (Color.red);
		c.fillRect (320, 40, 5, 5);

		//Motion
		c.setColor (Color.yellow);
		c.fillArc (turn1Xpos, 55 + ypacmanMove, 60, 60, -45 - firstangleMove, 270 + secondangleMove); //Starts where the first star was.
		c.setColor (Color.black);
		c.fillOval (turn1Xpos + 45, 90 + ypacmanMove, 10, 10);

		//If statements that cause objects to rotate.
		if (coinSwitchCounter == 0)
		{
		    coinRotate++;
		    if (coinRotate == 20)
		    {
			coinSwitchCounter = 1;
		    }
		}
		if (coinSwitchCounter == 1)
		{
		    coinRotate--;
		    if (coinRotate == 0)
		    {
			coinSwitchCounter = 0;
		    }
		}
	    } //If statement second
	    //System.out.println (ghostspeed);
	    //=============================================================Motion 3 Horiontal Left=====================================================================
	    if (ypacmanMove + 55 >= turn2Ypos && xpacmanMove2 <= 300) //Once pacman touches the second star, follow this out.
	    {
		xpacmanMove2 = xpacmanMove2 + 10;
		ghostspeed = 5;

		//Design
		c.setColor (Color.black);
		c.fillRect (0, 0, maxxval, maxyval);
		c.setColor (Color.white);
		int[] xPoints8 = {200, 200, 210, 210, 220, 220};
		int[] yPoints8 = {10, 50, 50, 30, 30, 10};
		c.fillPolygon (xPoints8, yPoints8, 6);
		c.setColor (Color.blue);
		c.fillRect (205, 15, 10, 10);
		c.setColor (Color.white);
		int[] xPoints9 = {225, 225, 245, 245, 240, 240};
		int[] yPoints9 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints9, yPoints9, 6);
		c.setColor (Color.blue);
		c.fillRect (230, 40, 5, 5);
		c.fillArc (250, 30, 20, 20, 45, 270);
		c.setColor (Color.white);
		c.fillRect (275, 30, 5, 20);
		c.fillRect (300, 30, 5, 20);
		int[] xPoints10 = {275, 290, 305};
		int[] yPoints10 = {30, 40, 30};
		c.fillPolygon (xPoints10, yPoints10, 3);
		c.setColor (Color.white);
		int[] xPoints11 = {315, 315, 335, 335, 330, 330};
		int[] yPoints11 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints11, yPoints11, 6);
		c.setColor (Color.blue);
		c.fillRect (320, 40, 5, 5);

		c.setColor (Color.yellow);
		c.fillArc (turn1Xpos - xpacmanMove2, turn2Ypos, 60, 60, 135 + firstangleMove, -270 - secondangleMove); //Starts where the first star was.
		c.setColor (Color.black);
		c.fillOval (turn1Xpos + 15 - xpacmanMove2, turn2Ypos + 10, 10, 10);

		//If statements that cause objects to rotate.
		if (coinSwitchCounter == 0)
		{
		    coinRotate++;
		    if (coinRotate == 20)
		    {
			coinSwitchCounter = 1;
		    }
		}
		if (coinSwitchCounter == 1)
		{
		    coinRotate--;
		    if (coinRotate == 0)
		    {
			coinSwitchCounter = 0;
		    }
		}


	    } //If statement end for motion 3 horizontal left.
	    //=============================================================Motion 4 Vertical Up=====================================================================
	    if (xpacmanMove2 >= 300 && ghosty + 150 <= coin8Ypos - ypacmanMove2)
	    {
		ypacmanMove2 = ypacmanMove2 + 10;
		//Design
		c.setColor (Color.black);
		c.fillRect (0, 0, maxxval, maxyval);
		c.setColor (Color.red);
		int[] xPoints12 = {200, 200, 210, 210, 220, 220};
		int[] yPoints12 = {10, 50, 50, 30, 30, 10};
		c.fillPolygon (xPoints12, yPoints12, 6);
		c.setColor (Color.blue);
		c.fillRect (205, 15, 10, 10);
		c.setColor (Color.red);
		int[] xPoints13 = {225, 225, 245, 245, 240, 240};
		int[] yPoints13 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints13, yPoints13, 6);
		c.setColor (Color.blue);
		c.fillRect (230, 40, 5, 5);
		c.fillArc (250, 30, 20, 20, 45, 270);
		c.setColor (Color.red);
		c.fillRect (275, 30, 5, 20);
		c.fillRect (300, 30, 5, 20);
		int[] xPoints14 = {275, 290, 305};
		int[] yPoints14 = {30, 40, 30};
		c.fillPolygon (xPoints14, yPoints14, 3);
		c.setColor (Color.red);
		int[] xPoints15 = {315, 315, 335, 335, 330, 330};
		int[] yPoints15 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints15, yPoints15, 6);
		c.setColor (Color.blue);
		c.fillRect (320, 40, 5, 5);

		//Motion Up
		c.setColor (Color.yellow);
		c.fillArc (200, coin8Ypos - ypacmanMove2, 60, 60, 45 + firstangleMove, -270 - secondangleMove); //Starts where the first star was.
		c.setColor (Color.black);
		c.fillOval (240, coin8Ypos + 20 - ypacmanMove2, 10, 10);

		//If statements that cause objects to rotate.
		if (coinSwitchCounter == 0)
		{
		    coinRotate++;
		    if (coinRotate == 20)
		    {
			coinSwitchCounter = 1;
		    }
		}
		if (coinSwitchCounter == 1)
		{
		    coinRotate--;
		    if (coinRotate == 0)
		    {
			coinSwitchCounter = 0;
		    }
		}
	    } //If statement end motion 4
	    //=============================================================Ghost intersection with Pacman==============================================================
	    if (ghosty + 150 >= coin8Ypos - ypacmanMove2) //Once the blue ghost has greater y value than Pacman.
	    {
		ghostspeed = 0;
		mouthSwitchCounter = 0;
		//Design
		c.setColor (Color.black);
		c.fillRect (0, 0, maxxval, maxyval);
		c.setColor (Color.red);
		int[] xPoints16 = {200, 200, 210, 210, 220, 220};
		int[] yPoints16 = {10, 50, 50, 30, 30, 10};
		c.fillPolygon (xPoints16, yPoints16, 6);
		c.setColor (Color.blue);
		c.fillRect (205, 15, 10, 10);
		c.setColor (Color.red);
		int[] xPoints17 = {225, 225, 245, 245, 240, 240};
		int[] yPoints17 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints17, yPoints17, 6);
		c.setColor (Color.blue);
		c.fillRect (230, 40, 5, 5);
		c.fillArc (250, 30, 20, 20, 45, 270);
		c.setColor (Color.red);
		c.fillRect (275, 30, 5, 20);
		c.fillRect (300, 30, 5, 20);
		int[] xPoints18 = {275, 290, 305};
		int[] yPoints18 = {30, 40, 30};
		c.fillPolygon (xPoints18, yPoints18, 3);
		c.setColor (Color.red);
		int[] xPoints19 = {315, 315, 335, 335, 330, 330};
		int[] yPoints19 = {35, 50, 50, 45, 45, 35};
		c.fillPolygon (xPoints19, yPoints19, 6);
		c.setColor (Color.blue);
		c.fillRect (320, 40, 5, 5);
		//Game
		c.setColor (Color.red);
		c.fillRect (300, 200, 25, 5);
		c.fillRect (300, 200, 5, 25);
		c.fillRect (300, 225, 25, 5);
		c.fillRect (312, 212, 10, 5);
		c.fillRect (320, 212, 5, 13);
		c.setColor (Color.red);
		int[] xPoints20 = {335, 335, 355, 355, 350, 350};
		int[] yPoints20 = {135 + 80, 150 + 80, 150 + 80, 145 + 80, 145 + 80, 135 + 80};
		c.fillPolygon (xPoints20, yPoints20, 6);
		c.setColor (Color.white);
		c.fillRect (340, 140 + 80, 5, 5);
		c.setColor (Color.red);
		c.fillRect (365, 210, 5, 20);
		c.fillRect (390, 210, 5, 20);
		int[] xPoints21 = {365, 380, 395};
		int[] yPoints21 = {210, 220, 210};
		c.fillPolygon (xPoints21, yPoints21, 3);
		c.fillRect (400, 215, 15, 5);
		c.fillRect (400, 205, 25, 5);
		c.fillRect (400, 225, 25, 5);
		c.fillRect (400, 205, 5, 20);
	    
		//System.out.println (ypacmanMove2);
		//In order to find out where I need to display the motion for pacman, i needed to find out where the blue ghost and Pacman intersected.
		//I did this by printing out ypacmanMove2, and by oberving where it stays the same, i knew that that was when the ghost touched pacman.
		//Then I took that value (165) and subtracted it from the y value at which pacman was it before he touched the ghost.

		//Motion
		c.setColor (Color.yellow);
		c.fillArc (200, coin8Ypos - ypacmanMove2, 60, 60, 45 - firstangleMove, -270 + secondangleMove); //Starts where the first star was.

		//Motion if statements that cause him to die.
		//System.out.println (mouthSwitchCounter);
		if (mouthSwitchCounter == 0)
		{
		    firstangleMove = firstangleMove + 5;
		    secondangleMove = secondangleMove + 10;
		    if (secondangleMove == 270) //If secondangleMove is 270, then Pacman is dead. Once that it done, I repeat the screensaver by setting everything to its initial value.
		    {
			firstangleMove = 0; //This is the variable that causes the first angle in Pacmans arc to increase/decrease.
			secondangleMove = 0; //This is the variable that causes the second angle in Pacmans arc to increase/decrease.
			xpacmanMove = 0;
			xpacmanMove2 = 0;
			ypacmanMove = 0;
			ypacmanMove2 = 0;
			coinRotate = 0;
			coinSwitchCounter = 0;
			mouthSwitchCounter = 0;
			ghostswitchCounter = 0;
			ghostswitchCounter2 = 0;
			ghostyswitchCounter = 0;
			ghostyswitchCounter2 = 0;
			ghostx = 0;
			ghosty = 0;
			ghost2x = 0;
			ghost2y = 0;
			ghostspeed = 5;
			lifeTaken = lifeTakenChange; //This determines how many lives to display at the top, it is used in the section Pacman Lives Indicator below.
		    }
		}

	    }


	    //=============================================================Coins and Stars=====================================================================
	    c.setColor (Color.yellow);
	    if (xpacmanMove + 60 <= coin1Xpos) //+ 60 because Pacmans width is 60.
	    {
		c.fillOval (coin1Xpos, coin1Ypos, 20 - coinRotate, 20); //First Coin=
	    }
	    if (xpacmanMove + 60 > coin1Xpos && xpacmanMove + 60 < coin2Xpos) //The reason I made it less than instead of less than or equal to is because of aesthetic reasons, So that they appear one at a time, all the time.
	    {
		c.print ("Score:1"); //Score 1 Display
	    }
	    if (xpacmanMove + 60 <= coin2Xpos)
	    {
		c.fillOval (coin2Xpos, coin2Ypos, 20 - coinRotate, 20); //Second Coin=
	    }
	    if (xpacmanMove + 60 > coin2Xpos && xpacmanMove + 60 < star1Xpos)
	    {
		c.print ("Score:2");  //Score 2 Display
	    }
	    c.setColor (Color.pink);
	    if (xpacmanMove + 60 <= star1Xpos)
	    {
		c.fillStar (star1Xpos, star1Ypos, 20 - coinRotate, 20); //First star=
	    }
	    if (xpacmanMove + 60 > star1Xpos && ypacmanMove + 110 < coin4Ypos)
	    {
		c.print ("Score:7 Bonus!");  //Score 3 Display
	    }
	    c.setColor (Color.yellow);
	    if (ypacmanMove + 110 <= coin4Ypos) // + 110 because 60 for his width, and 50 for his initial y position.
	    {
		c.fillOval (coin4Xpos, coin4Ypos, 20 - coinRotate, 20); //Fourth Coin=
	    }
	    if (ypacmanMove + 110 > coin4Ypos && ypacmanMove + 110 < coin5Ypos)
	    {
		c.print ("Score:8"); //Score 4 Display
	    }
	    if (ypacmanMove + 110 <= coin5Ypos)
	    {
		c.fillOval (coin5Xpos, coin5Ypos, 20 - coinRotate, 20); //Fifth Coin=
	    }
	    if (ypacmanMove + 110 > coin5Ypos && ypacmanMove + 110 < star2Ypos)
	    {
		c.print ("Score:9");  //Score 5 Display
	    }
	    c.setColor (Color.pink);
	    if (ypacmanMove + 110 <= star2Ypos)
	    {
		c.fillStar (star2Xpos, star2Ypos, 20 - coinRotate, 20); //Second Star
	    }
	    if (ypacmanMove + 110 > star2Ypos && xpacmanMove2 < 80)
	    {
		c.print ("Score:14 Bonus!");  //Score 6 Display
	    }

	    c.setColor (Color.yellow);
	    if (xpacmanMove2 <= 80) //The distance it takes for Pacman to reach the extent of the 7th coin.
	    {
		c.fillOval (coin7Xpos, coin7Ypos, 20 - coinRotate, 20); //Seventh Coin=
	    }
	    if (xpacmanMove2 > 80 && xpacmanMove2 < 180)
	    {
		c.print ("Score:15"); //Score 7 Display
	    }
	    if (xpacmanMove2 <= 180)
	    {
		c.fillOval (coin8Xpos, coin8Ypos, 20 - coinRotate, 20); //Eighth Coin=
	    }
	    if (xpacmanMove2 > 180 && coin8Ypos - ypacmanMove2 > coin9Ypos + 20)
	    {
		c.print ("Score:16"); //Score 8 Display
	    }
	    if (coin8Ypos - ypacmanMove2 >= coin9Ypos + 20)
	    {
		c.fillOval (coin9Xpos, coin9Ypos, 20 - coinRotate, 20); //Ninth Coin=
	    }
	    if (coin8Ypos - ypacmanMove2 < coin9Ypos + 20 && coin8Ypos - ypacmanMove2 > coin10Ypos + 20)
	    {
		c.print ("Score:17"); //Score 9 Display
	    }
	    if (coin8Ypos - ypacmanMove2 >= coin10Ypos + 20)
	    {
		c.fillOval (coin10Xpos, coin10Ypos, 20 - coinRotate, 20); //Tenth Coin =
	    }
	    if (coin8Ypos - ypacmanMove2 < coin10Ypos + 20 && coin8Ypos - ypacmanMove2 > coin11Ypos + 20)
	    {
		  c.print ("Score:18"); //Score 10 Display
	    }
	    if (coin8Ypos - ypacmanMove2 >= coin11Ypos + 20)
	    {
		c.fillOval (coin11Xpos, coin11Ypos, 20 - coinRotate, 20); //Eleventh Coin=
	    }
	    //=============================================================BOTH GHOST MOVEMENTS=====================================================================
	    //Blue Ghost design
	    c.setColor (Color.blue);
	    c.fillArc (200 + ghostx, 100 + ghosty, 50, 50, 0, 180);
	    c.fillRect (200 + ghostx, 120 + ghosty, 50, 20);
	    c.setColor (Color.blue);
	    int[] xPoints15 = {200 + ghostx, 200 + ghostx, 210 + ghostx, 225 + ghostx, 240 + ghostx, 250 + ghostx, 250 + ghostx};
	    int[] yPoints15 = {140 + ghosty, 150 + ghosty, 140 + ghosty, 150 + ghosty, 140 + ghosty, 150 + ghosty, 140 + ghosty};
	    c.fillPolygon (xPoints15, yPoints15, 7);
	    c.setColor (Color.white);
	    c.fillOval (210 + ghostx, 115 + ghosty, 15, 15);
	    c.fillOval (230 + ghostx, 115 + ghosty, 15, 15);
	    c.setColor (Color.blue);
	    c.fillOval (215 + ghostx, 120 + ghosty, 8, 8);
	    c.fillOval (235 + ghostx, 120 + ghosty, 8, 8);

	    //Red Ghost design.
	    c.setColor (Color.red);
	    c.fillArc (400 + ghost2x, 200 + ghost2y, 50, 50, 0, 180);
	    c.fillRect (400 + ghost2x, 220 + ghost2y, 50, 20);
	    c.setColor (Color.red);
	    int[] xPoints16 = {400 + ghost2x, 400 + ghost2x, 410 + ghost2x, 425 + ghost2x, 440 + ghost2x, 450 + ghost2x, 450 + ghost2x};
	    int[] yPoints16 = {240 + ghost2y, 250 + ghost2y, 240 + ghost2y, 250 + ghost2y, 240 + ghost2y, 250 + ghost2y, 240 + ghost2y};
	    c.fillPolygon (xPoints16, yPoints16, 7);
	    c.setColor (Color.white);
	    c.fillOval (410 + ghost2x, 215 + ghost2y, 15, 15);
	    c.fillOval (430 + ghost2x, 215 + ghost2y, 15, 15);
	    c.setColor (Color.red);
	    c.fillOval (415 + ghost2x, 220 + ghost2y, 8, 8);
	    c.fillOval (435 + ghost2x, 220 + ghost2y, 8, 8);

	    //First Ghost If statements.
	    if (ghostswitchCounter == 0) //Since ghostswitchCounter was initially set as 0, it will play this if statement first.
	    {
		ghostx = ghostx + ghostspeed; //now ghostx increases by the value of ghostspeed (which was set as 5 initially), this makes it look as if the ghost moves to right and also determines how fast they move.
		if (ghostx == 50) //Once ghostx reaches a value of 50, it switches ghostswitchCounter to 1.
		{
		    ghostswitchCounter = 1;

		}

	    }

	    if (ghostswitchCounter == 1) //Now that ghostswitchCounter =1, it will play this if statement.
	    {
		ghostx = ghostx - ghostspeed; //now the value of ghostx decreases by 5 every time, so it will look like (50,45,40,etc..) This makes it look as if the ghost is moving left.
		if (ghostx == -50)
		{
		    ghostswitchCounter = 0;
		}
	    }


	    if (ghostyswitchCounter == 0) //============================================================================================================================
	    {
		ghosty = ghosty + ghostspeed;
		if (ghosty == 200)
		{
		    ghostyswitchCounter = 1;
		}


	    }
	    if (ghostyswitchCounter == 1)
	    {
		ghosty = ghosty - ghostspeed;
		if (ghosty == 0)
		{
		    ghostyswitchCounter = 0;
		}



	    }

	    //Second Ghost if statements.
	    if (ghostswitchCounter2 == 0)
	    {
		ghost2x = ghost2x + ghostspeed;
		if (ghost2x == 50)
		{
		    ghostswitchCounter2 = 1;
		}

	    }

	    if (ghostswitchCounter2 == 1)
	    {
		ghost2x = ghost2x - ghostspeed;
		if (ghost2x == -50)
		{
		    ghostswitchCounter2 = 0;
		}
	    }


	    if (ghostyswitchCounter2 == 0)
	    {
		ghost2y = ghost2y + ghostspeed;
		if (ghost2y == 100)
		{
		    ghostyswitchCounter2 = 1;
		}


	    }
	    if (ghostyswitchCounter2 == 1)
	    {
		ghost2y = ghost2y - ghostspeed;
		if (ghost2y == 0)
		{
		    ghostyswitchCounter2 = 0;
		}



	    }
	    //================================================================Pacman Lives Indicator=================================================
	    c.setColor (Color.yellow);
	    if (lifeTaken == 0)
	    {
		c.fillArc (50, 30, 20, 20, 45, 270);
		c.fillArc (80, 30, 20, 20, 45, 270);
		c.fillArc (110, 30, 20, 20, 45, 270);
	    }
	    if (lifeTaken == 1)
	    {
		c.fillArc (50, 30, 20, 20, 45, 270);
		c.fillArc (80, 30, 20, 20, 45, 270);
		lifeTakenChange = 2; //Now lifeTaken has increased to two, since (lifeTaken = lifeTakenChange)

	    }
	    if (lifeTaken == 2)
	    {
		c.fillArc (50, 30, 20, 20, 45, 270);
		lifeTakenChange = 0; //Now it repeats the number of lives played by making the number of lives taken 0 and follows out another if statement.

	    }

	    Thread.sleep (50); //This is the time between the intervals.
	    c.clear (); //This is used to clear all of the motions, and only display the current one.
	} //While loop end from start.


	// Place your program here.  'c' is the output console
    } // main method
} // FAHAD_SYED_SCREENSAVER class
