package com.example.designPattern.prototype.in_java;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
/* GithubIssue와 GithubRepository의 모든 데이터가 들어가 있는 객체*/
public class GithubIssueData {
    private int id;
    private String title;
    private String repositoryUser;
    private String repositoryName;

}
