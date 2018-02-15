import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Valentine {
	public static void main(String[] args) {
		Robot l = new Robot();
		Robot r = new Robot();
		Robot s = new Robot();
		Robot d = new Robot();
		s.hide();
		d.hide();
		l.hide();
		r.hide();
		int e = new Random().nextInt(3);
		if (e == 0) {
			one(l, r);
		}
		if (e == 1) {
			two(l, r, s, d);
		}
		if (e == 2) {
			three(l, r);
		}
		if (e == 3) {
			four(l, r);
		}

	}

	private static void drawHeart(Robot l, Robot r) {
		for (int i = 0; i < 70; i++) {
			l.turn(-3);
			l.move(3);
			r.turn(3);
			r.move(3);
		}

		for (int i = 0; i < 71; i++) {
			l.move(3);
			r.move(3);
		}
	}

	private static void one(Robot l, Robot r) {
		l.setY(100);
		Robot.setWindowImage("one.jpg");
		r.setPenColor(Color.RED);
		l.setPenColor(Color.RED);
		l.setPenWidth(5);
		r.setPenWidth(5);
		r.setY(100);
		r.hide();
		l.hide();
		r.penDown();
		l.penDown();
		r.setSpeed(100);
		l.setSpeed(100);

		drawHeart(l, r);
	}

	private static void two(Robot l, Robot r, Robot s, Robot d) {

		Robot.setWindowImage("two.png");
		l.setPenColor(Color.PINK);
		r.setPenColor(Color.PINK);
		r.setX(760);
		l.setX(760);
		l.setPenWidth(5);
		r.setPenWidth(5);
		l.setY(100);
		r.setY(100);
		l.hide();
		r.hide();
		l.penDown();
		r.penDown();
		l.setSpeed(100);
		r.setSpeed(100);

		s.setPenColor(Color.PINK);
		d.setPenColor(Color.PINK);
		d.setX(130);
		s.setX(130);
		s.setPenWidth(5);
		d.setPenWidth(5);
		s.setY(100);
		d.setY(100);
		s.hide();
		d.hide();
		s.penDown();
		d.penDown();
		s.setSpeed(100);
		d.setSpeed(100);
		drawHeart(d, s);
		drawHeart(r, l);
	}

	private static void three(Robot l, Robot r) {
		l.setY(100);
		Robot.setWindowImage("three.jpg");
		l.setPenColor(Color.BLACK);
		r.setPenColor(Color.BLACK);
		r.setX(760);
		l.setX(760);
		l.setPenWidth(5);
		r.setPenWidth(5);
		l.setY(300);
		r.setY(300);
		l.hide();
		r.hide();
		l.penDown();
		r.penDown();
		l.setSpeed(100);
		r.setSpeed(100);

		drawHeart(r, l);
	}

	private static void four(Robot l, Robot r) {
		l.setY(230);
		Robot.setWindowImage("four.png");
		r.setPenColor(Color.RED);
		l.setPenColor(Color.RED);
		l.setPenWidth(5);
		r.setPenWidth(5);
		r.setY(230);
		r.hide();
		l.hide();
		r.penDown();
		l.penDown();
		r.setSpeed(100);
		l.setSpeed(100);

		drawHeart(r, l);
	}

}
