package model;

public class FooterRenderer implements Renderer {
    @Override
    public String render(Message message) {
        return "<i>" + message.footer + "</i>";
    }
}
