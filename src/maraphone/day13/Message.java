package maraphone.day13;

import java.util.Date;

public class Message {
    private User sender;                    // отправитель
    private User receiver;                  // получатель
    private String text;                    // Содержимое сообщения
    private Date date;                      // Дата отправки сообщения

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return  "FROM: \t" + this.sender +"\n"+
                "TO: \t" + receiver +"\n"+
                "ON: \t" + date +"\n"+
                "Текст сообщения: \n" + text;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
