package model;

public class BodyRenderer implements Renderer {
    @Override
    public String render(Message message) {
        return "<b>" + message.body + "</b>";
    }
}
