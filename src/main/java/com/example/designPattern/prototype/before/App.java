package com.example.designPattern.prototype.before;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("kingchan223");
        repository.setName("design-pattern");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("프록시 패턴에 대해서");
        String url = githubIssue.getUrl();
        System.out.println(url);

        /* 기존의 issue 객체 clone */
        GithubIssue clone = (GithubIssue)githubIssue.clone();
        System.out.println(clone.getUrl());
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println("clone.getGithubRepository() == clone.getGithubRepository():"+(clone.getGithubRepository() == clone.getGithubRepository()));
    }
}


        /*
        * clone != githubIssue  : clone과 githubIssue 객체는 다른 객체이다. clone을 하면 새로운 객체 만들어짐
        * clone.equals(githubIssue)  : True.  래퍼런스는 다르지만 안에있는 내용은 같기에 equals()를 하면 true가 나온다.
        * */




