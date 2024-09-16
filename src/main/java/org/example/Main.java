
public class Main {
    public static void main(String[] args){
        Post post = new Post();
        post.name = "Иван";
        post.passport = "3333 444444";
        post.patronic = "Сергеевич";
        post.phone = "12345678";
        post.surname = "Петров";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 15;
        post.birthday.month = 10;
        post.birthday.year = 1990;


    }

}