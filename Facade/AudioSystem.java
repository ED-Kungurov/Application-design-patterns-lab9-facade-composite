public class AudioSystem {
    public void connection(String way){
        System.out.println("System is connected trough " + way);
    }
    void setVolume(int vol){
        System.out.println("Volume is set to " + vol);
    }
    void play(String name){
        System.out.println("Playing " + name);
    }
    void on(){
        System.out.println("AudioSystem is on");
    }
    void off(){
        System.out.println("AudioSystem is off");
    }
    void diagnostic(){
        System.out.println("AudioSystem is ok");
    }
}
