public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "2132 223344";
        post.phone = "+79992938593";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 15;
        post.birthday.month = 12;
        post.birthday.year = 1993;
    }
}
