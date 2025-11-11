public class HomeTheaterFacade {
    AudioSystem audioSystem;
    LightingSystem lightingSystem;
    VideoProjector videoProjector;
    public HomeTheaterFacade(AudioSystem audioSystem, LightingSystem lightingSystem, VideoProjector videoProjector) {
        this.audioSystem = audioSystem;
        this.lightingSystem = lightingSystem;
        this.videoProjector = videoProjector;
    }
    void Presentation(){
        lightingSystem.on();
        videoProjector.on();
        videoProjector.calibrate();
        videoProjector.play("presentation");
        lightingSystem.setLightningLevel(30);
    }
    void diagnostic(){
        lightingSystem.on();
        audioSystem.on();
        videoProjector.on();
        lightingSystem.diagnostic();
        audioSystem.diagnostic();
        videoProjector.diagnostic();
    }
    void film(String film){
        lightingSystem.on();
        audioSystem.on();
        videoProjector.on();
        lightingSystem.setLightningLevel(5);
        audioSystem.setVolume(50);
        videoProjector.calibrate();
        videoProjector.play(film);
    }
}
