package model;

public class HeaderRenderer implements Renderer {
    @Override
    public String render(Message message) {
        return "<h1>" + message.header + "</h1>";
    }
}
