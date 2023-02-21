package ru.netology.api;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = 1234_123456;
        post.phone = 1111111111;
        post.subscription = true;
        post.birthday = new FormDate();
            post.birthday.day = 13;
            post.birthday.month = 6;
            post.birthday.year = 1986;
    }
}