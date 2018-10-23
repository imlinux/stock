package dsy.service;

import dsy.entity.Gdp;

import java.util.List;

/**
 * @author dong
 * @since 18-10-22
 */
public interface GdpService {

    List<Gdp> getGdpYear();

    Gdp getLatest();
}
