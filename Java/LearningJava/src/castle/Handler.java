package castle;

public class Handler {
	Game game;
	protected Handler(Game game) {
		this.game = game;
	}
	public void doCmd(String word) {}
	public boolean isBye() {return false;}

}
