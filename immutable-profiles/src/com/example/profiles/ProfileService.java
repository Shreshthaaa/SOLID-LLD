package com.example.profiles;

public class ProfileService {
    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile withDisplayName(UserProfile base, String displayName) {
        return new UserProfile.Builder(base.getId(), base.getEmail())
                .phone(base.getPhone())
                .address(base.getAddress())
                .marketingOptIn(base.isMarketingOptIn())
                .twitter(base.getTwitter())
                .github(base.getGithub())
                .displayName(displayName)
                .build();
    }
}
