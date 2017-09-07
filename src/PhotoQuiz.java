
 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String image="https://i.ytimg.com/vi/SfLV8hD7zX4/maxresdefault.jpg";
// 2. create a variable of type "Component" that will hold your image
Component imagereal;
		// 3. use the "createImage()" method below to initialize your Component
imagereal=createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(imagereal);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer=JOptionPane.showInputDialog("What type of animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
if (answer.equalsIgnoreCase("dog")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
	
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(imagereal);
		// 10. find another image and create it (might take more than one line of code)
String image2="https://www.petfinder.com/wp-content/uploads/2012/11/91615172-find-a-lump-on-cats-skin-632x475.jpg";
Component imagereal2;
imagereal2=createImage(image2);
// 11. add the second image to the quiz window
quizWindow.add(imagereal2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer1=JOptionPane.showInputDialog("What type of animal is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (answer1.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
	
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





