package day13;

import java.util.*;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();
    public static void sendMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }
    public static List<Message> getMessages(){
        return messages;
    }
    public static void showDialog(User u1, User u2){
        for(Message message:  MessageDatabase.getMessages()){
            if(message.getSender().getUsername().equals(u1.getUsername()) && message.getReceiver().getUsername().equals(u2.getUsername()))
                System.out.println(message.getSender().getUsername()+": "+message.getText());
            if(message.getSender().getUsername().equals(u2.getUsername())&&message.getReceiver().getUsername().equals(u1.getUsername()))
                System.out.println(message.getSender().getUsername()+": "+message.getText());
        }
    }
}
/*
Поля:
- Статическое поле “сообщения” (англ. messages ), которое будет хранить список
из сообщений (объектов класса Message ). Это поле должно
инициализироваться пустым списком. Этот список и есть наша условная “база
данных”, которая хранит все сообщения в соц. сети.
Конструктор:
Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все
методы и поля статические).
Методы:
- public static void sendMessage(User u1, User u2, String text)
- этот метод “отправляет” новое сообщение от пользователя u1 пользователю
u2 с текстом text . Отправка в нашем контексте означает добавление
сообщения в нашу “базу данных”.
- public static List<Message> getMessages() - возвращает список всех
сообщений в “базе данных”.
- public static void showDialog(User u1, User u2) - этот метод
должен вывести цепочку сообщений (диалог) пользователей u1 и u2 . Формат
вывода должен быть таким:
user1: Привет!
user2: Привет, user1!
user1: Как у тебя дела?
user2: Все ок, спасибо :)
* У вас могут быть любые другие сообщения. Где user1 и user2 - имена
пользователей u1 и u2 .
 */