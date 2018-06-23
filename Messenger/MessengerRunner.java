package Messenger;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class MessengerRunner {
	public static void main(String []args) {
		Dialog dialog = new Dialog();
        Text textOne = new PlainText("Hello!");
        Text textTwo = new EmoticonText("winking-face");
        Text textThree = new PictureText("heart");
        Message messageOne = new Message("Henadii", LocalDateTime.now(), (Text) textOne);
        Message messageTwo = new Message("Henadii", LocalDateTime.now(),(Text) textTwo);
        Message messageThree = new Message("Mari", LocalDateTime.now(), (Text) textThree);
        dialog.addMessage(messageOne);
        dialog.addMessage(messageTwo);
        dialog.addMessage(messageThree);

        dialog.showDialog();
	}

}
