package org.laobai.bath.service;

import org.laobai.bath.entity.Artificer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiusan
 * @since 2020-11-06
 */
public interface ArtificerService {
    List<Artificer> list();

    Artificer getById(Long id);
}
