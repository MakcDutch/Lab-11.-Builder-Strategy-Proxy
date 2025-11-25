public class Main {
    public static void main(String[] args) {
        // Task 1: User Builder
        User user = User.builder()
                .name("Oles")
                .age(32)
                .gender(Gender.MALE)
                .weight(80)
                .occupation("Developer")
                .occupation("Teacher")
                .build();
        System.out.println(user);

        // Task 2: Mail System
        MailBox mailBox = new MailBox();
        Client client = new Client("Oles", 32, Gender.MALE);
        mailBox.addMailInfo(new MailInfo(client, c -> "Happy Birthday " + c.getName()));
        mailBox.sendAll();

        // Task 3: Proxy Image
        MyImage image = new ProxyImage("test.jpg");
        // Картинка не завантажується тут
        image.display(); // Картинка завантажується і показується тільки тут
    }
}