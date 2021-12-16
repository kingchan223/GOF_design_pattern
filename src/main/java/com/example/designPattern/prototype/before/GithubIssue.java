package com.example.designPattern.prototype.before;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class GithubIssue implements Cloneable{
    private int id;
    private String title;
    private String url;
    private GithubRepository githubRepository;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    public String getUrl() {
        return "http://github.com/"+githubRepository.getUser()+"/"+githubRepository.getName()+"/issue/"+getId();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {//deep copy를 하는 clone()
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.githubRepository.getUser());
        repository.setName(this.getGithubRepository().getName());

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);
        return githubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return getId() == that.getId() &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getUrl(), that.getUrl()) &&
                Objects.equals(getGithubRepository(), that.getGithubRepository());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getUrl(), getGithubRepository());
    }
}
