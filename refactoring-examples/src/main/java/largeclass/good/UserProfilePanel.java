package largeclass.good;

public class UserProfilePanel {
    private UserProfileData data;
    private UserProfileRenderer renderer;
    private UserProfileValidator validator;

    // Construtor
    public UserProfilePanel ( UserProfileData data ) {
        this.data = data ;
        this.renderer = new UserProfileRenderer() ;
        this.validator = new UserProfileValidator() ;
    }

    public void display () {
        if (validator.validate(data)) {
            renderer.render(data);
        }
    }
}