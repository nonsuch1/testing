package model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MessageRendererTest {

    @Test
    public void messageRenderer_uses_correct_subRenderers() {
        MessageRenderer sut = new MessageRenderer();
        List<Renderer> renderers = sut.subRenderers;

        assertEquals(3, renderers.size());
        assertTrue(renderers.get(0) instanceof HeaderRenderer);
        assertTrue(renderers.get(1) instanceof BodyRenderer);
        assertTrue(renderers.get(2) instanceof FooterRenderer);
    }

    @Test
    public void rendering_a_message() {
        MessageRenderer sut = new MessageRenderer();
        Message message = new Message("h", "b", "f");

        String html = sut.render(message);

        assertEquals("<h1>h</h1><b>b</b><i>f</i>", html);
    }
}