public class PlayingState implements State{

    Player player;
    PlayingState(Player player){
        this.player = player;

    }

    @Override
    public String onLock() {

        return null;
    }

    @Override
    public String onPlay() {
       return null;
    }

    @Override
    public String onNext() {
        return null;
    }

    @Override
    public String onPrevious() {
        return null;
    }
}
