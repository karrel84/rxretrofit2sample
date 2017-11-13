
package bindservice.com.karrel.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserList {

    @SerializedName("login")
    @Expose
    public String login;
    @SerializedName("id")
    @Expose
    public int id;
    @SerializedName("avatar_url")
    @Expose
    public String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    public String gravatarId;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("html_url")
    @Expose
    public String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    public String followersUrl;
    @SerializedName("following_url")
    @Expose
    public String followingUrl;
    @SerializedName("gists_url")
    @Expose
    public String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    public String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    public String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    public String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    public String reposUrl;
    @SerializedName("events_url")
    @Expose
    public String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    public String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("site_admin")
    @Expose
    public boolean siteAdmin;
    @SerializedName("name")
    @Expose
    public Object name;
    @SerializedName("company")
    @Expose
    public Object company;
    @SerializedName("blog")
    @Expose
    public String blog;
    @SerializedName("location")
    @Expose
    public Object location;
    @SerializedName("email")
    @Expose
    public Object email;
    @SerializedName("hireable")
    @Expose
    public Object hireable;
    @SerializedName("bio")
    @Expose
    public Object bio;
    @SerializedName("public_repos")
    @Expose
    public int publicRepos;
    @SerializedName("public_gists")
    @Expose
    public int publicGists;
    @SerializedName("followers")
    @Expose
    public int followers;
    @SerializedName("following")
    @Expose
    public int following;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;

    @Override
    public String toString() {
        return "UserList{" +
                "avatarUrl='" + avatarUrl + '\'' +
                ", bio=" + bio +
                ", blog='" + blog + '\'' +
                ", company=" + company +
                ", createdAt='" + createdAt + '\'' +
                ", email=" + email +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", followers=" + followers +
                ", followersUrl='" + followersUrl + '\'' +
                ", following=" + following +
                ", followingUrl='" + followingUrl + '\'' +
                ", gistsUrl='" + gistsUrl + '\'' +
                ", gravatarId='" + gravatarId + '\'' +
                ", hireable=" + hireable +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", id=" + id +
                ", location=" + location +
                ", login='" + login + '\'' +
                ", name=" + name +
                ", organizationsUrl='" + organizationsUrl + '\'' +
                ", publicGists=" + publicGists +
                ", publicRepos=" + publicRepos +
                ", receivedEventsUrl='" + receivedEventsUrl + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", siteAdmin=" + siteAdmin +
                ", starredUrl='" + starredUrl + '\'' +
                ", subscriptionsUrl='" + subscriptionsUrl + '\'' +
                ", type='" + type + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
