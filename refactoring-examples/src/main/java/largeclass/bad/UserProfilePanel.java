package largeclass.bad;

import java.util.List;

public class UserProfilePanel {
    private String userName;
    private String userEmail;
    private String userAvatarUrl;
    private boolean isPremium;
    private boolean isVerified;
    private List<String> recentActivities;
    private int friendCount;
    private String location;
    private String joinDate;

    // Construtor
    public UserProfilePanel(
            String userName,
            String userEmail,
            String userAvatarUrl,
            boolean isPremium,
            boolean isVerified,
            List<String> recentActivities,
            int friendCount,
            String location,
            String joinDate) {
        // Inicializa todos os campos ...
    }

    public void render() {
        // do something
    }

    public void validate() {
        // do something
    }

    public void saveToDatabase() {
        // persist something
    }
    
    // outros metodos ...
}