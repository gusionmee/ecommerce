package com.api.apiblog.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "post_tag", schema = "blogapi", catalog = "")
public class PostTagEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Object id;
    @Basic
    @Column(name = "post_id")
    private Object postId;
    @Basic
    @Column(name = "tag_id")
    private Object tagId;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getPostId() {
        return postId;
    }

    public void setPostId(Object postId) {
        this.postId = postId;
    }

    public Object getTagId() {
        return tagId;
    }

    public void setTagId(Object tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostTagEntity that = (PostTagEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(postId, that.postId) && Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postId, tagId);
    }
}
