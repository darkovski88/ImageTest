package com.imagetest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Petkovski on 22.03.2016.
 */
public class Datum {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("datetime")
    @Expose
    private Long datetime;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("cover_width")
    @Expose
    private Long coverWidth;
    @SerializedName("cover_height")
    @Expose
    private Long coverHeight;
    @SerializedName("account_url")
    @Expose
    private String accountUrl;
    @SerializedName("account_id")
    @Expose
    private Long accountId;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("views")
    @Expose
    private Long views;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("ups")
    @Expose
    private Long ups;
    @SerializedName("downs")
    @Expose
    private Long downs;
    @SerializedName("points")
    @Expose
    private Long points;
    @SerializedName("score")
    @Expose
    private Long score;
    @SerializedName("is_album")
    @Expose
    private Boolean isAlbum;
    @SerializedName("vote")
    @Expose
    private Object vote;
    @SerializedName("favorite")
    @Expose
    private Boolean favorite;
    @SerializedName("nsfw")
    @Expose
    private Boolean nsfw;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("comment_count")
    @Expose
    private Long commentCount;
    @SerializedName("comment_preview")
    @Expose
    private Object commentPreview;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("topic_id")
    @Expose
    private Long topicId;
    @SerializedName("images_count")
    @Expose
    private Long imagesCount;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("animated")
    @Expose
    private Boolean animated;
    @SerializedName("width")
    @Expose
    private Long width;
    @SerializedName("height")
    @Expose
    private Long height;
    @SerializedName("size")
    @Expose
    private Long size;
    @SerializedName("bandwidth")
    @Expose
    private Long bandwidth;
    @SerializedName("gifv")
    @Expose
    private String gifv;
    @SerializedName("webm")
    @Expose
    private String webm;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("looping")
    @Expose
    private Boolean looping;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * @return The datetime
     */
    public Long getDatetime() {
        return datetime;
    }

    /**
     * @param datetime The datetime
     */
    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    /**
     * @return The cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return The coverWidth
     */
    public Long getCoverWidth() {
        return coverWidth;
    }

    /**
     * @param coverWidth The cover_width
     */
    public void setCoverWidth(Long coverWidth) {
        this.coverWidth = coverWidth;
    }

    /**
     * @return The coverHeight
     */
    public Long getCoverHeight() {
        return coverHeight;
    }

    /**
     * @param coverHeight The cover_height
     */
    public void setCoverHeight(Long coverHeight) {
        this.coverHeight = coverHeight;
    }

    /**
     * @return The accountUrl
     */
    public String getAccountUrl() {
        return accountUrl;
    }

    /**
     * @param accountUrl The account_url
     */
    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    /**
     * @return The accountId
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * @param accountId The account_id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * @return The privacy
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * @param privacy The privacy
     */
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * @return The layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * @param layout The layout
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * @return The views
     */
    public Long getViews() {
        return views;
    }

    /**
     * @param views The views
     */
    public void setViews(Long views) {
        this.views = views;
    }

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return The ups
     */
    public Long getUps() {
        return ups;
    }

    /**
     * @param ups The ups
     */
    public void setUps(Long ups) {
        this.ups = ups;
    }

    /**
     * @return The downs
     */
    public Long getDowns() {
        return downs;
    }

    /**
     * @param downs The downs
     */
    public void setDowns(Long downs) {
        this.downs = downs;
    }

    /**
     * @return The points
     */
    public Long getPoints() {
        return points;
    }

    /**
     * @param points The points
     */
    public void setPoints(Long points) {
        this.points = points;
    }

    /**
     * @return The score
     */
    public Long getScore() {
        return score;
    }

    /**
     * @param score The score
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * @return The isAlbum
     */
    public Boolean getIsAlbum() {
        return isAlbum;
    }

    /**
     * @param isAlbum The is_album
     */
    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

    /**
     * @return The vote
     */
    public Object getVote() {
        return vote;
    }

    /**
     * @param vote The vote
     */
    public void setVote(Object vote) {
        this.vote = vote;
    }

    /**
     * @return The favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    /**
     * @param favorite The favorite
     */
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    /**
     * @return The nsfw
     */
    public Boolean getNsfw() {
        return nsfw;
    }

    /**
     * @param nsfw The nsfw
     */
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    /**
     * @return The section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section The section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return The commentCount
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount The comment_count
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * @return The commentPreview
     */
    public Object getCommentPreview() {
        return commentPreview;
    }

    /**
     * @param commentPreview The comment_preview
     */
    public void setCommentPreview(Object commentPreview) {
        this.commentPreview = commentPreview;
    }

    /**
     * @return The topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic The topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return The topicId
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * @param topicId The topic_id
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * @return The imagesCount
     */
    public Long getImagesCount() {
        return imagesCount;
    }

    /**
     * @param imagesCount The images_count
     */
    public void setImagesCount(Long imagesCount) {
        this.imagesCount = imagesCount;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The animated
     */
    public Boolean getAnimated() {
        return animated;
    }

    /**
     * @param animated The animated
     */
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    /**
     * @return The width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * @param width The width
     */
    public void setWidth(Long width) {
        this.width = width;
    }

    /**
     * @return The height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * @return The size
     */
    public Long getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * @return The bandwidth
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    /**
     * @param bandwidth The bandwidth
     */
    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * @return The gifv
     */
    public String getGifv() {
        return gifv;
    }

    /**
     * @param gifv The gifv
     */
    public void setGifv(String gifv) {
        this.gifv = gifv;
    }

    /**
     * @return The webm
     */
    public String getWebm() {
        return webm;
    }

    /**
     * @param webm The webm
     */
    public void setWebm(String webm) {
        this.webm = webm;
    }

    /**
     * @return The mp4
     */
    public String getMp4() {
        return mp4;
    }

    /**
     * @param mp4 The mp4
     */
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    /**
     * @return The looping
     */
    public Boolean getLooping() {
        return looping;
    }

    /**
     * @param looping The looping
     */
    public void setLooping(Boolean looping) {
        this.looping = looping;
    }


}
