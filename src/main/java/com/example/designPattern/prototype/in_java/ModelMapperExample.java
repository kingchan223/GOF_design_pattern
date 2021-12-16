package com.example.designPattern.prototype.in_java;

import com.example.designPattern.prototype.before.GithubIssue;
import com.example.designPattern.prototype.before.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser("kingchan223");
        githubRepository.setName("design-pattern");

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("프록시 패턴에 대해서");

        /*위의 모든 데이터를 GithubIssueData에 모두 담고 싶다면?*/
        /*Model Mapper 라이브러리를 사용한다.*/
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData map = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(map);
    }
}
