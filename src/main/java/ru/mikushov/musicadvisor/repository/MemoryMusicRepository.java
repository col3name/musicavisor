package ru.mikushov.musicadvisor.repository;

import ru.mikushov.musicadvisor.model.Music;

import java.util.ArrayList;
import java.util.List;

public class MemoryMusicRepository implements MusicRepository {
    private final List<Music> musicList = new ArrayList<>();

    public void add(Music music) {
        musicList.add(music);
    }

    public List<Music> getAll() {
        return musicList;
    }

    @Override
    public boolean isEmpty() {
        return musicList.isEmpty();
    }

}
