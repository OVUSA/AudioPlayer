public class ReadyState implements State{

    Player player;

    ReadyState(Player player){
        this.player = player;
    }
    @Override
    public String onLock() {
        player.changeState((new LockedState(player)));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.s
                player.changeState((new PlayingState(player)));
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
