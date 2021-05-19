public class LockedState implements State {

    Player player;
    LockedState(Player player){
        this.player = player;
    }

    @Override
    public String onLock() {

        return null;
    }

    @Override
    public String onPlay() {
        player.changeState((new ReadyState(player)));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return null;
    }
}
