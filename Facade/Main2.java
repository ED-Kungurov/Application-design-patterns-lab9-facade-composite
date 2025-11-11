public class Main2 {
    public static void main(String[] args) {
        AudioSystem audioSystem = new AudioSystem();
        LightingSystem lightingSystem = new LightingSystem();
        VideoProjector videoProjector = new VideoProjector();
        HomeTheaterFacade facade = new HomeTheaterFacade(audioSystem, lightingSystem, videoProjector);
        facade.diagnostic();
        System.out.println(" ");
        facade.Presentation();
        System.out.println(" ");
        facade.film("Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb | realno krutoi film");
    }
}
