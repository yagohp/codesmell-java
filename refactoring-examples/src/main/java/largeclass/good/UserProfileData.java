package largeclass.good;

public class UserProfileData {
    private String name;
    private String email;
    private String avatarUrl ;
    private boolean isPremium ;
    private boolean isVerified ;
    // outros campos ...

    public static class Builder {
        private String name;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public UserProfileData build() {
            return new UserProfileData(this);
        }
    }

    private UserProfileData(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
    }
}
