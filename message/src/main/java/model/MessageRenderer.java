package model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class MessageRenderer implements Renderer {
    public List<Renderer> subRenderers;

    public MessageRenderer() {
        subRenderers = List.of(new HeaderRenderer(),
                new BodyRenderer(),
                new FooterRenderer());
    }

    @Override
    public String render(Message message) {
        return subRenderers
                .stream()
                .map(x -> x.render(message))
                .collect(Collectors.joining());
    }
}
