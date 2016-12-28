package gamelogic;

public interface IPlayerHandler {

	public Move getMove();

	public void moveSuccessfullyExecuted(Move move);
}
