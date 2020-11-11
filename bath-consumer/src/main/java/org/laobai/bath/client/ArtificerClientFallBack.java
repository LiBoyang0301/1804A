package org.laobai.bath.client;

import org.laobai.bath.entity.Artificer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtificerClientFallBack implements ArtificerClient {
    @Override
    public Artificer getById(Long id) {
        Artificer artificer = new Artificer();
        artificer.setName("技师不存在啊");
        return artificer;
    }

    @Override
    public List<Artificer> list() {
        return null;
    }
}
