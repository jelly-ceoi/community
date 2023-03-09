package com.kayuet.community.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String login; //name;
    private Long id;
    private String node_id; //bio;
    private String avatarUrl;

    @Override
    public String toString() {
        return "GithubUser{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", node_id'" + node_id + '\'' +
                '}';
    }
}
