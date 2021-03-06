// Locked is stop state

public class LockedState implements State {

    Player player;
    LockedState(Player player){
        this.player = player;
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if(player.isPlaying()){
            player.changeState(new ReadyState(player));
            return "Stop playing";
        }else {
           return "Locked..";
        }
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
        return "Locked...";
    }
}
