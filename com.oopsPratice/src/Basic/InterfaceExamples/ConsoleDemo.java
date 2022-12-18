package Basic.InterfaceExamples;

public class ConsoleDemo {

	public static void main(String[] args) {
		// Buy playstation console

		Console ps4Console = new PlayStationConsole();
		// Buy playstation

		VideoGame pS4 = new PlayStation("Sony", "500GB");
		pS4.insertGame("God of War-2");
		pS4.pairConsole(ps4Console);
		pS4.play();

	}

}

interface Console {
	void type(); // wire or wireless

	void button();

	void rotateButton();

	void serialNumber();
	

}

class PlayStationConsole implements Console {
	@Override
	public void type() {
		System.out.println("Wireless - PlayStation");
	}

	@Override
	public void button() {
		System.out.println("18- Buttons - PlayStation ");
	}

	@Override
	public void rotateButton() {
		System.out.println("360- Rotate Button X-2 - PlayStation");
	}

	@Override
	public void serialNumber() {
		System.out.println("PS-4");
	}

	

}

/*
 * class XboxConsole implements Console{
 * 
 * }
 */
abstract class VideoGame {
	private String videoGameName;
	private String storage;
	private boolean consolePairStatus;
	private boolean gameLoadStatus;

	public boolean isGameLoadStatus() {
		return gameLoadStatus;
	}

	public void setGameLoadStatus(boolean gameLoadStatus) {
		this.gameLoadStatus = gameLoadStatus;
	}

	// Constructor
	public VideoGame(String videoGameConsoleName, String storage) {
		this.videoGameName = videoGameConsoleName;
		this.storage = storage;
	}

	void setConsolePairStatus(boolean s) {
		consolePairStatus = s;
	}

	boolean getConsolePairStatus() {
		return consolePairStatus;

	}

	// Methods
	//abstract void display();
	abstract void play();

	abstract void insertGame(String gameName);

	abstract void pairConsole(Console c);
}

/************ CONSOLE ***************/
class PlayStation extends VideoGame {

	// PlayStationConsole playStationConsole;

	public PlayStation(String videoGameConsoleName, String storage) {
		super(videoGameConsoleName, storage);
	}

	@Override
	void insertGame(String gameName) {
		super.setGameLoadStatus(true);
		System.out.println(gameName + "  Game Load Successfully!!!");

	}

	@Override
	void play() {
//		System.out.println("console status : " + getConsolePairStatus());
//		System.out.println("console status : " + getConsolePairStatus());
		if (getConsolePairStatus() && getConsolePairStatus()) {
			System.out.println("Game Starts !! Goood Luck!!!");
		} else {
			System.out.println("Game not Starts, cause : something missing");
		}
	}

	@Override
	void pairConsole(Console c) {

		if (c instanceof PlayStationConsole) {
			super.setConsolePairStatus(true);
			System.out.println("Console Paired Successful");
		} else {
			super.setConsolePairStatus(false);
			System.out.println("Console not Paired ");
		}
	}
	
}
